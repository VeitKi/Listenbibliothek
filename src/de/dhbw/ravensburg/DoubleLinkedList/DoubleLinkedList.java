package de.dhbw.ravensburg.DoubleLinkedList;

import de.dhbw.ravensburg.Interface.List;

import java.util.concurrent.ExecutionException;

/**
 * @param <T>
 */
public class DoubleLinkedList<T extends Comparable> implements List<T> {


    /**
     * @Fields DoubleLinkedListElement first
     * DoubleLinkedListElement last
     * Object[] output
     */
    DoubleLinkedListElement first;
    DoubleLinkedListElement last;
    Object[] output;

    /**
     * Überprüfen ob eine Liste leer ist
     *
     * @return leer oder nicht leer
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Die Länge der Liste wird geprüft
     *
     * @return
     */
    public int size() {
        if (first != null){
            return first.size();
    }else
        return 0;
    }

    /**
     * Ein Element wird hinzugefügt
     *
     * @param content
     */
    public void addElement(T content) {
        if (last != null) {
            last = last.addElement(content);
        } else {
            DoubleLinkedListElement element = new DoubleLinkedListElement(null, null, content);
            last = element;
            first = element;
        }
    }


    /**
     * Löscht alle Elemente
     */
    public void removeAll() {
        first = null;
        last = null;
    }

    /**
     * Prüft ob ein Objekt in der Liste enthalten ist
     *
     * @param content
     * @return
     */
    public boolean contains(T content) {
        return first.contains(content);
    }

    /**
     * entfernt das Element mit dem entsprechenden content aus der Liste
     *
     * @param content
     */
    public void removeCertain(T content) {
        try {
            first = first.removeCertain(content);
        } catch (Exception e) {
            System.out.println("Die Methode removeCertain wurde abgebrochen, weil das Element nicht vorhanden ist.");
        }
    }

    /**
     * Fügt alle Elemente der Liste in ein Array ein
     *
     * @return
     */
    public Object[] generateOutput() {
        output = new Object[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = (Object) getElementAt(i);
        }
        return output;

    }

    /**
     * Lesen des ersten Elements

    public T First() throws NullPointerException {
        if (first != null) {
            return (T) first.content;
        } else {
            throw new NullPointerException("Die Liste ist leer.");
        }
    }

    /**
     * Lesen des letzten Elements
     *
     * @return
     * @throws NullPointerException Die Liste ist leer.
     */
    public T Last() throws NullPointerException {
        if (first != null) {
            return (T) last.content;
        } else {
            throw new NullPointerException("Die Liste ist leer.");
        }
    }

    /**
     * Objekt an bestimmter Stelle einfügen
     *
     * @param Index
     * @param content
     */
    public void addElementAt(int Index, T content) {
        try {
            if (first != null)
                first = first.add(Index, content);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Die Methode addElementAt wurde abgebrochen. Der Index war zu groß");
        }
    }

    /**
     * löscht ein Objekt an einem bestimmten Index
     *
     * @param Index
     */
    public void deleteAt(int Index) {
        try {
            if (first != null)
                first = first.deleteAt(Index);
        } catch (Exception e) {
            System.out.println("deleteAt: Das Element wurde nicht gelöscht, da der Index nicht existiert.");
        }
    }


    /**
     * Manipulieren eines Elements an gegebener Position (Löschen und Wiedereinsetzen)
     *
     * @param Index
     * @param content
     */
    public void change(int Index, T content) {
        try {

            if (first != null)
                first.change(Index, content);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("change: Der Index war zu groß.");
        }
    }


    /**
     * gibt den Index eines über den content gesuchten Elements zurück
     *
     * @param content
     * @return
     * @throws IllegalArgumentException
     */
    public int getElementIndex(T content) throws IllegalArgumentException {
        // catch try block für Exeption
        try {
            if (first != null) {
                return first.getElementIndex(content);
            } else {
                System.out.println("getElementIndex: Content nicht vorhanden.");
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("getElementIndex: Content nicht vorhanden.");
            throw new IllegalArgumentException();
        }
    }

    /**
     * Das Element an der Stelle Index wird zurückgegeben
     *
     * @param Index
     * @return
     */
    public T getElementAt(int Index) {
        try {
            return (T) first.getElementAt(Index).content;
        } catch (Exception e) {
            throw e;
        }
    }


    /**
     * add every element of the list to an array
     *
     * @return the new array
     */
    public Object[] returnAsArray() {
        output = new Object[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = (Object) getElementAt(i);
        }
        return output;
    }

}

