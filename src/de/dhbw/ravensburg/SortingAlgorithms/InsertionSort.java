package de.dhbw.ravensburg.SortingAlgorithms;

import de.dhbw.ravensburg.Interface.List;

public class InsertionSort<T extends Comparable> {

    void insertionSort(List list)
    {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            Comparable key = list.getElement(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
