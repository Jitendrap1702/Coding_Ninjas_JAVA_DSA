/*
Given an undirected graph G(V, E) and two vertices v1 and v2(as integers),
find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using DFS and print the first path that you encountered.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
Print the path from v1 to v2 in reverse order.
Constraints :
2 <= V <= 1000
1 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
 */
package com.company.DSA.Graph1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

    public static ArrayList<Integer> getPathDFS(int[][] adjMatrix, int s, int e, boolean[] visited){

        // Base case
        if (s == e){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(s);
            return output;
        }

        visited[s] = true; // mark s visited
        for (int i = 0; i < adjMatrix.length; i++){
            if (adjMatrix[s][i] == 1 && !visited[i]){
                ArrayList<Integer> smallOutput = getPathDFS(adjMatrix, i, e, visited);

                // if smallOutput null that means path from this neighbour is not exists, move to next neighbour
                // if not null that means path found, add s to smallOutput and return
                if (smallOutput != null){
                    smallOutput.add(s);
                    return smallOutput;
                }
            }
        }
        return null;
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
        int s = sc.nextInt(); // start vertex
        int d = sc.nextInt(); // destination vertex
        boolean[] visited = new boolean[adjMatrix.length];
        ArrayList<Integer> ans = getPathDFS(adjMatrix, s, d, visited);
        if(ans != null){
            for (int i: ans){
                System.out.print(i + " ");
            }
        }
    }
}
