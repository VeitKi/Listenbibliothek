package de.dhbw.ravensburg.Set;

import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Interface.Sortable;
import de.dhbw.ravensburg.LinkedList.LinkedList;

public class Set  <T extends Comparable>extends Sortable implements List<T> {

    /**
     *Attribute
     */
    LinkedList embeddedList;
    Object[] output;

    /**
     * Konstructor which defines an End of the List
     */
    public Set() {
        embeddedList = new LinkedList();
    }


    /**
     * checks if the list is empty
     * @return the method to the first element of the list
     */
    public boolean isEmpty() {
        return embeddedList.isEmpty();
    }

    /**
     * checks the size of the list
     * @return the method to the first element of the list
     */
    public int size() {
        return embeddedList.size();
    }

    /**
     * add an element to the list if it does not already exist there
     * @param content
     */
    public void addElement(T content) throws IllegalArgumentException {
        if (!contains (content)) {
            embeddedList.addElement(content);
        }
        else {
            throw new IllegalArgumentException("Element ist schon im Set vorhanden.");
        }
    }

    /**
     * deletes every element
     */
    public void removeAll() {
        embeddedList.removeAll();
    }

    /**
     * checks if the element is contained in the list
     * @param content
     * @return the method to the first element in the list
     */
    public boolean contains(Comparable content) {
        return embeddedList.contains(content);
    }

    /**
     * delete the certain object
     * @param content
     */
    public void removeCertain(T content) {
        embeddedList.removeCertain(content);
    }

    /**
     * add every element of the list to an array
     * @return the new array
     */
    public Object[] returnAsArray() {
        output = new Object[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = (Object) embeddedList.getElementAt(i);
        } return output;
    }

    /**
     * read the first element in the list
     * @return the content of the first element in the list
     */
    public T First() {
        return (T) embeddedList.getElementAt(0);
    }


    /**
     * change the element or the content of the element at the defined index only if the new one doesn't already exist; Exception should be handled in runtime!
     * @param Index
     * @param content
     */
    public void change(int Index, T content) throws IllegalArgumentException {
        if (!contains (content)) {
            embeddedList.change(Index, content);
        } else {
            throw new IllegalArgumentException("New element alredy in the Set");
        }
    }

    /**
     * searchs the index of an element with a defined content
     * @param content
     * @return the index of the element with the defined content
     */
    public int getElementIndex(T content) {
        return embeddedList.getElementIndex(content);
    }

    /**
     * The method adds one Set to another an at the end there are no duplicates
     * @param other the set with which one I want to make the union
     * @return the two sets unied into one
     */
    public Set union (Set other) {
        Set returnset = new Set();
        returnset = this;
        for(int i = 0; i<other.size();i++) {
            if(this.contains(other.First())){
                returnset.addElement(other.First());
            }
            other.removeCertain(other.First());
        }
        return returnset;
    }

    /**
     * We make a set in which are only things which have also been in the other one
     * @param other the other set with which one we make the intersection
     * @return A set where are the objects which have been in both sets before inside
     */
    public Set intersection (Set other) {
        Set returnset = new Set();
        for(int i = 0; i<other.size() ; i++){
            if (this.contains(other.First())){
                returnset.addElement(other.First());
            }
            other.removeCertain(other.First());
        }
        return returnset;
    }

    /**
     * We delete the objects of our first set which are also in the other one and return then what is over
     * @param other the set which is the subtracted one
     * @return returns us a set with only the objects inside, which have not been in the other one, but in this.
     */
    public Set difference (Set other) {
        Set returnset = this;
        Set intersectionset = this.intersection(other);
        for (int i = 0; i<intersectionset.size() ; i++){
            returnset.removeCertain(intersectionset.First());
            intersectionset.removeCertain(First());
        }
        return returnset;
    }

    /**
     * Gives us a Set back where are all Objects which have been in one of the Sets but not in both
     * @param other the set I check about duplicates to the first set
     * @return a set where are added the difference from this-other and other-this
     */
    public Set symmetricDif (Set other) {
        Set returnset = this.difference(other);
        Set secondset = this.difference(other);

        for(int i = 0;i<secondset.size();i++)
        {
            try{
                returnset.addElement(secondset.First());
                secondset.removeCertain(First());}
            catch(Exception e){}
        }

        return returnset;
    }

    /**
     * Gives us a string with all objects of our set
     * @return the described string from above
     */
    public String toString () {
        String teststring = "";
        Set testset = this;
        for (int i=0; i<testset.size();i++) {
            teststring = teststring + " " + testset.First().toString();
            testset.removeCertain(First());
        }
        return teststring;
    }
}