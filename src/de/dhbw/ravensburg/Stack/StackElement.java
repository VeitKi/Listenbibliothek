package de.dhbw.ravensburg.Stack;

public class StackElement<T> {

    public Comparable value;
    public StackElement next;

    public Comparable getValue(){

        return this.value;
    }

    public void setValue(Comparable value){

        this.value = value;
    }

    public StackElement<T> getNext(){

        return this.next;
    }

    public void setNext(StackElement next){

        this.next = next;
    }
}
