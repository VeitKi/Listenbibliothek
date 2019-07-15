package de.dhbw.ravensburg.Interface;

public abstract class Sortable {

    /**
     * Sorting the elements on the right and left side of the pivot
     * @param arr array which has to be sorted
     * @param start at which index do we want to start the quicksort
     * @param end to which index do we want to sort?
     */
    public static void quickSort(int[] arr, int start, int end){

        int point = point(arr, start, end);

        if(point-1>start) {
            quickSort(arr, start, point - 1);
        }
        if(point+1<end) {
            quickSort(arr, point + 1, end);
        }
    }


    /**
     *  Find the right pivot
     * @param arr array which has to be sorted
     * @param start at which index do we want to start the quicksort
     * @param end to which index do we want to sort?
     * @return the new and final index from the pivot
     */
    public static int point(int[] arr, int start, int end){

        //pivot is the separating element
        int pivot = arr[end];

        for(int i=start; i<end; i++){

            //if the element at this index is smaller than the pivot element of the array
            if(arr[i]<pivot){

                //change the elements; the first element gets a temporary place
                int temp= arr[start];
                // the smaller element gets the first place
                arr[start]=arr[i];
                //now the first element gets the index from the actually first element
                arr[i]=temp;
                //count iteration
                start++;
            }
        }

        //the pivot gets its right position, the smaller elements are left, the bigger right

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    /**
     * Biggest element is at the end
     */
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
    /**
     * An own algorithm to sort the list
     */
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
