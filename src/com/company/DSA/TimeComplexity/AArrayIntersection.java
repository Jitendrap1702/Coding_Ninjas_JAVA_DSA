
/* Question

    You have given two integer arrays. You have to find out intersection of both arrays. Output should be sorted.

    Sample Input :
    7
    6 2 6 2 1 9 8
    5
    3 6 8 2 9

    Sample Output :
    2 6 8 9

 */

package com.company.DSA.TimeComplexity;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Arrays;

public class AArrayIntersection {

    public static void intersection(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length){

            if(arr1[i] < arr2[j]){
                i++;
            }
            else if (arr1[i] > arr2[j]){
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = ArraySum.takeInputArray();
        int[] arr2 = ArraySum.takeInputArray();
        intersection(arr1, arr2);
    }
}
