package de.dhbw.ravensburg.SearchTree;

import de.dhbw.ravensburg.Interface.List;

import java.util.*;

public class SuchbaumElement {

    /**
     * getting a value
     *
     * @ the value
     */
    public Comparable getValue() {
        return value;
    }

    /**
     * setting a value
     *
     * @param value
     */
    public void setValue(Comparable value) {
        this.value = value;
    }

    /**
     * Attributes
     */
    private Comparable value;
    private SuchbaumElement left;
    private SuchbaumElement right;

    /**
     * Konstruktor for element
     *
     * @param value of element
     */
    public SuchbaumElement(Comparable value) {
        this.value = value;
        left = null;
        right = null;
    }

    /**
     * adds a new Element if it is smaller on the left, if its bigger on the right
     *
     * @param se Suchbaumelement which should be added
     */
    public SuchbaumElement addElement(SuchbaumElement se) {
        if (this.value.compareTo(se.value) < 0) {
            if (left == null){
                left = se;
                return this;
            }
            else{
                left = left.addElement(se);
                return this;
            }

            } else {
            if (right == null)
            {
                right = se;
                return this;
            }
            else{
                right = right.addElement(se);
                return this;
            }
        }
    }

    /**
     * gives us the length of the longest branch
     *
     * @return the length of the longest branch
     */
    public int length() {
        int i = 0;
        if (left == null) {
            if (right == null) {
                i = 0;
            } else {
                i = right.length();
            }
        } else {
            if (right == null) {
                i = 0;
                i = left.length();
            } else {
                i = right.length();
                i = i + left.length();
            }
        }
        return i + 1;
    }

    /**
     * checks if the content is in the Suchbaum
     *
     * @param content
     * @return true or false
     */
    public boolean contains(Comparable content) {
        if (this.value == content) {
            return true;
        } else {
            if (left != null) {
                if (left.contains(content) == true) {
                    return true;
                } else if (right != null) {
                    if (right.contains(content) == true) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /**
     * removes an Element and cares about the structured order after removing
     *
     * @param value the value i want to remove
     * @return
     */
    public SuchbaumElement removeCertain(Comparable value) {
        if (this.value == value) {
            if (left == null) {
                if (right == null) {
                    return null;
                }
                return right;
            }else{
                    if(right == null){
                        return left;}
                    else{
                    SuchbaumElement replacement = getReplacement();
                    right = right.removeLeft(); //Replacement entfernen.
                    //rechten  Pfad von replacement umsetzen auf den ursprünglichen Vorgänger von replacement (wenn Pfad vorhanden)
                    if(replacement.right != null)
                    {
                        SuchbaumElement secondLeft = getReplacement();
                        secondLeft.left = replacement.right;
                    }
                    replacement.right = this.right;
                    replacement.left = this.left;
                    return replacement;
                }

            }

        } else {
            if (right != null)
                right = right.removeCertain(value);
            if (left != null)
                left = left.removeCertain(value);
            return this;
        }
    }

    private SuchbaumElement getReplacement()
    {
        return right.getLeft();
    }

    private SuchbaumElement getLeft()
    {
        if(left == null)
            return this;
        return left.getLeft();
    }

    private SuchbaumElement removeLeft()
    {
        if(left == null)
            return null;
        left = left.getLeft();
        return this;
    }
}

