package de.dhbw.ravensburg.LinkedList;

public class Finish<T extends Comparable> extends LinkedListElement<T> {

    T object;


    public Finish(T content) {
        object = null;
    }

    /**
     * prüft ob die Methode leer ist
     *
     * @return
     */
    public boolean isEmpty() {
        return true;
    }

    // 2. prüft die Lände der Liste, Ist finish das einzig oder letzte Element gibt die Method 0 zurück
    public int length() {
        return 0;
    }

    // 3. wird ein neues Element hinzugefügt, sorg diese Methode dafür, dass der Endpunkt an den Schluss gehängt wird
    public LinkedListElement addElement(LinkedListElement element) {
        element.next = this;
        return element;
    }


    /**
     * checks if the given element is the same like the one on this position
     *
     * @param content
     * @return false as this is the finish
     */
    public boolean contains(T content) {
        return false;
    }

    /**
     * Conntent not in the list, nothing to do
     *
     * @param content
     * @return itself or the next element
     * @throws  IllegalArgumentException Methode removeCertain: Dieses Element ist nicht in der Liste
     */
    public LinkedListElement removeCertain(T content) throws IllegalArgumentException {
        throw new IllegalArgumentException("Methode removeCertain: Dieses Element ist nicht in der Liste");
    }

    /**
     * add an element at a given index
     *
     * @param Index
     * @param content
     * @return the element
     * @throws IndexOutOfBoundsException Methode add: Dieser Index existiert nicht!
     */
    public LinkedListElement add(int Index, T content) throws IndexOutOfBoundsException {
        if (Index == 0) {
            LinkedListElement element = new LinkedListElement(content);
            element.next = this;
            return element;
        } else {
            throw new IndexOutOfBoundsException("Methode add: Dieser Index existiert nicht!");
        }
    }

    /**
     * deletes an element at a defined index
     *
     * @param Index
     * @return this
     * @throws IndexOutOfBoundsException Methode deleteAt: Dieser Index existiert nicht!
     */
    public LinkedListElement deleteAt(int Index) throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Methode deleteAt: Dieser Index existiert nicht!");
    }

    /**
     * chenge the elememnt or the content of the elmément at a defined index
     *
     * @param Index
     * @param content
     * @throws IndexOutOfBoundsException Methode:change Dieser Index existiert nicht!
     */
    public void change(int Index, T content) throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Methode:change Dieser Index existiert nicht!");
    }

    /**
     * serchs the index of an element with the defined content of the element
     *
     * @param content
     * @return if the elment at the index is the same like the sesarched one return 0, if nor return the element and the mehtod to the next element of the list
     * @throws IllegalArgumentException Methode getElementIndex: Dieses Objekt ist nicht in der Liste
     */
    public int getElementIndex(T content) throws IllegalArgumentException {
        throw new IllegalArgumentException("Methode getElementIndex: Dieses Objekt ist nicht in der Liste");
    }


    /**
     * checks the element at the defined index
     *
     * @param Index
     * @return the element at the searched index or the method and the lement to the next elment of the list
     * @throws IndexOutOfBoundsException Methode getElementAt: Dieser Index existiert nicht!
     */
    public LinkedListElement getElementAt(int Index) throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("Methode getElementAt: Dieser Index existiert nicht!");
    }


}