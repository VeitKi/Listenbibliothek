package de.dhbw.ravensburg.DoubleLinkedList;
import de.dhbw.ravensburg.Interface.List;

public class DoubleLinkList <T>{

    //Attribute
    DoubleLinkedListElement first;
    DoubleLinkedListElement last;
    Object[] output;

    // 1. Überprüfen ob eine Liste leer ist
    public boolean isEmpty(){
        return first==null;
    }

    // 2. Die Länge der Liste wird geprüft
    public int size() {
        return first.size();
    }

    // 3. Ein Element wird hinzugefügt
    public void addElement(T content) {
        last = last.addElement(content);
    }

    // 4. fügt eine alle Elemente einer anderen Liste der aktuellen hinzu; Man sucht das Element an der Stelle i, nimmt davon den content, dieser wird gecastet und anschließend der Liste hinzugefügt
    public void addOtherList(List newList) {
        for (int i = 0; i < newList.size(); i++) {
            addElement((T) newList.getElementAt(i));
        }
    }

    // 5. Löscht alle Elemente
    public void removeAll() {
        first = null;
        last = null;
    }

    // 6. Prüft ob ein Objekt in der Liste enthalten ist
    public boolean contains(T content) {
        return first.contains(content);
    }

    // 7. Überprüft ob alle Elemente einer Liste in der Liste enthalten sind
    public boolean containsAll(List otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            if (!contains((T) otherList.getElementAt(i))) {
                return false;
            }
        }
        return true;
    }

    // 8. löscht sich selbst und gibt dem Objekt vor ihm das Objekt hinter ihm zurück
    public void removeCertain(T content) {
        first.removeCertain(content);
    }

    // 9. Fügt alle Elemente der Liste in ein Array ein
    public Object[] generateOutput() {
        output = new Object[size()];
        for (int i = 0; i < size(); i++) {
            output[i] = (Object) getElementAt(i);
        } return output;

    }

    // 10. Lesen des ersten Elements
    public T First() {
        return (T) first.content;
    }

    // 11. Lesen des letzten Elements
    public T Last() {
        return (T) last.content;
    }

    // 12. Objekt an bestimmter Stelle einfügen
    public void add(int Index, T content) {
        if(first != null)
            first.add(Index, content);
    }

    // 13. löscht ein Objekt an einem bestimmten Index
    public void deleteAt(int Index) {
        if(first != null)
            first.deleteAt(Index);
    }

    // 14. Manipulieren eines Elements an gegebener Position (Löschen und Wiedereinsetzen)
    public void change(int Index, T content) {
        if(first != null)
            first.change(Index, content);
    }

    // 15. gibt den Index eines über den content gesuchten Elements zurück
    public int getElementIndex(T content) throws Exception{
        // catch try block für Exeption
        try{
            if(first != null) {
                return first.getElementIndex(content);
            }else{
                throw new Exception();
            }
        }catch (Exception e) {
            System.out.println("Content nicht vorhanden.");
        }
    }

    //Das Element an der Stelle Index wird zurückgegeben
    public T getElementAt(int Index) {
        return (T) first.getElementAt(Index).content;
    }



}
}
