
/* Question

    Given an array of length N and an integer x, you need to find and return the first index of integer x present
    in the array. Return -1 if it is not present in the array.

    First index means, the index of first occurrence of x in the input array.
    Do this recursively. Indexing in the array starts from 0.

    Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

    Output Format :
    first index or -1

    Sample Input :
    4
    9 8 10 8
    8
    Sample Output :
    1

 */

package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class JFirstIndexOfNumInArray {

    // Using Start Index method : Better solution

    public static int firstIndex(int input[], int x, int startIndex) {

        if (startIndex == input.length){
            return -1;
        }
        if (input[startIndex] == x){
            return startIndex;
        }

        int smallInput = firstIndex(input, x, startIndex + 1);
        return smallInput;
    }

    // By making copies of array (Break from start)

    public static int firstIndex2(int input[], int x){

        if (input.length == 0){
            return -1;
        }
        if (input[0] == x){
            return 0;
        }

        int[] smallArray = new int[input.length-1];
        for (int i = 1; i < input.length; i++){
            smallArray[i-1] = input[i];
        }

        int fi = firstIndex2(smallArray, x);
        if (fi == -1){
            return -1;
        }
        else {
            return fi + 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = ArraySum.takeInputArray();
        int x = sc.nextInt();

        int fi1 = firstIndex(input, x, 0);
        System.out.println(fi1);

        int fi2 = firstIndex2(input, x);
        System.out.println(fi2);

    }
}
