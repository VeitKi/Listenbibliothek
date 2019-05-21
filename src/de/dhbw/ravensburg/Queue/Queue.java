package de.dhbw.ravensburg.Queue;

import de.dhbw.ravensburg.Interface.List;

import java.lang.reflect.Array;

public class Queue <T extends Comparable> implements List<T> {

    QueueElement firstElement;
    QueueElement lastElement;

    @Override
    public boolean isEmpty() {
        return firstElement ==  null;
    }

    @Override
    public int size() {
        return firstElement.count();
    }

    @Override
    public void addElement(T value){
        if(this.isEmpty()) {
            firstElement = new QueueElement(value);
            lastElement = firstElement;
        } else {
            lastElement = lastElement.setNext(value);
        }
    }

    @Override
    public void addOtherList(List list) {

        for(int i=0; i<=size();i++){
            lastElement = lastElement.setNext(list.getElement(i));
        }
    }

    @Override
    public void removeAll() {

            lastElement = null;
            firstElement = null;
    }

    @Override
    public boolean contains(T value) {

        for(int i=0; i<=size();i++ ){
            if(getElement(i) == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(List list) {

        for(int i=0; i<=size();i++ ){
            if(!this.contains((T)list.getElement(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public void removeCertain(T value) {

    }

    @Override
    public Object[] returnAsArray() {
        Object[] array = new Object[size()];
        for(int i=0; i<=size();i++){
            array[i] = (Object) this.getElement(i);
        }
        return array;
    }

    @Override
    public void addElementAt(Comparable value, int i) {

    }

    @Override
    public T getElement(int i) {
        return (T) firstElement.getElement(i);
    }

    /**
     * Gives first element of the list
     * @return returns first element
     */
    public T returnFirst(){

        return (T)firstElement;
    }

    /**
     * Gives first element of the list and deletes it
     * @return returns first element
     */
    public T returnFirstAndDelete(){

        T first = (T)firstElement;
        firstElement = null;

        return first;

    }
}
