package de.dhbw.ravensburg;


import de.dhbw.ravensburg.Interface.List;
import de.dhbw.ravensburg.SortingAlgorithms.BubbleSort;

import java.util.ArrayList;


public class Test {

    public static void main(String[]args){

        new Test().run();
    }

    void run(){

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(9);
        l.add(3);
        l.add(5);
        l.add(4);

        new BubbleSort<>().bubbleSort(l);

        for (Integer element: l) {
            System.out.println(element);

        }

    }
}
