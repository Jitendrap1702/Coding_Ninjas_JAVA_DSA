/*
we can do it in 2 ways:
1. using DFS
2. using BFS
 */

package com.company.DSA.Graph1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {

    // Using DFS
    public static boolean hasPath(int[][] adjMatrix, int a, int b) {

        boolean[] visited = new boolean[adjMatrix.length];
        return hasPathHelper(adjMatrix, a, b, visited);
    }

    public static boolean hasPathHelper(int[][] adjMatrix, int a, int b, boolean[] visited) {

        int n = adjMatrix.length;;
        if (a >= n || b >= n){
            return false;
        }
        visited[a] = true;
        if (a == b) { // adjMatrix[a][b] == 1
            return true;
        }
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[a][i] == 1 && !visited[i]) {
                return hasPathHelper(adjMatrix, i, b, visited);
            }
        }
        return false;
    }

    // using BFS
    public static boolean hasPath2(int[][] adjMatrix, int currentVertex, int destinationVertex){

        int n = adjMatrix.length;;
        if (currentVertex >= n || destinationVertex >= n){
            return false;
        }
        if (adjMatrix[currentVertex][destinationVertex] == 1){
            return true;
        }
        // create array
        boolean[] visited = new boolean[adjMatrix.length];
        // create a queue
        Queue<Integer> pendingVertices = new LinkedList<>();
        pendingVertices.add(currentVertex);
        // mark source vertex visited
        visited[currentVertex] = true;
        while (!pendingVertices.isEmpty()){
            // remove topEle from queue
            currentVertex = pendingVertices.poll();
            if (visited[currentVertex] && visited[destinationVertex]){
                return true;
            }
            // put all non-visited adjacent vertices of topEle in queue
            for (int i = 0; i < adjMatrix.length; i++){
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(); // no. of vertices
        int e = sc.nextInt(); // no. of edges
        // assumption : if v = 4 then vertices will be : (0, 1, 2, 3)
        // we have to check there is exists edge between a and b or not
        int[][] adjMatrix = new int[v][v];
        // take all edges input
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        int a = sc.nextInt(); // start vertex
        int b = sc.nextInt(); // destination vertex
        // Has Path
        boolean ans = hasPath2(adjMatrix, a, b);
        System.out.println(ans);
    }
}
