
/* Question
    For a given two-dimensional integer array/list of size (N x M),
    you need to find out which row or column has the largest sum(sum of all the elements in a row/column)
    amongst all the rows and columns.

    Note : If there are more than one rows/columns with maximum sum, consider the row/column that
    comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.

    Output Format :
    For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
    OR
    If column sum is maximum, then print: "column" <col_index> <col_sum>
    It will be printed in a single line separated by a single space between each piece of information.

    Output for every test case will be printed in a seperate line.

    Sample Input 1 :
    2 2
    1 1
    1 1
    Sample Output 1 :
    row 0 2

    Sample Input 2 :
    3 3
    3 6 9
    1 4 7
    2 8 9
    Sample Output 2 :
    column 2 25

 */

package com.company.Fundamentals.TwoDimensionalArrays;

public class DLargestRowOrColumn {

    public static void findLargest(int mat[][]){
        int rows = mat.length;
        int cols = 0;
        if (rows > 0){ // indexOutOfBoundException for empty 2d array
            cols = mat[0].length;
        }

        // calculate largest row in mat
        int largestRowSum = Integer.MIN_VALUE;
        int largestRowNumber = 0;
        for (int i = 0; i < rows; i++){
            int sum = 0;
            for (int j = 0; j < cols; j++){
                sum += mat[i][j];
            }
            if (sum > largestRowSum){
                largestRowSum = sum;
                largestRowNumber = i;
            }
        }

        // calculate largest column in mat
        int largestColSum = Integer.MIN_VALUE;
        int largestColNumber = 0;
        for (int j = 0; j < cols; j++){
            int sum = 0;
            for (int i = 0; i < rows; i++){
                sum += mat[i][j];
            }
            if (sum > largestColSum){
                largestColSum = sum;
                largestColNumber = j;
            }
        }

        // now check columns sum is largest or rows
        if (largestRowSum >= largestColSum){
            System.out.println("row " + largestRowNumber + " " + largestRowSum);
        }else{
            System.out.println("column " + largestColNumber + " " + largestColSum);
        }

    }


    public static void main(String[] args) {

        int[][] arr2d = ATakeInputAndPrint.takeInput();
        findLargest(arr2d);
    }
}
