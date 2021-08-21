
/* Question
    For a given two-dimensional integer array/list of size (N x M),
    find and print the sum of each of the row elements in a single line, separated by a single space.

    Sample Input 1:
    4 2
    1 2
    3 4
    5 6
    7 8

    Sample Output 1:
    3 7 11 15

 */

package com.company.Fundamentals.TwoDimensionalArrays;

public class BRowWiseSum {

    public static void rowWiseSum(int[][] mat) {

        for (int i =0; i < mat.length; i++){
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++){
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
    }


    public static void main(String[] args) {

        int[][] arr2d = ATakeInputAndPrint.takeInput();
        rowWiseSum(arr2d);
    }
}
