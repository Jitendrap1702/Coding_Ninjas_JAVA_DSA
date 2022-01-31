/*
Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

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

/*Solution*/
/*
In ith row of output array, 1st column contains length of the ith subset.
And from 1st column actual subset follows.
For eg. Input : {1, 2}, then output should contain
	{{0}, 		// Length of this subset is 0
	{1, 2},		// Length of this subset is 1
	{1, 1},		// Length of this subset is also 1
	{2, 1, 2}}	// Length of this subset is 2
 */
package com.company.DSA.Recursion3.Assignment;

public class ReturnSubsetOfAnArray {

    public static int[][] subsets(int input[]) {

        int[][] output = subsets(input, 0);
        return output;
    }

    public static int[][] subsets(int input[], int startIndex){

        // Base case
        if (startIndex == input.length){
            return new int[1][0];
        }

        int[][] smallOutput = subsets(input, startIndex+1);
        int[][] output = new int[smallOutput.length*2][];

        // copy all elements from smallOutput to output
        for (int i = 0; i < smallOutput.length; i++){
            output[i] = new int[smallOutput[i].length];
            for (int j = 0; j < smallOutput[i].length; j++){
                output[i][j] = smallOutput[i][j];
            }
        }

        // copy all elements from smallOutput to output after including startIndex element
        for (int i = smallOutput.length; i < output.length; i++){
            output[i] = new int[smallOutput[i- smallOutput.length].length+1];
            output[i][0] = input[startIndex]; // add startIndex ele at start
            for (int j = 1; j < output[i].length; j++){
                output[i][j] = smallOutput[i- smallOutput.length][j-1];
            }
        }
        return output;
    }

    public static int subsets(int input[], int startIndex, int[][] output){

        // Base case
        if (startIndex == input.length){
            output[0][0] = 0; // first column of every row will store num of columns populated
            return 1; // return no. of rows in output array
        }

        int[][] smallOutput = new int[1000][20];
        int ans = subsets(input, startIndex+1, smallOutput); // will return num of rows(in output array) populated

        int row = 0;
        // copy all elements from smallOutput to output
        for (int i = 0; i < ans; i++){
            for (int j = 0; j < smallOutput[i][0]; j++){
                output[row][j] = smallOutput[i][j];
            }
            row++;
        }
        // copy all elements with startIndex element and increase num of column by 1(for each row)
        for (int i = 0; i < ans; i++){
            int numOfColumns = smallOutput[i][0];
            output[row][0] = numOfColumns+1;
            output[row][1] = input[startIndex];
            for (int j = 1; j < numOfColumns; j++){
                output[row][j+1] =  smallOutput[i][j];
            }
            row++;
        }
        return row; // return no of rows populated(filled)
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 3};
        int[][] output = subsets(input);
        for (int i = 0; i < output.length; i++){
            for (int j = 0; j < output[i].length; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
