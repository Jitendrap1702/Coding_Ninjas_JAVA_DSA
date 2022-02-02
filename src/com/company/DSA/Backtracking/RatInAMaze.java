/*
You are given a N*N maze with a rat placed at maze[0][0].
Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1].
Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1.
Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false
 */
package com.company.DSA.Backtracking;

public class RatInAMaze {

    public static boolean ratInAMaze(int[][] maze){

        return ratInAMaze(maze, 0, 0, maze.length);
    }

    public static boolean ratInAMaze(int[][] maze, int x, int y, int n){

        // Base case
        if (x == n-1 && y == n-1){
            return true;
        }
        if (isValidPlace(maze, x, y, n)){
            if (ratInAMaze(maze, x+1, y, n)){
                return true;
            }
            if (ratInAMaze(maze, x, y+1, n)){
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isValidPlace(int[][] maze, int x, int y, int n){
        if (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[][] maze = {{1, 0, 1}, {1, 0, 1}, {1, 1, 1}};
        boolean ans = ratInAMaze(maze);
        System.out.println(ans);
    }
}
