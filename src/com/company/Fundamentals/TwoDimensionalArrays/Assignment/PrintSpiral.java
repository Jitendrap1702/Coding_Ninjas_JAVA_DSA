package com.company.Fundamentals.TwoDimensionalArrays.Assignment;

import com.company.Fundamentals.TwoDimensionalArrays.ATakeInputAndPrint;

public class PrintSpiral {

    public static void spiralPrint(int matrix[][]){

        int rows = matrix.length;
        int cols = 0;
        if (rows > 0){
            cols = matrix[0].length;
        }

        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;

        while (true){

            // 1. print top row (left to right)
            if (colStart > colEnd){
                break;
            }
            for (int i = colStart; i <= colEnd; i++){
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // 2. print right column (top to bottom)
            if (rowStart > rowEnd){
                break;
            }
            for (int i = rowStart; i <= rowEnd; i++){
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            // 3. print bottom row (right to left)
            if (colStart > colEnd){
                break;
            }
            for (int i = colEnd; i >= colStart; i--){
                System.out.print(matrix[rowEnd][i] + " ");
            }
            rowEnd--;

            // 4. print left column (bottom to top)
            if (rowStart > rowEnd){
                break;
            }
            for (int i = rowEnd; i >= rowStart; i--){
                System.out.print(matrix[i][colStart] + " ");
            }
            colStart++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = ATakeInputAndPrint.takeInput();
        spiralPrint(arr);
    }
}
