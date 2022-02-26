/*
An island is a small piece of land surrounded by water .
A group of islands is said to be connected if we can reach from any given island to any other island in the same group .
Given V islands (numbered from 1 to V) and E connections or edges between islands.
Can you count the number of connected groups of islands.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers,
that denote that there exists an edge between vertex a and b.
Output Format :
Print the count the number of connected groups of islands
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V-1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
5 8
0 1
0 4
1 2
2 0
2 4
3 0
3 2
4 3
Sample Output 1:
1
 */
package com.company.DSA.Graph1.Assignment;

import java.util.Scanner;

public class Islands {

    public static void DFS(int[][] edges, int currentVertex, boolean[] visited){

        visited[currentVertex] = true;
        for (int i = 0; i < edges.length; i++){
            if (edges[currentVertex][i] == 1 && !visited[i]){
                DFS(edges, i, visited);
            }
        }
    }

    public static int numConnected(int[][] edges, int n) {

        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                DFS(edges, i, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); // no. of vertices
        int e = sc.nextInt(); // no. of edges
        // assumption : if v = 4 then vertices will be : (0, 1, 2, 3)
        int[][] adjMatrix = new int[v][v];
        // take all edges input
        for (int i = 0; i < e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        int ans = numConnected(adjMatrix, adjMatrix.length);
        System.out.println(ans);
    }
}
