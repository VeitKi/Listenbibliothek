package de.dhbw.ravensburg.Queue;

import de.dhbw.ravensburg.Interface.List;

public class Queue implements List {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addElement(Object value) {

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
    public Object[] returnAsArray() {
        return new Object[0];
    }
}
