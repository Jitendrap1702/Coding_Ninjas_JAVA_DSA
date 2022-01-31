/*
Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array.
 But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12
20
20 12
15
15 12
15 20
15 20 12
 */

package com.company.DSA.Recursion3.Assignment;

public class PrintSubsetOfArray {

    public static void printSubsets(int input[]) {

        printSubsets(input, 0, new int[0]);
    }

    public static void printSubsets(int[] input, int startIndex, int[] output){

        // Base case
        if (startIndex == input.length){
            for (int i: output){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // include element in subset
        int[] newOutput = new int[output.length+1];
        for (int i = 0; i < output.length; i++){
            newOutput[i] = output[i];
        }
        newOutput[newOutput.length-1] = input[startIndex];
        printSubsets(input, startIndex+1, newOutput);

        // Don't include element
        printSubsets(input, startIndex+1, output);
    }

    public static void main(String[] args) {

        int[] input = {15, 20, 12};
        printSubsets(input);
    }
}
