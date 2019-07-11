package de.dhbw.ravensburg;


import de.dhbw.ravensburg.DoubleLinkedList.DoubleLinkList;
import de.dhbw.ravensburg.LinkedList.LinkedList;
import de.dhbw.ravensburg.Queue.Queue;
import de.dhbw.ravensburg.SortingAlgorithms.BubbleSort;
import de.dhbw.ravensburg.Stack.Stack;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[]args){

        new Test().run();
    }

    void run(){

        //listen zum hinzufügen:
        LinkedList<Integer> l = new LinkedList<>();
        l.addElement(6);
        l.addElement(6);
        l.addElement(6);
        Queue<Integer> q = new Queue<>();
        q.addElement(6);
        q.addElement(6);
        q.addElement(6);
        DoubleLinkList<Integer> d = new DoubleLinkList<>();
        q.addElement(6);
        q.addElement(6);
        q.addElement(6);

        //test der Queue
        Queue<Integer> queue = new Queue<>();
        queue.addElement(1);
        queue.addElement(2);
        queue.addElement(4);
        queue.addElement(3);
        queue.addElement(0);

        System.out.println(queue.toString());

        queue.isEmpty();
        queue.size();
        queue.addOtherList(q);
        queue.contains(2);
        queue.containsAll(q);
        queue.removeCertain(2);
        queue.returnAsArray();
        queue.addElementAt(1,5);
        queue.getElement(1);
        queue.returnFirst();
        queue.returnFirstAndDelete();
        queue.removeAll();


        //test der LinkedList
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addElement(3);
        linked.addElement(7);
        linked.addElement(1);
        linked.addElement(3);

        System.out.println(linked.toString());

        linked.isEmpty();
        linked.size();
        linked.addElement(9);
        linked.addOtherList(l);
        linked.contains(5);
        linked.containsAll(l);
        linked.removeCertain(3);
        linked.returnAsArray();
        linked.First();
        linked.add(2,5);
        linked.deleteAt(2);
        linked.change(2,3);
        linked.getElementIndex(1);
        linked.getElementAt(3);


        //test der doubleLinkedList
        DoubleLinkList<Integer> doublee = new DoubleLinkList<>();
        doublee.addElement(2);
        doublee.addElement(20);
        doublee.addElement(7);
        doublee.addElement(19);

        System.out.println(doublee.toString());

        doublee.isEmpty();
        doublee.size();
        doublee.addElement(9);
        doublee.addOtherList(d);
        doublee.contains(5);
        doublee.containsAll(d);
        doublee.removeCertain(3);
        doublee.First();
        doublee.add(2,5);
        doublee.deleteAt(2);
        doublee.change(2,3);
        doublee.getElementIndex(1);
        doublee.getElementAt(3);
        doublee.removeAll();


        //test des Suchbaums

        //hier weiß ich leider die methoden nicht und hab auch den ganzen code nicht




        //test des Sets

        //hier hab ich den code auch noch nicht


        //test des Stacks

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(20);
        stack.push(5);

        System.out.println(stack.toString());

        stack.isEmpty();
        stack.size();
        stack.peek();
        stack.contains(5);
        stack.returnAsArray();
    }
}
