/*
Gary has a board of size NxM. Each cell in the board is a coloured dot.
There exist only 26 colours denoted by uppercase Latin characters (i.e. A,B,...,Z).
Now Gary is getting bored and wants to play a game. The key of this game is to find a cycle that
contain dots of same colour. Formally, we call a sequence of dots d1, d2, ..., dk a cycle
if and only if it meets the following condition:
1. These k dots are different: if i ≠ j then di is different from dj.
2. k is at least 4.
3. All dots belong to the same colour.
4. For all 1 ≤ i ≤ k - 1: di and di + 1 are adjacent.
Also, dk and d1 should also be adjacent. Cells x and y are called adjacent if they share an edge.
Since Gary is colour blind, he wants your help.
Your task is to determine if there exists a cycle on the board.
Input Format :
The first line of input contains two space separated integers N and M,
where N is number of rows and M is the number of columns of the board.
Each of the following N lines contain M characters.
Please note that characters are not space separated. Each character is an uppercase Latin letter.
Output Format :
Print true if there is a cycle in the board, else print false.
Constraints :
2 <= N <= 1000
2 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
3 4
AAAA
ABCA
AAAA
Sample Output 1:
true
 */
package com.company.DSA.Graph1.Assignment;

import java.util.Scanner;

public class ConnectingDots {

    static int solve(String[] board , int n, int m){

        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                boolean ans = findCircle(board, visited, -1, -1, i, j);
                if (ans){
                    return 1;
                }
            }
        }
        return 0;
    }

    static boolean findCircle(String[] board, boolean[][] visited, int fromX, int fromY, int i, int j){

        if (visited[i][j]){
            return true;
        }

        visited[i][j] = true;
        // there are possible 4 possible moves
        int[] x_dir = {0, 1, -1, 0};
        int[] y_dir = {-1, 0, 0, 1};
        for (int k = 0; k < x_dir.length; k++){
            int x = i + x_dir[k];
            int y = j + y_dir[k];
            if (x == fromX && y == fromY){
                continue;
            }
            // if move is legal than move
            if (x >= 0 && y >= 0 && x < board.length && y < board[x].length() && board[x].charAt(y) == board[i].charAt(j)){
                boolean smallAns = findCircle(board, visited, i, j, x, y);
                if (smallAns){
                    return true;
                }
            }
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] board = new String[N];
        for (int i = 0; i < N; i++){
            board[i] = sc.next();
        }

        int ans = solve(board, N, M);
        System.out.println(ans);
    }
}
