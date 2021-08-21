package com.company.Fundamentals.TwoDimensionalArrays;

public class CLargestColumnSum {

    public static int largestColumnSum(int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;
        int largestSum = Integer.MIN_VALUE;
        for (int j = 0; j < cols; j++){
            int sumOfColumn = 0;
            for (int i = 0; i < rows; i++){
                sumOfColumn += mat[i][j];
            }

            if (sumOfColumn > largestSum){
                largestSum = sumOfColumn;
            }
        }
        return largestSum;
    }

    public static void main(String[] args) {

        int[][] arr2d = ATakeInputAndPrint.takeInput();
        int ans = largestColumnSum(arr2d);
        System.out.println(ans);
    }
}
