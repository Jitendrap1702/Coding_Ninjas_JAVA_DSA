/*
A thief robbing a store can carry a maximal weight of W into his knapsack.
There are N items, and i-th item weigh 'Wi' and the value being 'Vi.'
What would be the maximum value V, that the thief can steal?
Input Format :
The first line of the input contains an integer value N, which denotes the total number of items.

The second line of input contains the N number of weights separated by a single space.

The third line of input contains the N number of values separated by a single space.

The fourth line of the input contains an integer value W,
which denotes the maximum weight the thief can steal.
Output Format :
Print the maximum value of V that the thief can steal.
Constraints :
1 <= N <= 20
1<= Wi <= 100
1 <= Vi <= 100

Time Limit: 1 sec
Sample Input 1 :
4
1 2 4 5
5 4 8 6
5
Sample Output 1 :
13
Sample Input 2 :
5
12 7 11 8 9
24 13 23 15 16
26
Sample Output 2 :
51
 */
package com.company.DSA.DynamicProgramming2;

public class Knapsack01 {

    // 1. Recursive
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight, int startIndex) {

        // Base case
        if (startIndex >= n) {
            return 0;
        }

        int ans;
        if (weights[startIndex] <= maxWeight) {
            // include current element
            int ans1 = values[startIndex] + knapsack(weights, values, n, maxWeight - weights[startIndex], startIndex + 1);
            // not include current element
            int ans2 = knapsack(weights, values, n, maxWeight, startIndex + 1);
            ans = Math.max(ans1, ans2);
        } else {
            ans = knapsack(weights, values, n, maxWeight, startIndex + 1);
        }
        return ans;
    }

    // 2. Recursive Memoization
    public static int knapsackRecursiveDP(int[] weights, int[] values, int n, int maxWeight) {

        int[][] storage = new int[n+1][maxWeight+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                storage[i][j] = -1;
            }
        }

        return knapsackRecursiveDPHelper(weights, values, n, maxWeight, 0, storage);
    }

    public static int knapsackRecursiveDPHelper(int[] weights, int[] values, int n, int maxWeight, int startIndex, int[][] storage) {

        // Base case
        if (startIndex >= n) {
            return 0;
        }

        int ans;
        if (storage[startIndex][maxWeight] == -1) {
            if (weights[startIndex] <= maxWeight) {
                // include current element
                int ans1 = values[startIndex] + knapsackRecursiveDPHelper(weights, values, n, maxWeight - weights[startIndex], startIndex+1, storage);
                // not include current element
                int ans2 = knapsackRecursiveDPHelper(weights, values, n, maxWeight, startIndex+1, storage);
                ans = Math.max(ans1, ans2);
            } else {
                ans = knapsackRecursiveDPHelper(weights, values, n, maxWeight, startIndex+1, storage);
            }
            storage[startIndex][maxWeight] = ans;
        } else {
            ans = storage[startIndex][maxWeight];
        }
        return ans;
    }

    // 3. iterative memoization : Top Down Approach
    public static int knapsackIterative(int[] weights, int[] values, int n, int maxWeight) {

        int[][] storage = new int[n+1][maxWeight+1];
        for (int i = 1; i <= n; i++){
            for (int w = 1; w <= maxWeight; w++){

                // we are using index as (i-1) for values and weights array bcz i is starting from 1 in loop
                if (w >= weights[i-1]){
                    int ans1 = values[i-1] + storage[i-1][w-weights[i-1]]; // include
                    int ans2 = storage[i-1][w]; // don't include
                    storage[i][w] = Math.max(ans1, ans2);
                }else {
                    storage[i][w] = storage[i-1][w];
                }
            }
        }
        return storage[n][maxWeight];
    }

    public static void main(String[] args) {

        int n = 4;
        int[] weights = {1, 2, 4, 5};
        int[] values = {5, 4, 8, 6};
        int maxWeight = 5;

        int ans = knapsack(weights, values, n, maxWeight, 0);
        System.out.println(ans);

        int ans1 = knapsackRecursiveDP(weights, values, n, maxWeight);
        System.out.println(ans1);

        int ans2 = knapsackIterative(weights, values, n, maxWeight);
        System.out.println(ans2);
    }
}
