
/* Question

    Given an array of length N and an integer x, you need to find and return the last index of integer x present
    in the array. Return -1 if it is not present in the array.
    Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
    You should start traversing your array from 0, not from (N - 1).
    Do this recursively. Indexing in the array starts from 0.

    Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

    Output Format :
    last index or -1

    Sample Input :
    4
    9 8 10 8
    8

    Sample Output :
    3

 */

package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class KLastIndexOfNumInArray {

    // Using Last Index method : Better solution

    public static int lastIndex(int input[], int x, int lastIndex) {

        if (lastIndex == -1){
            return -1;
        }
        if (input[lastIndex] == x){
            return lastIndex;
        }

        int smallInput = lastIndex(input, x, lastIndex - 1);
        return smallInput;
    }

    // By making copies of array again and again (Break from end)

    public static int lastIndex2(int input[], int x) {

        if (input.length == 0){
            return -1;
        }
        if (input[input.length-1] == x){
            return input.length-1;
        }

        int[] smallArray = new int[input.length-1];
        for (int i = 0; i < input.length-1; i++){
            smallArray[i] = input[i];
        }

        int fi = lastIndex2(smallArray, x);
        return fi;

    }

    // By breaking from start and making copies

    public static int lastIndex3(int[] input, int x){

        if (input.length == 0){
            return -1;
        }
        int[] smallArray = new int[input.length-1];
        for (int i = 1; i < input.length; i++){
            smallArray[i-1] = input[i];
        }

        int fi = lastIndex3(smallArray, x);
        if (fi == -1){
            if (input[0] == x){
                return 0;
            }else{
                return -1;
            }
        }else{
            return fi + 1;
        }

    }

    // Using Start Index method : Better solution  (start Index)

    public static int lastIndex4(int[] input, int x, int startIndex){

        if (startIndex == input.length){
            return -1;
        }

        int k = lastIndex4(input, x, startIndex + 1);

        if (k != -1){
            return k;
        }else {
            if (input[startIndex] == x){
                return startIndex;
            }else {
                return -1;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = ArraySum.takeInputArray();
        int x = sc.nextInt();

        int fi1 = lastIndex2(input, x);
        System.out.println(fi1);

        int fi2 = lastIndex(input, x, input.length-1);
        System.out.println(fi2);

        int fi3 = lastIndex3(input, x);
        System.out.println(fi3);

        int fi4 = lastIndex4(input, x, 0);
        System.out.println(fi4);

    }
}
