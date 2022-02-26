/*
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers),
find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using BFS and print the shortest path available.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
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

/*
It will give smallest possible path between two vertex
 */
package com.company.DSA.Graph1;

import java.util.*;

public class GetPathBFS {

    public static ArrayList<Integer> getPathBFS(int[][] adjMatrix, int s, int e, boolean[] visited){

        // consider a map of key :- vertex and its value :- parent of vertex
        HashMap<Integer, Integer> map = new HashMap<>();
        if (s == e){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(s);
            return output;
        }
        Queue<Integer> pendingVertices = new LinkedList<>();
        pendingVertices.add(s);
        visited[s] = true;
        while (!pendingVertices.isEmpty()){
            int currentVertices = pendingVertices.poll();
            for (int i = 0; i < adjMatrix.length; i++){
                if (adjMatrix[currentVertices][i] == 1 && !visited[i]){
                    pendingVertices.add(i);
                    visited[i] = true;
                    map.put(i, currentVertices);
                }
            }
        }
        ArrayList<Integer> output = new ArrayList<>();
        if (!map.containsKey(e)){
            return null;
        }else {
            output.add(e); // add destination vertex in array
            int x = e;
            while (x != s){
                output.add(map.get(x)); // add parent of x in output array
                x = map.get(x);
            }
        }
        return output;
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
        ArrayList<Integer> ans = getPathBFS(adjMatrix, s, d, visited);
        if(ans != null){
            for (int i: ans){
                System.out.print(i + " ");
            }
        }
    }
}
