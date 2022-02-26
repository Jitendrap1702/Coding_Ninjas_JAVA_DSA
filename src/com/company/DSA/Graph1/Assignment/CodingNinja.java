/*
Given a NxM matrix containing Uppercase English Alphabets only.
Your task is to tell if there is a path in the given matrix which makes the sentence “CODINGNINJA” .
There is a path from any cell to all its neighbouring cells.
For a particular cell, neighbouring cells are those cells that share an edge or a corner with the cell.
Input Format :
The first line of input contains two space separated integers N and M,
where N is number of rows and M is the number of columns in the matrix.
Each of the following N lines contain M characters.
Please note that characters are not space separated.
Output Format :
Print 1 if there is a path which makes the sentence “CODINGNINJA” else print 0.
Constraints :
1 <= N <= 1000
1 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
2 11
CXDXNXNXNXA
XOXIXGXIXJX
Sample Output 1:
1
 */
package com.company.DSA.Graph1.Assignment;

import java.util.Scanner;

public class CodingNinja {

    static int solve(String[] Graph , int N, int M) {

        String searchString = "CODINGNINJA";
        boolean[][] visited = new boolean[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (Graph[i].charAt(j) == 'C'){
                    boolean ans = search(Graph, visited, searchString.substring(1), i, j, N, M);
                    if (ans){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    static boolean search(String[] graph, boolean[][] visited, String searchString, int i, int j, int N, int M){

        if (searchString.equals("")){
            visited[i][j] = true;
            return true;
        }

        visited[i][j] = true;
        // there are total 8 possible moves
        int[] x_dir = {-1, 1, 0, 0, 1, -1, -1, 1};
        int[] y_dir = {0, 0, -1, 1, 1, -1, 1, -1};
        for (int k = 0; k < x_dir.length; k++){

            int x = i + x_dir[k];
            int y = j + y_dir[k];
            if (x >= 0 && y >= 0 && x < N && y < M
                    && graph[x].charAt(y) == searchString.charAt(0)
                    && !visited[x][y]){

                boolean smallAns = search(graph, visited, searchString.substring(1), x, y, N, M);
                if (smallAns){
                    return true;
                }
            }
        }
        visited[i][j] = false; // if CODINGNINJA not found make all vertex non visited again
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] Graph = new String[N];
        for (int i = 0; i < N; i++){
            Graph[i] = sc.next();
        }

        int ans = solve(Graph, N, M);
        System.out.println(ans);
    }
}
