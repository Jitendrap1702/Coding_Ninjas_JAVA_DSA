
/* Question
    For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order,
    i.e, print the first column top to bottom, next column bottom to top and so on.

    Sample Input 1:
    3 4
    1  2  3  4
    5  6  7  8
    9 10 11 12

    Sample Output 1:
    1 5 9 10 6 2 3 7 11 12 8 4

 */

package com.company.Fundamentals.TwoDimensionalArrays.Assignment;

import com.company.Fundamentals.TwoDimensionalArrays.ATakeInputAndPrint;

public class PrintLikeAWave {

    public static void wavePrint(int mat[][]){

        int rows = mat.length;
        int cols = 0;
        if (rows > 0){
            cols = mat[0].length;
        }

        for (int j = 0; j < cols; j++){

            // if column no is even then print top to bottom
            if (j % 2 == 0){
                for (int i = 0; i < rows; i++){
                    System.out.print(mat[i][j] + " ");
                }
            }
            // if column no is odd then print bottom to top
            else{
                for (int i = rows-1; i >= 0; i--){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = ATakeInputAndPrint.takeInput();
        wavePrint(arr);
    }
}
