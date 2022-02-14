/*
You are given a set of N integers. You have to return true if there exists a subset that sum up to K,
otherwise return false.
Input Format
The first line of the test case contains an integer 'N' representing the total elements in the set.

The second line of the input contains N integers separated by a single space.

The third line of the input contains a single integer, denoting the value of K.
Output Format
Output Yes if there exists a subset whose sum is k, else output No.
Constraints :
1 <= N <= 10^3
1 <= a[i] <= 10^3, where a[i] denotes an element of the set
1 <= K <= 10^3

Time Limit: 1 sec
Sample Input 1 :
4
4 3 5 2
13
Sample Output 1 :
No
Sample Input 2 :
5
4 2 5 6 7
14
Sample Output 2 :
Yes
 */
package com.company.DSA.DynamicProgramming2.Assignment;

public class SubsetSum {

    static boolean isSubsetPresent(int[] arr, int n, int sum, int startIndex) {

        if (startIndex >= n){
            return sum == 0;
        }

        if (arr[startIndex] > sum){
            return isSubsetPresent(arr, n, sum, startIndex+1);
        }
        boolean ans1 = isSubsetPresent(arr, n, sum-arr[startIndex], startIndex+1);
        boolean ans2 = isSubsetPresent(arr, n, sum, startIndex+1);
        return ans1 || ans2;
    }

    static boolean isSubsetPresent(int[] arr, int n, int sum){

        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean storage[][] = new boolean[sum + 1][n + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            storage[0][i] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            storage[i][0] = false;

        // Fill the subset table in bottom
        // up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                storage[i][j] = storage[i][j - 1];
                if (i >= arr[j - 1])
                    storage[i][j] = storage[i][j] || storage[i - arr[j - 1]][j - 1];
            }
        }
        return storage[sum][n];
    }

    public static void main(String[] args) {

//        int n = 5;
//        int[] arr = {4, 2, 5, 6, 7};
//        int sum = 14;
        int n = 4;
        int[] arr = {4, 3, 5, 2};
        int sum = 13;
//        boolean ans = isSubsetPresent(arr, n, sum, 0);
//        System.out.println(ans);

        boolean ans = isSubsetPresent(arr, n, sum);
        System.out.println(ans);
    }
}
