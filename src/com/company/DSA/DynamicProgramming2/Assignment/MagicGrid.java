/*
You are given a magic grid A with R rows and C columns. In the cells of the grid,
you will either get magic juice, which increases your strength by |A[i][j]| points, or poison,
which takes away |A[i][j]| strength points. If at any point of the journey,
the strength points become less than or equal to zero, then you will die.
You have to start from the top-left corner cell (1,1) and reach at the bottom-right corner cell (R,C).
From a cell (i,j), you can only move either one cell down or right i.e.,
to cell (i+1,j) or cell (i,j+1) and you can not move outside the magic grid.
You have to find the minimum number of strength points with which
you will be able to reach the destination cell.
Input format:
The first line contains the number of test cases T. T cases follow.
Each test case consists of R C in the first line followed by the description of the grid in R lines,
each containing C integers.
Rows are numbered 1 to R from top to bottom and columns are numbered 1 to C from left to right.
Cells with A[i][j] < 0 contain poison, others contain magic juice.
Output format:
Output T lines, one for each case containing the minimum strength
you should start with from the cell (1,1) to have a positive strength through out
his journey to the cell (R,C).
Constraints:
1 ≤ T ≤ 5
2 ≤ R, C ≤ 500
-10^3 ≤ A[i][j] ≤ 10^3
A[1][1] = A[R][C] = 0
Time Limit: 1 second
Sample Input 1:
3
2 3
0 1 -3
1 -2 0
2 2
0 1
2 0
3 4
0 -2 -3 1
-1 4 0 -2
1 -2 -3 0
Sample Output 1:
2
1
2
 */
package com.company.DSA.DynamicProgramming2.Assignment;

public class MagicGrid {

    // iterative memoization : Bottom up approach
    public static int getMinimumStrength(int[][] grid, int m, int n) {

        // Base case
        if (m == 0 || n == 0){
            return 0;
        }
        int[][] storage = new int[m][n];
        storage[m-1][n-1] = 1; // last element
        for (int col = n-2; col >= 0; col--){ // last row
            storage[m-1][col] = storage[m-1][col+1] - grid[m-1][col];
        }
        for (int row = m-2; row >= 0; row--){ // last column
            storage[row][n-1] = storage[row+1][n-1] - grid[row][n-1];
        }

        for (int row = m-2; row >= 0; row--){
            for (int col = n-2; col >= 0; col--){

                int ans1 = storage[row+1][col];
                int ans2 = storage[row][col+1];
                storage[row][col] = Math.max(1, Math.min(ans1, ans2)-grid[row][col]);
            }
        }
        return storage[0][0];
    }

    public static void main(String[] args) {

//        int m = 2, n = 3;
//        int[][] grid = {{0, 1, -3},
//                        {1, -2, 0}};

        int m = 2, n = 2;
        int[][] grid = {{0, 1},
                        {2, 0}};


        int ans = getMinimumStrength(grid, m, n);
        System.out.println(ans);
    }
}