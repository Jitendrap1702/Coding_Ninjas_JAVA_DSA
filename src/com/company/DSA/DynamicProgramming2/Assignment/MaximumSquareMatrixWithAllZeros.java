/*
Given an NxM matrix that contains only 0s and 1s,
find out the size of the maximum square sub-matrix with all 0s.
You need to return the size of the square matrix with all 0s.
Input format :
The first line of the test case contains two integer values, 'N' and 'M',
separated by a single space. They represent the 'rows' and 'columns' respectively.

Second-line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith rows constitutes column values separated by a single space (Either 0 or 1).
Output Format:
Print the size of maximum square sub-matrix.
 Constraints :
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec
Sample Input 1:
3 3
1 1 0
1 1 1
1 1 1
Sample Output 1:
1
Sample Input 2:
4 4
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
Sample Output 2:
4
 */
package com.company.DSA.DynamicProgramming2.Assignment;

public class MaximumSquareMatrixWithAllZeros {

    public static int findMaxSquareWithAllZeros(int[][] input){

        int m = input.length;
        if (m == 0){
            return 0;
        }
        int n = input[0].length;
        if (n == 0){
            return 0;
        }
        int[][] storage = new int[m][n]; // (i, j) will have maxsize array with all zeros including (i, j)
        int ans = 0;
         // First row
        for (int i = 0; i < n; i++){
            if (input[0][i] == 0){
                storage[0][i] = 1;
                ans = 1;
            }
        }
        // first column
        for (int j = 0; j < m; j++){
            if (input[j][0] == 0){
                storage[j][0] = 1;
                ans = 1;
            }
        }

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                if (input[i][j] == 0){
                    int ans1 = storage[i-1][j-1];
                    int ans2 = storage[i-1][j];
                    int ans3 = storage[i][j-1];
                    storage[i][j] = 1 + Math.min(ans1, Math.min(ans2, ans3));
                }

                if (storage[i][j] > ans){
                    ans = storage[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

//        int m = 3, n = 3;
//        int[][] input = {{1, 1, 0},
//                {1, 1, 1},
//                {1, 1, 1}};
        int m = 4, n = 4;
        int[][] input = {{0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0}};

        int ans = findMaxSquareWithAllZeros(input);
        System.out.println(ans);
    }
}
