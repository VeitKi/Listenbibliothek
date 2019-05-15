package de.dhbw.ravensburg.Queue;

import de.dhbw.ravensburg.Interface.List;

public class Queue implements List {

    QueueElement firstElement;
    QueueElement lastElement;

    @Override
    public boolean isEmpty() {

        return firstElement ==  null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addElement(QueueElement element) {
        if(this.isEmpty()) {
            firstElement = element;
            lastElement = element;
        } else {
            lastElement.setNext(element);
            lastElement = element;
        }
    }

    @Override
    public void addOtherList(List list) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public boolean containsAll(List list) {
        return false;
    }

    @Override
    public void removeCertain(Object value) {

    }

    @Override
    public T[] returnAsArray() {
        return new T[];
    }

    @Override
    public void addElement(Comparable value) {

    }

    @Override
    public void addElementAt(Comparable value, int i) {

    }

    @Override
    public boolean contains(Comparable value) {
        return false;
    }

    @Override
    public void removeCertain(Comparable value) {

    }

    @Override
    public Comparable getElement(int i) {
        return null;
    }
}
