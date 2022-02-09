/*
Given N points of the form (xi,yi) on a 2-D plane.

From each point, you draw 2 lines one horizontal and one vertical. Now some of the lines may overlap each other, therefore you are required to print the number of distinct lines you can see on the plane.

Note:

Two horizontal lines are distinct if they pass through different y coordinates.
Two vertical lines are distinct if they pass through different x coordinates.
Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains a single integer N, the number of points.
The next N lines contain two space separated integers xi,yi, the coordinate of the ith point.
Output Format
For each testcase, output in a single line the number of distinct lines that can be seen on the plane.

Constraints
1≤T≤1000
1≤N≤105
0≤Xi,Yi≤109
Sum of N over all test cases is atmost 105.
Sample Input 1
3
4
1 1
1 0
0 1
0 0
5
0 0
0 1
0 2
0 3
0 4
1
10 10
Sample Output 1
4
6
2
Explanation
Test Case 1: There are 2 horizontal lines passing through Y=0 and Y=1, and 2 vertical lines passing through X=0 and X=1.

Test Case 2: There are 5 horizontal lines passing through Y=0,Y=1,Y=2,Y=3 and Y=4 and 1 vertical line passing through X=0.

Test Case 3: There is 1 horizontal line passing through Y=10 and 1 vertical line passing through X=10.
 */
package com.company.Codechef.CodechefStarters25;

import java.util.HashMap;
import java.util.Scanner;

public class PointsAndLines {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                HashMap<Integer, Integer> mapX = new HashMap<>();
                HashMap<Integer, Integer> mapY = new HashMap<>();
                for (int j = 0; j < n; j++) {

                    int x = sc.nextInt();
                    if (!mapX.containsKey(x)) {
                        mapX.put(x, 0);
                    }

                    int y = sc.nextInt();
                    if (!mapY.containsKey(y)) {
                        mapY.put(y, 0);
                    }
                }
                System.out.println(mapX.size() + mapY.size());
            }
        }catch (Exception e){}
    }
}
