
/* Question

    Given an array of length N and an integer x, you need to find if x is present in the array or not.
    Return true or false.
    Do this recursively.

    Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

    Output Format :
    'true' or 'false'

    Sample Input 1 :
    3
    9 8 10
    8
    Sample Output 1 :
    true

 */


package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class HCheckNumberInArray {

    public static boolean checkNumber(int input[], int x) {

        // Base case
        if (input.length == 0){
            return false;
        }
        if (input[0] == x){
            return true;
        }

        // recursive call
        int[] smallArray = new int[input.length-1];
        for (int i = 1; i < input.length; i++){
            smallArray[i-1] = input[i];
        }
        // small calculation
        boolean isNumberPresent = checkNumber(smallArray, x);
        return isNumberPresent;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = ArraySum.takeInputArray();
        int x = sc.nextInt();
        boolean isNumberPresent = checkNumber(input, x);
        System.out.println(isNumberPresent);
    }
}
