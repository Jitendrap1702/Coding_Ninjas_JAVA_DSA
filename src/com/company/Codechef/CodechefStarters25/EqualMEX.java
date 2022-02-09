/*
The MEX (minimum excluded) of an array is the smallest non-negative integer that
does not belong to the array. For instance:

The MEX of [2,2,1] is 0 because 0 does not belong to the array.
The MEX of [3,1,0,1] is 2 because 0 and 1 belong to the array, but 2 does not.
The MEX of [0,3,1,2] is 4 because 0,1,2 and 3 belong to the array, but 4 does not.
You're given an array A containing 2⋅N integers where 0≤Ai≤N.
Is it possible to reorder the elements of the array in such a way that
the MEX of the first N elements is equal to the MEX of the last N elements?

Input Format
The first line contains T denoting the number of test cases. Then the test cases follow.
The first line of each test case contains a single integer N.
The second line contains 2⋅N space-separated integers A1,A2,…,A2⋅N.
Output Format
For each test case, print YES if there is a valid reordering of the given array and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example,
the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤104
1≤N≤105
0≤Ai≤N
Sum of N over all test cases does not exceed 2⋅105.
Sample Input 1
4
2
0 0 0 1
2
0 0 1 1
3
1 3 2 3 3 2
3
0 0 1 1 1 2
Sample Output 1
NO
YES
YES
NO
Explanation
Test case 1: There is no way to reorder the elements of the array [0,0,0,1]
which satisfies the given conditions.

Test case 2: One possible reordering is [0,1,0,1]. Here the MEX of the first half is MEX([0,1])=2 and
the MEX of the second half is MEX([0,1])=2.

Test case 3: The given array already satisfies the conditions.
Here the MEX of the first half is MEX([1,3,2])=0 and the MEX of the second half is MEX([3,3,2])=0.
 */
package com.company.Codechef.CodechefStarters25;

import java.util.HashMap;
import java.util.Scanner;

public class EqualMEX {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int j = 0; j < 2 * n; j++) {
                    int x = sc.nextInt();
                    if (map.containsKey(x)) {
                        map.put(x, map.get(x) + 1);
                    }else {
                        map.put(x, 1);
                    }
                }

                boolean ans = true;
                for (int j = 0; j < 2 * n; j++) {
                    if (!map.containsKey(j)){
                        break;
                    }
                    if (map.get(j) == 1) {
                        ans = false;
                        break;
                    }
//                    else if (map.get(j) == 0) {
//                        break;
//                    }
                }

                if (ans) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }catch (Exception e){}
    }
}
