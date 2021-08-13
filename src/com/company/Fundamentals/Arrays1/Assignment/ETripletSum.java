
/* Question
    You have been given a random integer array/list(ARR) and a number X.
    Find and return the number of triplets in the array/list which sum to X.

    Note : Given array/list can contain duplicate elements.

    Sample Input 1:
    7
    1 2 3 4 5 6 7
    12
    Sample Output 1:
    5

    Sample Input 2:
    9
    2 -5 8 -6 0 5 10 11 -3
    10
    Sample Output 2:
    5

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class ETripletSum {

    public static int findTriplet(int[] arr, int x){

        int sum = 0;
        for (int i = 0; i < arr.length-2; i++){

            for (int j = i + 1; j < arr.length-1; j++){

                for (int k = j + 1; k < arr.length; k++){

                    if (arr[i] + arr[j] + arr[k] == x){
                        sum++;
                    }
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

        // print total triplets
        int tripletSum = findTriplet(arr, x);
        System.out.println(tripletSum);

    }
}
