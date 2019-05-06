package de.dhbw.ravensburg.Stack;

public class Stack<T> implements List<T>{
  
  
  //Variablendeklaration

    public Stack<T> next;

    private T variable;


    //Konstruktor

    public Stack(T variable) {

        this.variable= variable;

    }

    //Ein neues Element wird dem Stack hinzugefügt

    public void addElement(T item) {

        next= this;

        variable= item;

    }

    //Prüfung, ob der Stack leer ist oder Elemente enthält

    public boolean isEmpty() {

        if (variable == null) {

            return true;
        }

        else {


            return false;
        }

    }

    //Gebe das oberste Element des Stacks zurück

    public T peek (){


        return variable;
    }

    //Den kompletten Stackinhalt löschen

    public void clear() {

        next = null;
        variable = null;
    }

    int n;

    public int size() {

        T curElement = variable;


        for(int i=0; curElement!=null; i++) {

            curElement=curElement.next();

        }

        return n;

    } 
  
}
}
