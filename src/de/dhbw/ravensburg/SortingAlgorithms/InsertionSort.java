package de.dhbw.ravensburg.SortingAlgorithms;

import de.dhbw.ravensburg.Interface.List;

/**
 * Sorts a list using insertion sort: goes trough list, if an element is greater it is moved one position forward
 * @param <T>
 */
public class InsertionSort<T extends Comparable> {

    void insertionSort(List list)
    {
        int n = list.size();
        for (int i = 1; i < n; ++i) {
            Comparable key = list.getElement(i);
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
