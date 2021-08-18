
/* Question
    Sort array using selection sort algorithm
 */

/* Solution

    n = length of array
    Compare ith element of array with (i+1)th to nth element of array
                    if ith element is greater than any element then swap them
                    else continue

    After first iteration we will get minimum element at first position.
    After second iteration we will get second minimum element at second position.
    .
    .
    .


 */

package com.company.Fundamentals.Arrays2;

import com.company.Fundamentals.Arrays1.ArraySum;

public class BSelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                // Finding minimum element among j positions
                if (arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            // swap element at minIndex with ith element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        selectionSort(arr);
        ArraySum.printArray(arr);
    }
}
