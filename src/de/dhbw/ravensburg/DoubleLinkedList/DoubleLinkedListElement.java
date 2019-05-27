package de.dhbw.ravensburg.DoubleLinkedList;
public class DoubleLinkedListElement <T> {

    //Attribute
    DoubleLinkedListElement prior;
    DoubleLinkedListElement next;
    T content;

    public DoubleLinkedListElement(DoubleLinkedListElement prior, DoubleLinkedListElement next, T content) {
        this.prior = prior;
        this.next = next;
        this.content = content;
    }

    // 2. Gibt den Zähler an das vorddere Element und addiert +1
    public int size() {
        if (next != null) {
            return next.size() + 1;
        } else {
            return 1;
        }
    }

    // 3. Ein Element wird an der letzten Stelle hinzugefügt
    public DoubleLinkedListElement addNewElement(T content) {
        DoubleLinkedListElement last = new DoubleLinkedListElement(this, null, content);
        next = last;
        return last;
    }

    // 4. Wird ein Element hinzugefügt, gibt diese Methode das Element an das nächste weiter
    public DoubleLinkedListElement<T> addNewElement(DataElement element) {
        if (next != null) {
            next = next.addNewElement(element);
            return this;
        } else {
            return null;
        }
    }

    // 6. Überprüft das mitgegebene Objekt mit dem eigenen Objekt und gibt es entweder zurück oder weiter
    public boolean contains(T content) {
        if (content == this.content) {
            return true;
        } else if (content != this.content && next != null) {
            return next.contains(content);
        } else {
            return false;
        }
    }

    // 8. löscht sich selbst und gibt dem Objekt vor ihm das Objekt hinter ihm zurück
    public DoubleLinkedListElement removeCertain(T content) {
        if (next != null) {
            if (content == this.content) {
                next.prior = prior;
                return next;
            } else {
                next.delete(content);
                return this;
            }
        } else {
            return this;
        }
    }

    // 12. Objekt an bestimmter Stelle einfügen
    public DoubleLinkedListElement add(int Index, T content) {
        Index--;
        if (next != null) {
            if (Index == 0) {
                DoubleLinkedListElement sub = new DoubleLinkedListElement(this.prior, this, content);
                prior = sub;
                sub.next = this;
                return sub;
            } else {
                next = next.add(Index, content);
                return this;
            }
        } else {
            DoubleLinkedListElement sub = new DoubleLinkedListElement(this.prior, this, content);
            prior = sub;
            sub.next = this;
            return sub;
        }
    }

    //13. Objekt an einer besstimmten Index löschen
    public DoubleLinkedListElement deleteAt(int Index) {
        Index--;
        if (next != null) {
            if (Index == 0) {
                next.prior = prior;
                return next;
            } else {
                next = next.deleteAt(Index);
                return this;
            }
        }else {
            return this;
        }
    }

    // 14. Manipulieren eines Elements an gegebener Position (Löschen und Wiedereinsetzen)
    public void change(int Index, T content){
        Index--;
        if(next != null) {
            if (Index == 0) {
                this.content = content;
            } else {
                next.change(Index, content);
            }
        }
    }

    // 14. gibt den Index eines über den content gesuchten Elements zurück
    public int getElementIndex (T content)throws Exception {
        if (next != null) {
            if (content == this.content) {
                return 0;
            } else {
                return next.getElementIndex(content) + 1;
            }
        }else {
            throw new Exception();
        }
    }









    //Prüft ob das Element an der richtigen Stelle des Indexes steht
    public DoubleLinkedListElement getElementAt(int Index) {
        Index--;
        if(Index == 0 && next != null) {
            return this;
        }else{
            return next.getElementAt(Index);
        }
    }



}


