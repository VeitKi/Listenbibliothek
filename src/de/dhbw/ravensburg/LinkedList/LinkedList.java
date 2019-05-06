package de.dhbw.ravensburg.LinkedList;

import de.dhbw.ravensburg.Interface.List;

public class LinkedList implements List{


    @Override
    public boolean isEmpty() {
        
         if (variable == null) {
                return true;
            }
            else {
                return false;
            }
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

    @Override
    public String toString() {
        return null;
    }
}
