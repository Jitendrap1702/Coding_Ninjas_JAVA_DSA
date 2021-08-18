
/* Question
    You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s.
    Write a solution to sort this array/list in a 'single scan'.

    'Single Scan' refers to iterating over the array/list just once or to put it in other words,
    you will be visiting each element in the array/list just once.

    Sample Input 1:
    7
    0 1 2 0 2 0 1
    Sample Output 1:
    0 0 0 1 1 2 2

 */

package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class ESort012 {

    // let assume we have arr = [0, 1, 2, 0, 2, 0, 1]

    // Time limit exceeded in test case 4, 5, 6 cause i done it in double scan

    public static void sort0121(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){

            if (arr[start] != 0 && arr[end] != 0){
                end--;
            }
            else if (arr[start] != 0 && arr[end] == 0){
                int temp = arr[start];
                arr[start] = 0;
                arr[end] = temp;
                start++;
                end--;
            }
            else if (arr[start] == 0){
                start++;
            }
        }

        /* till then we will get arr = [0, 0, 0, 1, 2, 2, 1]
            start = 3, end = 3
         */


        int s = start;
        int e = arr.length-1;
        while (s < e){

            if (arr[s] == 2 && arr[e] != 1 ){
                e--;
            }
            else if (arr[s] == 2 && arr[e] == 1){
                arr[s] = 1;
                arr[e] = 2;
                s++;
                e--;
            }

            else if (arr[s] == 1){
                s++;
            }
        }

        /* this code will give arr = [0, 0, 0, 1, 1, 2, 2]
            where s = 5, e = 5
         */
    }

    // Successfully submitted cause solution is in single scan

    public static void sort0122(int[] arr){

        int i = 0;
        int nz = 0; // nz = next zero
        int nt = arr.length-1; // nt = next two

        while (i <= nt){

            if (arr[i] == 0){
                // swap 0 with element at index nz
                int temp = arr[i];
                arr[i] = arr[nz];
                arr[nz] = temp;
                nz++;
                i++;
            }
            else if (arr[i] == 2){
                // swap 2 with element at index nt
                int temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;
                //i++;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        sort0122(arr);
        ArraySum.printArray(arr);
    }
}
