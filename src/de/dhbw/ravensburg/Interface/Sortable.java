package de.dhbw.ravensburg.Interface;

public interface Sortable {

    /**
     * Fast order of the list
     */
    void quickSort();

    /**
     * Biggest element is at the end
     */
    void bubbleSort();

    /**
     * An own algorithm to sort the list
     */
    void insertionSort();

}
