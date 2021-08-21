
/* Question
    Given a 2D integer array with n rows and m columns. Print the 0th row from input n times,
    1st row n-1 times…..(n-1)th row will be printed 1 time.

    Input format :

    Line 1 : No of rows(n) & No of columns(m) (separated by space)

    Line 2 : Row 1 elements (separated by space)

    Line 3 : Row 2 elements (separated by space)

    Line 4 : and so on

    Sample Input :
    3 3
    1    2    3
    4    5    6
    7    8    9
    Sample Output :
    1    2    3
    1    2    3
    1    2    3
    4    5    6
    4    5    6
    7    8    9

 */


package com.company.Fundamentals.Test2;

import com.company.Fundamentals.TwoDimensionalArrays.ATakeInputAndPrint;

public class Print2DArray {

    public static void print2DArray(int input[][]) {

        int row = input.length;
        int col = 0;
        if (row > 0){
            col = input[0].length;
        }
        for (int i = 0; i < row; i++){
            int count = row - i;
            while (count > 0){
                for (int j = 0; j < col; j++){
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
                count--;
            }
        }

    }

    public static void main(String[] args) {

        int[][] arr = ATakeInputAndPrint.takeInput();
        print2DArray(arr);
    }
}
