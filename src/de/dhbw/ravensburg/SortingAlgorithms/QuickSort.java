package de.dhbw.ravensburg.SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

        public static void quickSort(int[] arr, int start, int end){

            int point = point(arr, start, end);

            if(point-1>start) {
                quickSort(arr, start, point - 1);
            }
            if(point+1<end) {
                quickSort(arr, point + 1, end);
            }
        }

        public static int point(int[] arr, int start, int end){
            int pivot = arr[end];

            for(int i=start; i<end; i++){

                //if element x is smaller than the end of the array
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

            int temp = arr[start];
            arr[start] = pivot;
            arr[end] = temp;

            return start;
        }
    }
