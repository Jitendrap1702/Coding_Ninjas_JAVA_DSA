
/* Question
    You have been given an integer array/list(ARR) and a number X.
    Find and return the total number of pairs in the array/list which sum to X.

    Note: Given array/list can contain duplicate elements.

    Sample Input 1:
    9
    1 3 6 2 5 4 3 2 4
    7
    Sample Output 1:
    7

    Sample Input 2:
    9
    1 3 6 2 5 4 3 2 4
    12
    Sample Output 2:
    0

    Sample Input 3:
    6
    2 8 10 5 -2 5
    10
    Sample Output 3:
    2

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class DPairSum {

    public static int pairSum(int[] arr, int x){

        int sum = 0;
        for (int i = 0; i < arr.length-1; i++){

            for (int j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == x){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        // take input
        Scanner sc = new Scanner(System.in);
        int[] arr = ArraySum.takeInputArray();
        int x = sc.nextInt();

        // get pairSum and print
        int sum = pairSum(arr, x);
        System.out.println(sum);
    }
}
