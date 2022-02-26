/*
Given an undirected graph G(V,E), check if the graph G is connected graph or not.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers,
that denote that there exists an edge between vertex a and b.
Output Format :
The first and only line of output contains "true" if the given graph is connected or "false", otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true
Sample Input 2:
4 3
0 1
1 3
0 3
Sample Output 2:
false
Sample Output 2 Explanation
The graph is not connected, even though vertices 0,1 and 3 are connected to each other but
there isn’t any path from vertices 0,1,3 to vertex 2.
 */
package com.company.DSA.Graph1;

import java.util.Scanner;

public class IsConnected {

    public static void isConnectedDFS(int[][] adjMatrix, boolean[] visited, int currentVertex){

        if (adjMatrix.length == 0){
            return;
        }
        visited[currentVertex] = true;
        for (int i = 0; i < adjMatrix.length; i++){
            if (adjMatrix[currentVertex][i] == 1 && !visited[i]){
                isConnectedDFS(adjMatrix, visited, i);
            }
        }
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
        // perform DFS using any one vertex as source vertex(i'm taking 0)
        boolean[] visited = new boolean[adjMatrix.length];
        isConnectedDFS(adjMatrix, visited, 0);
        // if graph is connected then after performed DFS all vertex will be marked as visited
        // if any of vertex is not visited then given graph is not a connected graph
        boolean isConnected = true;
        for (int i = 0; i < adjMatrix.length; i++){
            if (!visited[i]){
                isConnected = false;
                break;
            }
        }
        System.out.println(isConnected);
    }
}
