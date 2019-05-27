package de.dhbw.ravensburg.Stack;

import java.util.NoSuchElementException;

public class Stack<T> implements List {



    //Stack aufbauen
    private int currentHigh = 0;
    StackElement<T> highestElement = null;
    Stack<String> stack = new Stack<>();


    @Override
    public boolean isEmpty() {

        if (highestElement == null) {

            return true;
        } else {

            return false;
        }

    }

    @Override

    /**
     *
     */

    //Fügt ein Element hinzu
    public void push(Comparable value) {
        StackElement<T> newElement = new StackElement<T>();
        newElement.setValue(value);
        newElement.setNext(highestElement);
        highestElement = newElement;
        currentHigh++;

    }


    @Override
    public void removeAll() {

        highestElement=null;

        }



    public int size() {

        return currentHigh;
    }

    //Das oberste Element wird ausgegeben und anschließend gelöscht

    public Comparable pop() {

        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        } else {

            currentHigh--;
            Comparable value = highestElement.getValue();
            highestElement = highestElement.getNext();
            return value;

        }
    }

    // Das oberste Element wird angezeigt
    public StackElement peek() {

        return highestElement;

    }

    @Override

    public boolean contains(T inputValue){
        return contains(highestElement,inputValue);
    }

    private boolean contains(StackElement<T> stackElement,T inputValue)
    {
        if(stackElement == null)
            return false;

        if(stackElement.getValue().equals(inputValue))
            return true;

        return contains(stackElement.next,inputValue);
    }



    @Override
    public Comparable[] returnAsArray() {

        Comparable[] array = new Comparable[size()];

        for (int i=size(); 0< i; i--) {

            array[i] = this.pop();

        }


        return array;
    }
}
