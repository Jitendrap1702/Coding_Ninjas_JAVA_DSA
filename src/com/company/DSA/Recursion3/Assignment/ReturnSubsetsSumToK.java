/*
Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K
Constraints :
1 <= n <= 20
Sample Input :
9
5 12 3 17 1 18 15 3 17
6
Sample Output :
3 3
5 1
 */
package com.company.DSA.Recursion3.Assignment;

public class ReturnSubsetsSumToK {

    public static int[][] subsetsSumK(int input[], int k) {

        int[][] output = subsetsSumK(input, k, 0);
        return output;
    }

    public static int[][] subsetsSumK(int input[], int k, int startIndex){

        // Base case
        if (startIndex == input.length){
            if (k == 0){
                return new int[1][0];
            }else {
                return new int[0][0];
            }
        }

        int[][] smallOutput1 = subsetsSumK(input, k-input[startIndex], startIndex+1); // include startIndex ele to subset
        int[][] smallOutput2 = subsetsSumK(input, k, startIndex+1); // Don't include startIndex ele to subset

        int[][] output = new int[smallOutput1.length+ smallOutput2.length][];
        // in case of include
        for (int i = 0; i < smallOutput1.length; i++){
            output[i] = new int[smallOutput1[i].length+1];
            output[i][0] = input[startIndex];
            for (int j = 0; j < smallOutput1[i].length; j++){
                output[i][j+1] = smallOutput1[i][j];
            }
        }

        // in case of not include
        for (int i = 0; i < smallOutput2.length; i++){
            output[smallOutput1.length+ i] = new int[smallOutput2[i].length];
            for (int j = 0; j < smallOutput2[i].length; j++){
                output[smallOutput1.length+ i][j] = smallOutput2[i][j];
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int[] input = {5, 12, 3, 17, 1, 18, 15, 3, 17};
        int k = 6;
        int[][] output = subsetsSumK(input, k);
        for (int i = 0; i < output.length; i++){
            for (int j = 0; j < output[i].length; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
