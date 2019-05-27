package de.dhbw.ravensburg;


import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.Queue.Queue;
import de.dhbw.ravensburg.SortingAlgorithms.BubbleSort;

import java.util.ArrayList;


public class Test {

    BubbleSort<Integer> bs = new BubbleSort<>();

    public static void main(String[]args){

        new Test().run();
    }

    void run(){
        Queue<Integer> q = new Queue<>();
        q.addElement(1);
        q.addElement(2);
        q.addElement(4);
        q.addElement(3);
        q.addElement(0);

        bs.bubbleSort(q);

        System.out.println(q.toString());

    }
}
