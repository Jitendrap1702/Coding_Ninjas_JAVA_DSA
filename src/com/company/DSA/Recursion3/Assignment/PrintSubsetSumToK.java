/*
Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.
Input format :
Line 1 : Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Sample Input:
9
5 12 3 17 1 18 15 3 17
6
Sample Output:
3 3
5 1
 */

package com.company.DSA.Recursion3.Assignment;

public class PrintSubsetSumToK {

    public static void printSubsetsSumTok(int input[], int k) {

        printSubsetsSumTok(input, k, 0, new int[0]);
    }

    public static void printSubsetsSumTok(int input[], int k, int startIndex, int[] output) {

        // base case
        // when startIndex crosses arr.length :- if k == 0 then print array else do nothing
        if (startIndex == input.length){
            if (k == 0){
                for (int i: output){
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            return;
        }

        // call 2 time recursion
        // 1. include element which is at startIndex in input
        // we are including element so update k and output array
        int newK = k-input[startIndex];
        int[] newOutput = new int[output.length+1];
        // copy all element from output to new output
        for (int i = 0; i < output.length; i++){
            newOutput[i] = output[i];
        }
        // add start index element(which we are including) to newOutput
        newOutput[newOutput.length-1] = input[startIndex];
        printSubsetsSumTok(input, newK, startIndex+1, newOutput);

        // 2. don't include
        printSubsetsSumTok(input, k, startIndex+1, output);
    }

    public static void main(String[] args) {

        int[] input = {5, 12, 3, 17, 1, 18, 15, 3, 17};
        int k = 6;
        printSubsetsSumTok(input, k);
    }
}
