package de.dhbw.ravensburg.LinkedList;

public class LinkedListElement <T> {

    private T value;
    private LinkedListElement <T> next;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public LinkedListElement<T> getNext() {
        return next;
    }
    public void setNext(LinkedListElement<T> next) {
        this.next = next;
    }

}
