/*
A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time.
Implement a method to count and return all possible ways in which the child can run-up to the stairs.
Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
Output format :
Print the total possible number of ways.
 Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1:
4
Sample Output 1:
7
Sample Input 2:
10
Sample Output 2:
274
 */

/*
we will solve this problem in 3 ways
1. Recursive
2. Recursive using Dynamic Programming
3. Iterative using Dynamic programming
 */
package com.company.DynamicProgramming1;

public class StairCase {

    // 1. Recursive approach
    public static long staircase(int n) {

        // Base case : child reach up to stairs
        if (n == 0) {
            return 1;
        }
        long step1 = 0, step2 = 0, step3 = 0;
        // if child hop 1 step
        if (n - 1 >= 0) {
            step1 = staircase(n - 1);
        }
        // if child hop 2 step
        if (n - 2 >= 0) {
            step2 = staircase(n - 2);
        }
        // if child hop 3 step
        if (n - 3 >= 0) {
            step3 = staircase(n - 3);
        }
        return step1 + step2 + step3; // total steps
    }

    // 2. Recursive using DP
    public static long staircaseRecursiveDP(int n) {

        long[] storage = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return staircaseRecursiveDPHelper(n, storage);
    }

    private static long staircaseRecursiveDPHelper(int n, long[] storage) {

        // Base case
        if (n == 0) {
            return 1;
        }

        long step1 = 0, step2 = 0, step3 = 0;
        // if child hop 1 step
        if (n - 1 >= 0) {
            if (storage[n - 1] == -1) {
                step1 = staircase(n - 1);
                storage[n - 1] = step1; // store for further use
            } else {
                step1 = storage[n - 1]; // if already calculated
            }
        }

        // if child hop 2 step
        if (n - 2 >= 0) {
            if (storage[n - 2] == -1) {
                step2 = staircase(n - 2);
                storage[n - 2] = step2;
            } else {
                step2 = storage[n - 2];
            }
        }

        // if child hop 3 step
        if (n - 3 >= 0) {
            if (storage[n - 3] == -1) {
                step3 = staircase(n - 3);
                storage[n - 3] = step3;
            } else {
                step3 = storage[n - 3];
            }
        }

        return step1 + step2 + step3; // output
    }

    // 3. Iterative Using DP
    public static long staircaseIterativeDP(int n){

        // base case
        if (n == 0 || n == 1 || n == 2){
            return n;
        }
        // for n >= 3
        long[] storage = new long[n+1];
        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                storage[i] = storage[i - 1] + storage[i - 2] + storage[i - 3];
            }
        }
        return storage[n];
    }

    public static void main(String[] args) {

//        long ans = staircase(4);
//        System.out.println(ans);
//        long ans = staircaseRecursiveDP(10);
//        System.out.println(ans);
        long ans = staircaseIterativeDP(10);
        System.out.println(ans);
    }
}
