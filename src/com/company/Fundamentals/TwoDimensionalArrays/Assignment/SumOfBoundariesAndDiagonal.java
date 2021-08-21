
/* Question
    For a given two-dimensional square matrix of size (N x N).
    Find the total sum of elements on both the diagonals and at all the four boundaries.

    Sample input 1:
    5 5
    1 2 3 4 5
    6 7 8 9 10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25

    Sample Output 1:
    273

 */

package com.company.Fundamentals.TwoDimensionalArrays.Assignment;

import com.company.Fundamentals.TwoDimensionalArrays.ATakeInputAndPrint;

public class SumOfBoundariesAndDiagonal {

    public static void totalSum(int[][] mat) {
        int totalSum = 0;
        int rows = mat.length;
        int cols = 0;
        if (rows > 0){
            cols = mat[0].length;
        }

        /* for boundaries : i==0, j==0, i == rows-1, j == cols-1
            for diagonal : i == j, (i+j) == rows-1
         */
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (i == 0 || j == 0 || i == rows-1 || j == cols-1 || i==j || (i + j) == rows-1){
                    totalSum += mat[i][j];
                }
            }
        }

        System.out.println(totalSum);
    }

    public static void main(String[] args) {

        int[][] arr = ATakeInputAndPrint.takeInput();
        totalSum(arr);
    }
}
