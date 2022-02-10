/*
For the given infinite supply of coins of each of denominations,
D = {D0, D1, D2, D3, ...... Dn-1}. You need to figure out the total number of ways W,
in which you can make the change for Value V using coins of denominations D.
Return 0 if the change isn't possible.
Input Format
The first line of the input contains an integer value N,
which denotes the total number of denominations.

The second line of input contains N values, separated by a single space.
These values denote the value of denomination.

The third line of the input contains an integer value, that denotes the value of V.
Output Format
Print the total total number of ways i.e. W.
Constraints :
1 <= n <= 10
1 <= V <= 1000

Time Limit: 1sec
Sample Input 1 :
3
1 2 3
4
Sample Output 1 :
4
Explanation to Sample Input 1 :
Number of ways are - 4 total i.e. (1,1,1,1), (1,1, 2), (1, 3) and (2, 2).
Sample Input 2 :
6
1 2 3 4 5 6
250
Sample Output 2 :
13868903
 */

// Correct answer is iterative memoization
package com.company.DSA.DynamicProgramming2;

public class WaysToMakeCoinChange {

    // 1. Recursive
    public static int countWaysToMakeChange(int[] denominations, int value) {

//        //Base case
//        if (value == 0) {
//            return 1;
//        }
//
//        int ans = 0;
//        for (int i = 0; i < denominations.length; i++) {
//            if (value >= denominations[i]) {
//                ans = ans + countWaysToMakeChange(denominations, value - denominations[i]);
//            }
//        }
//        return ans;
        if (value == 0) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < denominations.length; i++) {
            int smallAns = 0;
            if (value >= denominations[i]) {
                smallAns = countWaysToMakeChange(denominations, value - denominations[i]);
            }
            if (smallAns > ans) {
                ans = smallAns;
            }
        }
        return 1+ans;
    }

    // 2. Recursive Memoization
    public static int countWaysToMakeChangeRecursiveDP(int[] denominations, int value) {

        int[] storage = new int[value + 1];
        for (int i = 0; i <= value; i++) {
            storage[i] = -1;
        }
        return countWaysToMakeChangeRecursiveDPHelper(denominations, value, storage);
    }

    public static int countWaysToMakeChangeRecursiveDPHelper(int[] denominations, int value, int[] storage) {

        if (value == 0) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < denominations.length; i++) {
            int smallAns = 0;
            if (value >= denominations[i]) {
                if (storage[i] == -1) {
                    smallAns = countWaysToMakeChangeRecursiveDPHelper(denominations, value - denominations[i], storage);
                    storage[i] = smallAns;
                } else {
                    smallAns = storage[i];
                }
            }
            if (smallAns > ans) {
                ans = smallAns;
            }
        }
        return 1 + ans;
    }

    // Correct answer
    // Iterative Memoization
    public static int countWaysToMakeChangeIterative(int[] denominations, int value) {

        int[] storage = new int[value + 1];
        storage[0] = 1;
        for (int i = 0; i < denominations.length; i++) {
            for (int j = 0; j <= value; j++) {
                if (j >= denominations[i]) {
                    storage[j] = storage[j] + storage[j - denominations[i]];
                }
            }
        }
        return storage[value];
    }

    public static void main(String[] args) {

        int n = 3;
        int[] denominations = {1, 2, 3};
        int v = 4;

//        int n = 6;
//        int[] denominations = {1, 2, 3, 4, 5, 6};
//        int v = 250;

        int ans = countWaysToMakeChange(denominations, v);
        System.out.println(ans);

        int ans1 = countWaysToMakeChangeRecursiveDP(denominations, v);
        System.out.println(ans1);

        int ans2 = countWaysToMakeChangeIterative(denominations, v);
        System.out.println(ans2);
    }
}
