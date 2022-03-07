package com.company.DSA.Graph1;

import java.util.ArrayList;
import java.util.Scanner;

public class DepthFirstTraversal {

    public static void dFTraversal(int[][] adjMatrix, int currentVertex){

        System.out.print(currentVertex + " ");
        for (int i = currentVertex; i < adjMatrix.length; i++){ // run loop for non traversed vertex only
            // call for all adjacent vertex of current vertex
            if (adjMatrix[currentVertex][i] == 1){
                dFTraversal(adjMatrix, i);
            }
        }
    }

    // By taking visited array
    public static void dFTraversal2(int[][] adjMatrix, int currentVertex, boolean[] visited){

        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");
        for (int i = 0; i < adjMatrix.length; i++){ // run loop for non traversed vertex only
            // call for all adjacent vertex of current vertex
            if (adjMatrix[currentVertex][i] == 1 && !visited[i]){
                dFTraversal2(adjMatrix, i, visited);
            }
        }
    }

    public static void dFTraversal(int[][] adjMatrix){

        boolean[] visited = new boolean[adjMatrix.length];
        // for disconnected graph also
        for (int i = 0; i < adjMatrix.length; i++){
            if (!visited[i]){ // if not visited then call bfs for that
                dFTraversal2(adjMatrix, i, visited);
                System.out.println();
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
        for (int i = 0; i < v; i++){
            for (int j = 0; j < v; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Depth First Traversal
        System.out.println("Depth First Traversal : ");
        dFTraversal(adjMatrix);
    }
}
