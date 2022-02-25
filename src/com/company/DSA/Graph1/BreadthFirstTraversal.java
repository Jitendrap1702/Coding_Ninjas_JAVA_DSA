/*
Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
1. Here you need to consider that you need to print BFS path starting from vertex 0 only.
2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
3. E is the number of edges present in graph G.
4. Take graph input in the adjacency matrix.
5. Handle for Disconnected Graphs as well
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers,
that denote that there exists an edge between vertex a and b.
Output Format :
Print the BFS Traversal, as described in the task.
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
0 1 3 2
 */
package com.company.DSA.Graph1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFirstTraversal {

    public static void bFTraversalHelper(int[][] adjMatrix, boolean[] visited, int currentVertex){

        // create a queue
        Queue<Integer> pendingVertices = new LinkedList<>();
        pendingVertices.add(currentVertex);
        // mark source vertex visited
        visited[currentVertex] = true;
        while (!pendingVertices.isEmpty()){
            // remove topEle from queue
            currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");
            // put all non-visited adjacent vertices of topEle in queue
            for (int i = 0; i < adjMatrix.length; i++){
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void bFTraversal(int[][] adjMatrix){

        // create array
        boolean[] visited = new boolean[adjMatrix.length];

        // call bfs for source vertex 0
        bFTraversalHelper(adjMatrix, visited, 0);

        // if disconnected graph
        for (int i = 0; i < adjMatrix.length; i++){
            if (!visited[i]){ // if not visited then call bfs for that
                bFTraversalHelper(adjMatrix, visited, i);
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
        // print adjMatrix
//        for (int i = 0; i < v; i++){
//            for (int j = 0; j < v; j++){
//                System.out.print(adjMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Breadth First Traversal

        // array of vertices : by default all non-visited
        boolean[] visited = new boolean[adjMatrix.length];
        // create a queue
        Queue<Integer> pendingVertices = new LinkedList<>();
        if (v == 0){
            System.out.println();
        }
        else if(e == 0){
            for (int i = 0; i < v; i++){
                System.out.print(i + " ");
            }
        }
        else {
            bFTraversal(adjMatrix);
        }
    }
}
