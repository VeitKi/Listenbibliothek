package de.dhbw.ravensburg;


import static de.dhbw.ravensburg.SortingAlgorithms.BubbleSort.bubbleSort;

public class Test {

    public static void main(String[]args){

        new Test().run();
    }

    void run(){

        int[] array = new int[6];

        array[0] = 999;
        array[1] = 5000;
        array[2] = 10;
        array[3] = 100;
        array[4] = 10000;

        bubbleSort(array);

        for (int element: array
             ) {
            System.out.println(element);

        }

    }
}
