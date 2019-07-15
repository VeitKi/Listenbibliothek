package de.dhbw.ravensburg.LinkedList;


public class LinkedListElement <T extends Comparable>
{

    /**Attribute
     *
     */
    LinkedListElement next;
    T content;

    public LinkedListElement()
    {
        content = null;
    }

    /**
     * kontructor for LinkedListElements
     * @param content
     */
    public LinkedListElement(T content) {
        this.content = content;
    }



    /**
     * checks if the list is empty
     * @return false because the methode was given to the first element of the list and th elist is not empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * @return the the element with its number and the method to the next element whitch does the same
     */
    public int length() {
        return next.length() + 1;
    }

    /**
     * add a new elemet at the last position of the list
     * @param element
     * @return the new element
     */
    public LinkedListElement addElement(LinkedListElement element) {
        next = next.addElement(element);
        return this; }

    /**
     * checks if the given element is the same as the one on this position
     * @param content
     * @return if it is the same: return true; if not: return the return value of the next element
     */
    public boolean contains(T content) {
        if (content == this.content) {
            return true;
        } else {
            return next.contains(content);
        }
    }

    /**
     * deletes itself
     * @param content
     * @return itslef
     */
    public LinkedListElement removeCertain(T content){
        if(content==this.content){
            return next;
        }else {
            next = next.removeCertain(content);
            return this;
        }
    }

    /**
     * add an elment at a defined index
     * @param Index
     * @param content
     * @return the element
     * @throws NullPointerException
     */
    public LinkedListElement add(int Index, T content) throws NullPointerException{


            if (Index == 0) {
                LinkedListElement sub = new LinkedListElement<>(content);
                sub.next = this;
                return sub;
            } else {
                Index--;
                next = next.add(Index, content);
                return this;
            }

    }

    /**
     * delets an element at a defined index
     * @param Index
     * @return the element
     */
    public LinkedListElement deleteAt(int Index){

        if(Index==0) {
            return next;
        } else{
            Index--;
            next = next.deleteAt(Index);
            return this;
        }
    }

    /**
     * chenge the elememnt or the content of the elmément at a defined index
     * @param Index
     * @param content
     */
    public void change(int Index, T content){

        if(Index==0){
            this.content = content;
        }else{
            Index--;
            next.change(Index, content);
        }
    }

    /**
     * serchs the index of an element with the defined content of the element
     * @param content
     * @return if the elment at the index is the same like the sesarched one return 0, if nor return the element and the mehtod to the next element of the list
     */
    public int getElementIndex(T content) {
        if (content == this.content) {
            return 0;
        } else {
            return next.getElementIndex(content) + 1;
        }
    }

    /**
     * checks the element at the defined index
     * @param Index
     * @return the element at the searched index or the method and the lement to the next elment of the list
     */
    public LinkedListElement getElementAt(int Index) throws IndexOutOfBoundsException {

        if(Index == 0) {
            return this;
        }else{
            Index--;
            return next.getElementAt(Index);
        }
    }

}