package de.dhbw.ravensburg.DoubleLinkedList;

import com.sun.security.auth.NTUserPrincipal;

public class DoubleLinkedListElement<T> {

    //Attribute
    DoubleLinkedListElement prior;
    DoubleLinkedListElement next;
    T content;

    /**
     * @param prior
     * @param next
     * @param content
     */
    public DoubleLinkedListElement(DoubleLinkedListElement prior, DoubleLinkedListElement next, T content) {
        this.prior = prior;
        this.next = next;
        this.content = content;
    }

    /**
     * @return
     */
    // 2. Gibt den Zähler an das vordere Element und addiert +1
    public int size() {
        if (next != null) {
            return next.size() + 1;
        } else {
            return 1;
        }
    }


    /**
     * "This" ist Ende, einfach mitgegebenen Content an Element setzen, dann dieses als next setzen
     * Wird nur von der DoubleLinkedList aufgerufen
     *
     * @param e
     * @return
     */
    public DoubleLinkedListElement addElement(T e) {
        next = new DoubleLinkedListElement(this, null, e);
        return next;
    }


    /**
     * Überprüft das mitgegebene Objekt mit dem eigenen Objekt und gibt es entweder zurück oder weiter
     *
     * @param content
     * @return
     */
    public boolean contains(T content) {
        if (content == this.content) {
            return true;
        } else if (content != this.content && next != null) {
            return next.contains(content);
        } else {
            return false;
        }
    }

    /**
     * löscht sich selbst und gibt dem Objekt vor ihm das Objekt hinter ihm zurück
     *
     * @param content
     * @return
     * @throws IllegalArgumentException Dieses Element ist nicht in der Liste.
     */
    public DoubleLinkedListElement removeCertain(T content) throws IllegalArgumentException {
        if (next != null)
            if (content == this.content) {
                next.prior = prior;
                return next;
            } else {
                next = next.removeCertain(content);
                return this;
            }
        } else {
            if (content == this.content) {

                return next;
            } else {
                throw new IllegalArgumentException("Dieses Element ist nicht in der Liste.");

            }
        }
    }


    /**
     * Objekt an bestimmter Stelle einfügen
     *
     * @param Index
     * @param content
     * @return
     * @throws IndexOutOfBoundsException Dieser Index existiert nicht. Das Element wurde nicht eingefügt
     */
    public DoubleLinkedListElement add(int Index, T content) throws IndexOutOfBoundsException {
        if (next != null) {
            if (Index == 0) {
                DoubleLinkedListElement sub = new DoubleLinkedListElement(this.prior, this, content);
                this.prior = sub;
                sub.next = this;
                return sub;
            } else {
                Index--;
                next = next.add(Index, content);
                return this;
            }
        } else {
            if (Index == 0) {
                DoubleLinkedListElement sub = new DoubleLinkedListElement(this.prior, this, content);
                prior = sub;
                sub.next = this;
                return sub;
            } else {
                throw new IndexOutOfBoundsException("Dieser Index existiert nicht. Das Element wurde nicht eingefügt.");

            }
        }
    }


    /**
     * Objekt an einer bestimmten Index löschen
     *
     * @param Index
     * @return
     * @throws IndexOutOfBoundsException Die Liste hat nicht so viele Elemente. Kein Element wurde gelöscht.
     */
    public DoubleLinkedListElement deleteAt(int Index) throws IndexOutOfBoundsException {

        if (next != null) {
            if (Index == 0) {
                next.prior = prior;
                return next;
            } else {
                Index--;
                next = next.deleteAt(Index);
                return this;
            }
        } else {
            if (Index == 0) {
                //letztes Element erreicht,"this" ist zu löschen
                return null;
            } else {
                //letztes Element, "this" soll aber nicht gelöscht werden --> Index zu groß
                throw new IndexOutOfBoundsException("Die Liste hat nicht so viele Elemente. Kein Element wurde gelöscht.");

            }
        }
    }


    /**
     * Manipulieren eines Elements an gegebener Position (Löschen und Wiedereinsetzen)
     *
     * @param Index
     * @param content
     * @throws IndexOutOfBoundsException Der Index war zu groß.
     */
    public void change(int Index, T content) throws IndexOutOfBoundsException {


        if (Index == 0) {
            this.content = content;
        } else {
            if (next != null) {
                Index--;
                next.change(Index, content);
            }
            else{
                throw new IndexOutOfBoundsException("Der Index war zu groß.");
            }
        }
    }


    /**
     * gibt den Index eines über den content gesuchten Elements zurück
     *
     * @param content
     * @return
     * @throws IllegalArgumentException
     */
    public int getElementIndex(T content) throws IllegalArgumentException{
        if (content == this.content) {
            return 0;
        } else {
            if (next != null) {
                return next.getElementIndex(content) + 1;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }


    /**
     * Gibt das Element am gegebenen Index zurück
     *
     * @param Index
     * @return
     * @throws IndexOutOfBoundsException Der Index ist zu groß!
     */
    public DoubleLinkedListElement getElementAt(int Index) throws IndexOutOfBoundsException{


        if (Index == 0) {
            return this;
        } else {
            if (next != null) {
                Index--;
                return next.getElementAt(Index);
            } else {
                throw new IndexOutOfBoundsException("Der Index ist zu groß!");

            }
        }

    }
}




