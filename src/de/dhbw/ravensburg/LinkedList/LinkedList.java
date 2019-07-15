package de.dhbw.ravensburg.LinkedList;
import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Interface.Sortable;

import java.security.spec.ECField;

public class LinkedList <T extends Comparable> extends Sortable implements List<T>{

    /**Attribute
     *
     */
    LinkedListElement first;
    Object[] output;

    /**
     * Constructor instantiatesm the end of the List
     */
    public LinkedList() {
        this.first = new Finish(null);
    }


    /**
     * checks if the list is empty
     * @return the method to the first element of the list
     */
    public boolean isEmpty() {
            return first.isEmpty();

    }

    /**
     * checks the size of the list (the finish doesn't count)
     * @return the method to the first element of the list
     */
    public int size() {

            return first.length();

    }

    /**
     * add an element to the list (default at the end)
     * @param content
     */
    public void addElement(T content) {
        first = first.addElement(new LinkedListElement(content));
    }


    /**
     * deletes every element
     */
    public void removeAll() {
        first = new Finish(null);
    }

    /**
     * checks if the element is contained in the list
     * @param content
     * @return the mehtod to the first element in the list
     */
    public boolean contains(T content) {
        return first.contains(content);
    }

    /**
     * delete the certain object
     * @param content
     */
    public void removeCertain(T content) {
            try {
                first = first.removeCertain(content);
            }
            catch(Exception e)
            {
                System.out.println("Das Element ist nicht in der Liste. Es wurde nichts entfernt.");
            }

    }

    /**
     * add every element of the list to an array
     * @return the new array
     */
    public Object[] returnAsArray() {
        output = new Object[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = (Object) getElementAt(i);
        } return output;
    }

    /**
     * read the first element in the list
     * @return the content of the firnst element in the list
     */
    public T First() {
        return (T) first.content;
    }

    /**
     * add an object at the defined index
     * @param Index
     * @param content
     */
    public void addElementAt(int Index, T content) {
        try {
            first = first.add(Index, content);
        } catch (NullPointerException e) {
            System.out.println("Die Methode addElementAt wurde abgebrochen. Das mitgegebene Element war null.");

        } catch (IndexOutOfBoundsException f)
        {
            System.out.println("Die Methode addElementAt wurde abgebrochen. Der Index war zu groß.");

        }
    }


    /**
     * delete an object at the defined index
     * @param Index
     */
    public void deleteAt(int Index) {
        try {
            first = first.deleteAt(Index);
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Der Index war zu groß. Es wurde nichts gelöscht.");
        }
    }

    /**
     * change the element or the content of the element at the defined index
     * @param Index
     * @param content
     */
    public void change(int Index, T content) {
        try{
            first.change(Index, content);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Der Index war zu groß. Es wurde nichts geändert.");
        }

    }

    /**
     * searchs the index of en element with a defined content
     * @param content
     * @return the index of the element with the defined content
     */
    public int getElementIndex(T content) {
        try {
            return first.getElementIndex(content);
        }
        catch(IllegalArgumentException e){
            throw e;
        }
    }

    /**
     * @param Index
     * @return the content at the defined index
     */
    public T getElementAt(int Index) {
        try {
            return (T) first.getElementAt(Index).content;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Methode getElementAt: Dieser Index existiert nicht.");
            throw e;
        }
    }

}






