package com.company.DSA.DynamicProgramming2;

public class MinCostPath {

    // 1. Recursive
    public static int minCostPath(int[][] input, int row, int col, int m, int n) {

        // Base case
        if (row >= m || col >= n) {
            return Integer.MAX_VALUE;
        }
        // special case
        if (row == m - 1 && col == n - 1) {
            return input[row][col];
        }

        int horizontalStep = minCostPath(input, row, col + 1, m, n);
        int verticalStep = minCostPath(input, row + 1, col, m, n);
        int diagonalStep = minCostPath(input, row + 1, col + 1, m, n);

        return input[row][col] + Math.min(horizontalStep, Math.min(verticalStep, diagonalStep));
    }

    // 2. Recursive using Memoization
    public static int minCostPathRecursiveDP(int[][] input, int row, int col, int m, int n) {

        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        return minCostPathRecursiveDPHelper(input, row, col, m, n, memo);
    }

    public static int minCostPathRecursiveDPHelper(int[][] input, int row, int col, int m, int n, int[][] memo) {

        // Base case
        if (row >= m || col >= n) {
            return Integer.MAX_VALUE;
        }
        // special case
        if (row == m - 1 && col == n - 1) {
            return input[row][col];
        }

        int horizontalStep;
        if (memo[row][col + 1] == -1) {
            horizontalStep = minCostPathRecursiveDPHelper(input, row, col + 1, m, n, memo);
            memo[row][col + 1] = horizontalStep;
        } else {
            horizontalStep = memo[row][col + 1];
        }

        int verticalStep;
        if (memo[row + 1][col] == -1) {
            verticalStep = minCostPathRecursiveDPHelper(input, row + 1, col, m, n, memo);
            memo[row + 1][col] = verticalStep;
        } else {
            verticalStep = memo[row + 1][col];
        }

        int diagonalStep;
        if (memo[row + 1][col + 1] == -1) {
            diagonalStep = minCostPathRecursiveDPHelper(input, row + 1, col + 1, m, n, memo);
            memo[row + 1][col + 1] = diagonalStep;
        } else {
            diagonalStep = memo[row + 1][col + 1];
        }

        return input[row][col] + Math.min(horizontalStep, Math.min(verticalStep, diagonalStep));
    }

    // 3. Iterative using memoization
    public static int minCostPathIterativeDP(int[][] input, int m, int n) {

        int[][] memo = new int[m][n];
//        for (int i = 0; i < m; i++){
//            for (int j = 0; j < n; j++){
//                memo[i][j] = Integer.MAX_VALUE;
//            }
//        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    memo[i][j] = input[i][j];
                    continue;
                }

                // horizontal
                int horizontalStep = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    horizontalStep = memo[i][j - 1];
                }

                // vertical
                int verticalStep = Integer.MAX_VALUE;
                if (i - 1 >= 0) {
                    verticalStep = memo[i - 1][j];
                }

                // diagonal
                int diagonalStep = Integer.MAX_VALUE;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    diagonalStep = memo[i - 1][j - 1];
                }

                memo[i][j] = input[i][j] + Math.min(horizontalStep, Math.min(verticalStep, diagonalStep));
            }
        }
        return memo[m - 1][n - 1];
    }

    public static void main(String[] args) {

//        int m = 3, n = 4;
//        int[][] input = {{3, 4, 1, 2}, {2, 1, 8, 9}, {4, 7, 8, 1}};

        int m = 5, n = 6;
        int[][] input = {{9, 6, 0, 12, 90, 1},
                {2, 7, 8, 5, 78, 6},
                {1, 6, 0, 5, 10, -4},
                {9, 6, 2, -10, 7, 4},
                {10, -2, 0, 5, 5, 7}};
        int ans = minCostPath(input, 0, 0, m, n);
        System.out.println(ans);

//        int ans = minCostPathRecursiveDP(input, 0, 0, m, n);
//        System.out.println(ans);

//        int ans = minCostPathIterativeDP(input, m, n);
//        System.out.println(ans);
    }
}
