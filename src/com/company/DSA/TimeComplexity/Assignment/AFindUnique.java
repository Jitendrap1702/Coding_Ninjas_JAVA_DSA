
/* Question

    You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
    Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
    You need to find and return that number which is unique in the array/list.

    Note:
    Unique element is always present in the array/list according to the given condition.

    Sample Input :
    7
    2 3 1 6 3 6 2
    Sample Output :
    1

 */

package com.company.DSA.TimeComplexity.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Arrays;

public class AFindUnique {

    // Time Complexity O(nlogn) :- cause we are sorting the array
    public static int findUnique(int[] arr) {
        // sort the array
        Arrays.sort(arr);
        // find out unique element
        for (int i = 0; i < arr.length;){
            // if i is last index
            if (i == arr.length-1){
                return arr[i];
            }
            if (arr[i] == arr[i + 1]){
                i += 2;
            }
            else {
                return arr[i];
            }
        }
        return -1;
    }

    // Using XOR
    // Time Complexity :- O(n)
    public static int findUnique2(int[] arr) {
        int uniqueEle = arr[0];
        for (int i = 1; i < arr.length; i++){
            uniqueEle ^= arr[i];
        }
        return uniqueEle;
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        int uniqueElement = findUnique(arr);
        System.out.println(uniqueElement);
        int uniqueElement2 = findUnique2(arr);
        System.out.println(uniqueElement);
    }
}
