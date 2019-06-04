package de.dhbw.ravensburg.SortingAlgorithms;


import de.dhbw.ravensburg.Interface.List;

/**
 * Sorts a list using bubble sort: it compares a pair of elements and swaps their position if they are in the wrong order.
 * @param <T>
 */
public class BubbleSort <T extends Comparable> {

    public void bubbleSort(List list) {

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.getElement(j).compareTo(list.getElement(j + 1)) > 0) {

                    Comparable temp = list.getElement(j);
                    list.addElementAt(list.getElement(j + 1), j);
                    list.addElementAt(temp, j + 1);
                }
            }
        }
    }
}
