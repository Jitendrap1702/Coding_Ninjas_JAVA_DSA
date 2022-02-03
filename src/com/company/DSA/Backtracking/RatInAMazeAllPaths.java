/*
You are given a N*N maze with a rat placed at maze[0][0].
Find and print all paths that rat can follow to reach its destination i.e. maze[N-1][N-1].
Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1.
Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
The first line of input contains an integer 'N' representing
the dimension of the maze.
The next N lines of input contain N space-separated
integers representing the type of the cell.
Output Format :
For each test case, print the path from start position to destination position and
only cells that are part of the solution path should be 1, rest all cells should be 0.

Output for every test case will be printed in a separate line.
Constraints:
0 < N < 11 0 <= Maze[i][j] <=1

Time Limit: 1sec
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
1 0 0 1 0 0 1 1 1
Sample Output 1 Explanation :
Only 1 path is possible

1 0 0
1 0 0
1 1 1
Which is printed from left to right and then top to bottom in one line.

Sample Input 2 :
3
1 0 1
1 1 1
1 1 1
Sample Output 2 :
1 0 0 1 1 1 1 1 1
1 0 0 1 0 0 1 1 1
1 0 0 1 1 0 0 1 1
1 0 0 1 1 1 0 0 1
Sample Output 2 Explanation :
4 paths are possible which are printed in the required format.
 */
package com.company.DSA.Backtracking;

public class RatInAMazeAllPaths {

    static void ratInAMaze(int[][] maze, int n) {

        printAllPaths(maze, 0, 0, n, new int[n][n]);
    }

    public static void printAllPaths(int[][] maze, int x, int y, int n, int[][] path){

        // check is x, y is valid cell or not
        if (x < 0 || x >= n || y < 0 || y >= n || maze[x][y] == 0 || path[x][y] == 1){
            return;
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
            System.out.println();
            path[x][y] = 0; // reset as unvisited cell
            return;
        }

        // Explore further in all directions
        // top
        printAllPaths(maze, x-1, y, n, path);
        // right
        printAllPaths(maze, x, y+1, n, path);
        // down
        printAllPaths(maze, x+1, y, n, path);
        // left
        printAllPaths(maze, x, y-1, n, path);

        path[x][y] = 0; // reset as unvisited cell
    }


    public static void main(String[] args) {

        int[][] maze = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        ratInAMaze(maze, maze.length);
    }
}
