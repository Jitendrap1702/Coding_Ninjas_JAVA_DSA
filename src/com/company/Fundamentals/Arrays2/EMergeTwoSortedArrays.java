
/* Question

    Merge two sorted arrays

 */

package com.company.Fundamentals.Arrays2;

import com.company.Fundamentals.Arrays1.ArraySum;

public class EMergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2){

        int i = 0, j= 0 , k= 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length){

            if (arr1[i] > arr2[j]){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
            else{
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }

        while (i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

    public static void main(String[] args) {

        // take input
        int[] arr1 = ArraySum.takeInputArray();
        int[] arr2 = ArraySum.takeInputArray();
        int[] arr3 = merge(arr1, arr2);
        ArraySum.printArray(arr3);
    }
}
