
/* Question

    Given an array of length N, you need to find and return the sum of all elements of the array.
    Do this recursively.

    Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces

    Output Format :
    Sum

    Sample Input 1 :
    3
    9 8 9
    Sample Output 1 :
    26

 */

/* Solution

    arr = [1, 2, 3, 4, 5]
    sum = arr[0] + sum(arr[1:]);

 */

package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

public class GSumOfArray {

    public static int sum(int input[]) {

        if (input.length == 1){
            return input[0];
        }

        int[] smallArray = new int[input.length-1];
        for (int i = 1; i < input.length; i++){
            smallArray[i-1] = input[i];
        }
        int sum = input[0] + sum(smallArray);
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        int sum = sum(arr);
        System.out.println(sum);
    }
}
