/*
An integer matrix of size (M x N) has been given.
Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).
From a cell (i, j), you can move in three directions:
1. ((i + 1),  j) which is, "down"
2. (i, (j + 1)) which is, "to the right"
3. ((i+1), (j+1)) which is, "to the diagonal"
The cost of a path is defined as the sum of each cell's values through which the route passes.
 Input format :
The first line of the test case contains two integer values, 'M' and 'N',
separated by a single space. They represent the 'rows' and 'columns' respectively,
for the two-dimensional array/list.

The second line onwards, the next 'M' lines or rows represent the ith row values.

Each of the ith row constitutes 'N' column values separated by a single space.
Output format :
Print the minimum cost to reach the destination.
Constraints :
1 <= M <= 10 ^ 2
1 <= N <=  10 ^ 2

Time Limit: 1 sec
Sample Input 1 :
3 4
3 4 1 2
2 1 8 9
4 7 8 1
Sample Output 1 :
13
Sample Input 2 :
3 4
10 6 9 0
-23 8 9 90
-200 0 89 200
Sample Output 2 :
76
Sample Input 3 :
5 6
9 6 0 12 90 1
2 7 8 5 78 6
1 6 0 5 10 -4
9 6 2 -10 7 4
10 -2 0 5 5 7
Sample Output 3 :
18
 */
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
        for (int i = 0; i < m ; i++){
            for (int j = 0; j < n; j++){
                memo[i][j] = -1;
            }
        }

        return minCostPathRecursiveDPHelper(input, row, col, m, n, memo);
    }

    public static int minCostPathRecursiveDPHelper(int[][] input, int row, int col, int m, int n, int[][] memo) {

        // Base case
        if (row == m-1 && col == n-1){
            return input[row][col];
        }

        int horizontalStep = Integer.MAX_VALUE;
        if (row < m && col+1 < n) {
            if (memo[row][col+1] == -1) {
                horizontalStep = minCostPathRecursiveDPHelper(input, row, col + 1, m, n, memo);
                memo[row][col+1] = horizontalStep;
            }else{
                horizontalStep = memo[row][col+1];
            }
        }

        int verticalStep = Integer.MAX_VALUE;
        if (row+1 < m && col < n) {
            if (memo[row+1][col] == -1) {
                verticalStep = minCostPathRecursiveDPHelper(input, row + 1, col, m, n, memo);
                memo[row+1][col] = verticalStep;
            }else {
                verticalStep = memo[row+1][col];
            }
        }

        int diagonalStep = Integer.MAX_VALUE;
        if (row+1 < m && col+1 < n) {
            if (memo[row+1][col+1] == -1) {
                diagonalStep = minCostPathRecursiveDPHelper(input, row + 1, col + 1, m, n, memo);
                memo[row+1][col+1] = diagonalStep;
            }else {
                diagonalStep = memo[row+1][col+1];
            }
        }

        return input[row][col] + Math.min(horizontalStep, Math.min(verticalStep, diagonalStep));
    }
//    public static int minCostPathRecursiveDP(int[][] input, int row, int col, int m, int n) {
//
//        int[][] memo = new int[m+1][n+1];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                memo[i][j] = Integer.MIN_VALUE;
//            }
//        }
//
//        return minCostPathRecursiveDPHelper(input, row, col, m, n, memo);
//    }
//
//    public static int minCostPathRecursiveDPHelper(int[][] input, int row, int col, int m, int n, int[][] memo) {
//
//        // Base case
//        if (row >= m && col >= n){
//            return Integer.MAX_VALUE;
//        }
//
//        // special case
//        if (row == m-1 && col == n-1){
//            return input[row][col];
//        }
//
//        int horizontalStep = Integer.MAX_VALUE;
//            if (memo[row][col+1] == Integer.MIN_VALUE) {
//                horizontalStep = minCostPathRecursiveDPHelper(input, row, col + 1, m, n, memo);
//                memo[row][col+1] = horizontalStep;
//            }else{
//                horizontalStep = memo[row][col+1];
//            }
//
//        int verticalStep = Integer.MAX_VALUE;
//            if (memo[row+1][col] == Integer.MIN_VALUE) {
//                verticalStep = minCostPathRecursiveDPHelper(input, row + 1, col, m, n, memo);
//                memo[row+1][col] = verticalStep;
//            }else {
//                verticalStep = memo[row+1][col];
//            }
//
//        int diagonalStep = Integer.MAX_VALUE;
//            if (memo[row+1][col+1] == Integer.MIN_VALUE) {
//                diagonalStep = minCostPathRecursiveDPHelper(input, row + 1, col + 1, m, n, memo);
//                memo[row+1][col+1] = diagonalStep;
//            }else {
//                diagonalStep = memo[row+1][col+1];
//            }
//
//        return input[row][col] + Math.min(horizontalStep, Math.min(verticalStep, diagonalStep));
//    }

    // 3. Iterative using memoization :- Top Down Approach
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
        int ans2 = minCostPath(input, 0, 0, m, n);
        System.out.println(ans2);

        int ans = minCostPathRecursiveDP(input, 0, 0, m, n);
        System.out.println(ans);

        int ans1 = minCostPathIterativeDP(input, m, n);
        System.out.println(ans1);
    }
}
