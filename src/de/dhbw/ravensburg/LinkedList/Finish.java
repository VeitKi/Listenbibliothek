package de.dhbw.ravensburg.LinkedList;

public class Finish <T> extends LinkedListElement<T>{

    T object;


    public Finish() {
        object = null;
    }

    // 1. prüft ob die Methode leer ist
    public boolean isEmpty() {
        return true;
    }

    // 2. prüft die Lände der Liste, Ist finish das einzig oder letzte Element gibt die Method 0 zurück
    public int size() {
        return 0;
    }

    // 3. wird ein neues Element hinzugefügt, sorg diese Methode dafür, dass der Endpunkt an den Schluss gehängt wird
    public LinkedListElement addElement(LinkedListElement element){
        element.next=this;
        return element;
    }

    // 8. gibt sich selbst zurück wenn die Liste sonst leer ist und man eigentlich ein Element löschen will
    public LinkedListElement removeCertain(T content){
        return this;
    }

    public LinkedListElement getElementAt(int Index){
        return null;
    }


    }