
/* Question
    You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
     Write a function to sort this array/list. Think of a solution which scans the array/list only once
     and don't require use of an extra array/list.

    Note :You need to change in the given array/list itself. Hence, no need to return or print anything.

    Sample Input 1:
    7
    0 1 1 0 1 0 1

    Sample Output 1:
    0 0 0 1 1 1 1

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class FSort01 {

    public static void sortZeroesAndOne(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while(start < end){

            if (arr[start] == 1 && arr[end] != 0){
                end--;
            }
            else if (arr[start] == 1 && arr[end] == 0){
                // swap 0 and 1
                arr[start] = 0;
                arr[end] = 1;
                start++;
                end--;
            }
            else if (arr[start] == 0){
                start++;
            }
        }
    }

    public static void main(String[] args) {

        // take Input
        int[] arr = ArraySum.takeInputArray();

        // print sorted array
        sortZeroesAndOne(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
