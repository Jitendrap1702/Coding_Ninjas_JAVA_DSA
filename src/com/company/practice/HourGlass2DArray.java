//hour glass is look like this:-
//      a  b  c
//         d
//      e  f  g


package com.company.practice;

import java.util.Scanner;

public class HourGlass2DArray {

    public static void main(String [] args){

        // All Inputs

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];

        for( int row = 0; row < n; row++){
            for( int col = 0; col < n; col++){
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        // Solution Part
        System.out.println(maxHourGlass(arr));
    }

    private static int maxHourGlass(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for( int row = 0; row < arr.length - 2; row++){
            for( int col = 0; col < arr.length - 2; col++){
                int sum = findSum(arr, row, col);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    private static int findSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                                + arr[row+1][col+1] +
                arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];

        return sum;
    }
}
