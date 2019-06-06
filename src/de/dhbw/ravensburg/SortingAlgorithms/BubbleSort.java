package de.dhbw.ravensburg.SortingAlgorithms;


import de.dhbw.ravensburg.Interface.List;

/**
 * Sorts a list using bubble sort: it compares a pair of elements and swaps their position if they are in the wrong order.
 * @param <T>
 */
public class BubbleSort <T extends Comparable> {

    void bubbleSort(int[] list) {

        int n = list.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }

            }
        }
    }
}
