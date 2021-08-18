
/* Question

    Sort array using insertion sort algorithm

 */

package com.company.Fundamentals.Arrays2;

import com.company.Fundamentals.Arrays1.ArraySum;

public class DInsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++){
            // insert ith element in sorted portion

            int j = i-1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            // position will be j+1
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        insertionSort(arr);
        ArraySum.printArray(arr);
    }
}
