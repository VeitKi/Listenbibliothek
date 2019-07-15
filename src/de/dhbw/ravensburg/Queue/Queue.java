package de.dhbw.ravensburg.Queue;

import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Interface.Sortable;
import de.dhbw.ravensburg.LinkedList.LinkedList;

import java.lang.reflect.Array;

public class Queue <T extends Comparable>extends Sortable implements List<T> {

    private LinkedList embeddedList;


    public Queue()
    {
        embeddedList = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        return embeddedList.isEmpty();
    }

    @Override
    public int size() {
        return embeddedList.size();
    }

    @Override
    public void addElement(T value){
        embeddedList.addElement(value);
    }

    @Override
    public void removeAll()
    {
        embeddedList.removeAll();
    }

    @Override
    public boolean contains(T value) {

        for(int i=0; i<=size();i++ ){
            if(embeddedList.getElementAt(i) == value){
                return true;
            }
        }
        return false;
    }


    @Override
    public void removeCertain(T value) {

    }


    @Override
    public Object[] returnAsArray() {
        return embeddedList.returnAsArray();
    }



    //Speziell für Queue:

    /**
     * Gives first element of the list
     * @return returns first element
     */
    public T peek(){

        return (T) embeddedList.getElementAt(0);
    }

    /**
     * Gives first element of the list and deletes it
     * @return returns first element
     */
    public T enqueue(){
        T value = (T) embeddedList.getElementAt(0);
        embeddedList.removeCertain(value);
        return value;

    }
}
