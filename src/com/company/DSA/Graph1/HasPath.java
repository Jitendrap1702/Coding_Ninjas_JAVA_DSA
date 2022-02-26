/*
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers),
check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers,
that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true,
if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= V - 1
0 <= v2 <= V - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false
 */
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
