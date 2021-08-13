
/* Question
    You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
    Each number is present at least once. That is, if N = 5, the array/list constitutes values
    ranging from 0 to 3 and among these, there is a single integer value that is present twice.
    You need to find and return that duplicate number present in the array.

    Note : Duplicate number is always present in the given array/list.

    Sample Input 1:
    9
    0 7 2 5 4 7 1 3 6

    Sample Output 1:
    7

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class BFindDuplicate {

    public static int duplicate(int[] arr){

        int val = 0;
        for (int i = 0; i < arr.length ; i++){
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++){

                if(arr[i] == arr[j] && i != j){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                val = arr[i];
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) {

        // take array input
        int[] arr = ArraySum.takeInputArray();
        // find duplicate value
        int duplicateValue = duplicate(arr);
        System.out.println(duplicateValue);
    }
}
