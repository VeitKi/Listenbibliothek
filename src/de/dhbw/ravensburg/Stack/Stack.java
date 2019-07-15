package de.dhbw.ravensburg.Stack;

import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Interface.Sortable;
import de.dhbw.ravensburg.LinkedList.LinkedList;

import java.util.NoSuchElementException;

public class Stack<T extends Comparable>extends Sortable implements List<T> {


    /**
     * defining parameters
     */

    //size of the stack
    private int currentHigh = 0;

    //"Head" of the stack
    LinkedList embeddedList = new LinkedList();

    public void addElementAt(int Index, T content) {
        embeddedList.addElementAt(Index, content);
    }

    public void removeCertain(T element) {
        embeddedList.removeCertain(element);
    }

    public T getElementAt(int Index) {
        return (T) embeddedList.getElementAt(Index);
    }

    /**
     * @return if the stack is Empty or has elements
     */
    public boolean isEmpty() {
        return embeddedList.isEmpty();
    }

    //adds an element
    public void addElement(T element) {
        push(element);
    }

    /**
     * adding an element to the stack on last place.
     *
     * @param value element which we want to add into the stack
     */
    public void push(T value) {
        embeddedList.addElementAt(0, value);
        //size grows
        currentHigh++;

    }


    /**
     * remove all elements, the stack has to be empty
     */
    public void removeAll() {

        embeddedList = new LinkedList();
    }

    /**
     * how many element has the stack?
     *
     * @return the size of the stack
     */
    public int size() {

        return currentHigh;
    }


    /**
     * returns the highest element and delete it from the stack
     *
     * @return the highest element of the stack
     */
    public Comparable pop() {
        Comparable content = embeddedList.getElementAt(size()-1);
        embeddedList.deleteAt(size()-1);
        currentHigh--;
        return content;
    }


    /**
     * returns the highest element
     *
     * @return the highest element
     */
    public Comparable peek() {

        return embeddedList.getElementAt(size()-1);
    }


    /**
     * check if the stack contains our inputValue
     *
     * @param inputValue value we want to check if it is in the stack
     * @return if the stack contains the element
     */
    public boolean contains(T inputValue) {
        return embeddedList.contains(inputValue);
    }

    /**
     * puts the elements of the stack into an array
     *
     * @return the stack as an array
     */
    public Object[] returnAsArray() {

        return embeddedList.returnAsArray();
    }
}

