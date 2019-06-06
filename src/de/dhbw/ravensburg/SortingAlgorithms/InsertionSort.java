package de.dhbw.ravensburg.SortingAlgorithms;

import de.dhbw.ravensburg.Interface.List;

/**
 * Sorts a list using insertion sort: goes trough list, if an element is greater it is moved one position forward
 * @param <T>
 */
public class InsertionSort<T extends Comparable> {

    void insertionSort(int[] list)
    {
        int n = list.length;
        for (int j = 1; j < n; j++) {
            int key = list[j];
            int i = j-1;
            while ( (i > -1) && ( list [i] > key ) ) {
                list [i+1] = list [i];
                i--;
            }
            list[i+1] = key;
        }
    }
}
