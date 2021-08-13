
/* Question
    You have been given an array/list(ARR) of size N.
    You need to swap every pair of alternate elements in the array/list.

    Sample Input 1:
    4
    1 2 3 4
    Sample Output 1 :
    2 1 4 3

    Sample Input 2 :
    9
    9 3 6 12 4 32 5 11 19
    Sample Output 2 :
    3 9 12 6 32 4 11 5 19

 */

package com.company.Fundamentals.Arrays1;

public class SwapAlternate {

    public static void swap(int[] arr){

        for (int i = 0; i < arr.length-1; i+=2){
            int c = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = c;
        }
    }

    public static void main(String[] args) {

        // take array input
        int[] arr = ArraySum.takeInputArray();
        // swap array
        swap(arr);
        // print the swapped array
        ArraySum.printArray(arr);
    }
}
