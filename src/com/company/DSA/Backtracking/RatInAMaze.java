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

        int n = maze.length;
        int[][] path = new int[n][n];
        return ratInAMaze(maze, 0, 0, n, path);
    }

    public static boolean ratInAMaze(int[][] maze, int x, int y, int n, int[][] path){

        // check if x, y is valid cell or not
        if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || path[x][y] == 1){ // path[x][y] = 1 means cell is visited, we are trying to visit again
            return false;
        }
        // include the cell in current path
        path[x][y] = 1;
        // Destination cell
        if (x == n-1 && y == n-1){
            for (int row = 0; row < n; row++){
                for (int col = 0; col < n; col++){
                    System.out.print(path[row][col] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // Explore further in all directions
        // top
        if (ratInAMaze(maze, x-1, y, n, path)){
            return true;
        }
        // right
        if (ratInAMaze(maze, x, y+1, n, path)){
            return true;
        }
        // down
        if (ratInAMaze(maze, x+1, y, n, path)){
            return true;
        }
        // left
        if (ratInAMaze(maze, x, y-1, n, path)){
            return true;
        }
        return false;
    }

//    public static boolean isValidPlace(int[][] maze, int x, int y, int n){
//        if (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public static void main(String[] args) {

        int[][] maze = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        boolean ans = ratInAMaze(maze);
        System.out.println(ans);
    }
}
