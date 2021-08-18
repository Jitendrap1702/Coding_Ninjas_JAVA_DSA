
/* Question
    You have been given an integer array/list(ARR) of size N.
    It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
    Your task is to write a function that returns the value of 'K', that means,
    the index from which the array/list has been rotated.

    Sample Input 1:
    6
    5 6 1 2 3 4
    Sample Output 1:
    2

    Sample Input 2:
    5
    3 6 8 9 10
    Sample Output 2:
    0

    Sample Input 3:
    4
    10 20 30 1
    Sample Output 3:
    3

 */


package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class DCheckArrayRotation {

    public static int arrayRotateCheck(int[] arr){
        int k = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                k = i+1;
                break;
            }
        }
        return k;
    }


    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        int rotationIndex = arrayRotateCheck(arr);
        System.out.println(rotationIndex);
    }

}
