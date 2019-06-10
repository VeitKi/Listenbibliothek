package de.dhbw.ravensburg.Stack;

import java.util.NoSuchElementException;

public class Stack<T> implements List {


	/**
	 * defining parameters
	 */
	
	//size from the stack
	private int currentHigh = 0;
	
	//"Head" of the stack
    StackElement<T> highestElement = null;



 
    /**
     * 
     * @return if the stack is Empty or has elements
     */
    public boolean isEmpty() {

        if (highestElement == null) {

            return true;
        } else {

            return false;
        }

    }

    
    //adds an element
    /**
     * adding an element to the stack
     * @param value element which we want to add into the stack
     */
    public void push(Comparable value) {
        StackElement<T> newElement = new StackElement<T>();
        newElement.setValue(value);
        newElement.setNext(highestElement);
        highestElement = newElement;
        
        //size grows
        currentHigh++;

    }


    /**
     * remove all elements, the stack has to be empty
     */
    public void removeAll() {

        highestElement=null;

        }
    
    /**
     * how many element has the stack?
     * @return the size of the stack
     */
    public int size() {

        return currentHigh;
    }

    
    /**
     * returns the highest element and delete it from the stack
     * @return the highest element of the stack
     */
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
    
    

    /**
     * returns the highest element
     * @return the highest element
     */
    public Comparable peek(){
    	
    	if(highestElement==null) {
    		
    		return null;
    	}
    	else {
        Comparable value = highestElement.getValue();
        return value;
    }
    }

    
    /**
     * check if the stack contains our inputValue
     * @param inputValue value we want to check if it is in the stack
     * @return if the stack contains the element
     */
    public boolean contains(T inputValue){
        return contains(highestElement,inputValue);
    }
    /**
     * check if the stack contains out inputValue from method contains(T inputValue)
     * @param stackElement element that is actually checked
     * @param inputValue value we want to check if it is in the stack
     * @return if the stack contains the element or the next stack element that has to be checked
     */
    private boolean contains(StackElement<T> stackElement,T inputValue)
    {
        if(stackElement == null)
            return false;

        if(stackElement.getValue().equals(inputValue))
            return true;

        return contains(stackElement.next,inputValue);
    }




    /**
     * puts the elements of the stack into an array
     * @return the stack as an array
     */
    public Comparable[] returnAsArray() {

        Comparable[] array = new Comparable[size()];

        for (int i=size(); 0< i; i--) {

            array[i] = this.pop();

        }

        return array;
    }
}

