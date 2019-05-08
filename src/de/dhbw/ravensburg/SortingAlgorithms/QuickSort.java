package de.dhbw.ravensburg.SortingAlgorithms;

public class QuickSort {

    private int[] numbers;
    private int number;

    public void quickSort(int[] values) {
        // check if array is empty or null
        if (values == null || values.length == 0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get middle element of the list
        int middle = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {

            // If the current value from the left list is smaller than the middle
            // element then get the next element from the left list
            while (numbers[i] < middle) {
                i++;
            }
            // If the current value from the right list is larger than the middle
            // element then get the next element from the right list
            while (numbers[j] > middle) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the middle element and if we have found a value in the right list
            // which is smaller than the middle element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                changeNumbers(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void changeNumbers(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}

