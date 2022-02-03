/*
You are given N, and for a given N x N chessboard, find a way to place N queens such that
no queen can attack any other queen on the chess board.
A queen can be killed when it lies in the same row, or same column,
or the same diagonal of any of the other queens. You have to print all such configurations.
Input Format :
Line 1 : Integer N
Output Format :
One Line for every board configuration.
Every line will have N*N board elements printed row wise and are separated by space
Note : Don't print anything if there isn't any valid configuration.
Constraints :
1<=N<=10
Sample Input 1:
4
Sample Output 1 :
0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0
0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0
 */

package com.company.DSA.Backtracking;

public class NQueen {

    public static void placeNQueens(int n){

        placeNQueens(new int[n][n],0, n);
    }

    private static void placeNQueens(int[][] board, int row, int n) {

        if (row == n){
            // valid board configuration
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // check for all columns
            // check if its safe to place queen
                // if its safe -> then place the queen and move to next row
        for (int col = 0; col < n; col++){
            if (isSafe(board, row, col, n)){
                board[row][col] = 1;
                placeNQueens(board, row+1, n);
                board[row][col] = 0; // remove queen while backtracking
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int n){

        // check column on upper side
        for (int i = row; i >= 0; i--){
            if (board[i][col] == 1){
                return false;
            }
        }
        // check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 1){
                return false;
            }
        }
        // check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < n; i--, j++){
            if (board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 4;
        placeNQueens(n);
    }
}
