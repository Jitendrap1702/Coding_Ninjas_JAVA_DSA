
/* Question
    Sort array using bubble sort algorithm
*/

/* Solution
    compare jth and (j+1) element
    if (j+1)th element < jth element  then swap them else continue

    After first iteration we will get maximum element at last position.
    After second iteration we will get second maximum element at second last position.
    .
    .
    .

 */

package com.company.Fundamentals.Arrays2;

import com.company.Fundamentals.Arrays1.ArraySum;

public class CBubbleSort {

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            // n-1 rounds
            for (int j = 0; j < arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    // swap jth and (j+1)th element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        bubbleSort(arr);
        ArraySum.printArray(arr);
    }
}
