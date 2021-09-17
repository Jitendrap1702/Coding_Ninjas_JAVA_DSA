
/* Question

    You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
    Each number is present at least once. That is, if N = 5, the array/list constitutes values
    ranging from 0 to 3, and among these, there is a single integer value that is present twice.
    You need to find and return that duplicate number present in the array.

Note : Duplicate number is always present in the given array/list.

    Sample Input :
    9
    0 7 2 5 4 7 1 3 6

    Sample Output :
    7

 */

package com.company.DSA.TimeComplexity.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Arrays;

public class BFindDuplicate {

    // Time Complexity :- O(n)
    public static int findDuplicate2(int[] arr) {
        int n = arr.length;
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++){
            sumOfArray += arr[i];
        }
        int ans = sumOfArray - ((n-2)*(n-1)/2);
        return ans;
    }

    // Time Complexity :- O(nlogn) cause we are sorting
    public static int findDuplicate(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        // find duplicate
        for (int i = 0; i < arr.length-1; i++){

            if (arr[i] == arr[i + 1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        int duplicateElement = findDuplicate(arr);
        System.out.println(duplicateElement);
        int duplicateElement2 = findDuplicate2(arr);
        System.out.println(duplicateElement2);
    }
}
