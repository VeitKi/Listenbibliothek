package de.dhbw.ravensburg.LinkedList;

public class LinkedListElement <T>
{

    //Attribute
    LinkedListElement next;
    T content;


    //Konstruktor
    public LinkedListElement(T content) {
        this.content = content;
    }

    public LinkedListElement() {
    }


    // 1. Sind Element enthalten, ist die Liste nicht leer und die Methode returnt false
    public boolean isEmpty() {
        return false;
    }

    // 2. Gibt den Zähler an das vorddere Element und addiert +1
    public int length() {
        return next.length() + 1;
    }

    // 3. / 4. Wird ein Element hinzugefügt, gibt diese Methode das Element an das nächste weiter
    public LinkedListElement addElement(LinkedListElement element) {
        next = next.addNewElement(element);
        return this; }

    // 6. Überprüft das mitgegebene Objekt mit dem eigenen Objekt und gibt es entweder zurück oder weiter
    public boolean contains(T content){
        if(content==this.content){
            return true;
        }else if (content != this.content){
            return next.contains(content);
        }else {
            return false; } }

    // 8. löscht sich selbst und gibt dem Objekt vor ihm das Objekt hinter ihm zurück
    public LinkedListElement removeCertain(T content){
        if(content==this.content){
            return next;
        }else {
            next.delete(content);
            return this;
        }
    }

    // 11. Objekt an bestimmter Stelle einfügen
    public LinkedListElement add(int Index, T content){
        Index--;
        if(Index == 0) {
            LinkedListElement sub = new LinkedListElement<>(content);
            sub.next = this;
            return sub;
        }else{
            next.add(Index, content);
            return this;
        }
    }

    //12. Objekt an einer besstimmten Index löschen
    public LinkedListElement deleteAt(int Index){
        Index--;
        if(Index==0) {
            return next;
        } else{
            next.deleteAt(Index);
            return this;
        }
    }

    // 13. Manipulieren eines Elements an gegebener Position (Löschen und Wiedereinsetzen)
    public void change(int Index, T content){
        Index--;
        if(Index==0){
            this.content = content;
        }else{
            next.change(Index, content);
        }
    }

    // 14. gibt den Index eines über den content gesuchten Elements zurück
    public int getElementIndex(T content) {
        if (content == this.content) {
            return 0;
        } else {
            return next.getElementIndex(content) + 1;
        }
    }

    //Prüft ob das Element an der richtigen Stelle des Indexes steht
    public LinkedListElement getElementAt(int Index) {
        Index--;
        if(Index == 0) {
            return this;
        }else{
            return next.getElementAt(Index);
        }
    }
}