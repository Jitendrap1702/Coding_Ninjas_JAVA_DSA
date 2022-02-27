/*
It's Gary's birthday today and he has ordered his favourite square cake consisting of '0's and '1's .
 But Gary wants the biggest piece of '1's and no '0's .
 A piece of cake is defined as a part which consist of only '1's, and all '1's share an edge with each other on the cake.
 Given the size of cake N and the cake, can you find the count of '1's in the biggest piece of '1's for Gary ?
Input Format :
The first line of input contains an integer, that denotes the value of N.
Each of the following N lines contain N space separated integers.
Output Format :
Print the count of '1's in the biggest piece of '1's, according to the description in the task.
Constraints :
1 <= N <= 1000
Time Limit: 1 sec
Sample Input 1:
2
1 1
0 1
Sample Output 1:
3
 */
package com.company.DSA.Graph1.Assignment;

import java.util.Scanner;

public class LargestPiece {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public static int dfs(String[] edge, int n) {

        boolean[][] visited = new boolean[n][n];
        int max = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (edge[i].charAt(j) == '1' && !visited[i][j]) {
                    int ans = max1s(edge, visited, i, j, n);
                    if (ans > max){
                        max = ans;
                    }
                }
            }
        }
        return max;
    }

    static int max1s(String[] edge, boolean[][] visited, int x, int y, int n){

        int max = 0;
        visited[x][y] = true;
        for (int i = 0; i < dir.length; i++){
            int a = x + dir[i][0];
            int b = y + dir[i][1];

            if (a >= 0 && b >= 0 && a < n && b < n && edge[a].charAt(b) == '1' && !visited[a][b]){
                int ans = max1s(edge, visited, a, b, n);
                max = max + ans;
            }
        }
        return 1 + max;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] edge = new String[n];
        for (int i = 0; i < n; i++){
            edge[i] = sc.next();
        }

        int ans = dfs(edge, n);
        System.out.println(ans);
    }
}
