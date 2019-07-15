package de.dhbw.ravensburg.SearchTree;

import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Interface.Sortable;

import java.awt.*;


public class Suchbaum<T extends Comparable>extends Sortable implements List<T> {

    /**
     * Attribute
     */
    SuchbaumElement first;
    Comparable[] output;

    /**
     * Constructor which defines an End of the List
     */
    public Suchbaum() {
        this.first = null;
    }


    /**
     * checks if the list is empty
     *
     * @return the method to the first element of the list
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * checks the size of the list
     *
     * @return the method to the first element of the list
     */
    public int size() {
        return first.length();
    }

    /**
     * add an element to the list
     *
     * @param content
     */
    public void addElement(T content) {
        if (first == null) {
            first = new SuchbaumElement(content);
        } else {
            first = first.addElement(new SuchbaumElement(content));
        }
    }

    /**
     * deletes every element
     */
    public void removeAll() {
        first = null;
    }

    /**
     * checks if the element is contained in the list
     *
     * @param content
     * @return the method to the first element in the list
     */
    public boolean contains(Comparable content) {
        if(first != null)
        return first.contains(content);
        return false;
    }

    /**
     * delete the certain object
     *
     * @param content
     */
    public void removeCertain(Comparable content) {
        first.removeCertain(content);
    }

    /**
     * add every element of the list to an array
     *
     * @return the new array
     */
    public Comparable[] returnAsArray() {
        output = new Comparable[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = First();
            removeCertain(First());
        }
        return output;
    }

    /**
     * read the first element in the list
     *
     * @return the content of the firnst element in the list
     */
    public Comparable First() {
        return first.getValue();
    }


}
