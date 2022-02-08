/*
Given two strings, 'S' and 'T' with lengths 'M' and 'N',
find the length of the 'Longest Common Subsequence'.
For a string 'str'(per se) of length K,
the subsequences are the strings containing characters in the same relative order as
they are present in 'str,' but not necessarily contiguous. Subsequences contain all the strings of length
varying from 0 to K.
Example :
Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.
Input format :
The first line of input contains the string 'S' of length 'M'.

The second line of the input contains the string 'T' of length 'N'.
Output format :
Return the length of the Longest Common Subsequence.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3
Explanation of the Sample Output 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3.
Sample Input 2 :
ab
defg
Sample Output 2 :
0
Explanation of the Sample Output 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0.
 */
package com.company.DSA.DynamicProgramming2;

public class LCS {

    // 1. Recursive
    public static int lcs(String s, String t, int i, int j) {

        // Base case
        if (i >= s.length() || j >= t.length()){
            return 0;
        }

        if (s.charAt(i) == t.charAt(j)){
            return 1 + lcs(s, t, i+1, j+1);
        }else {
            int ans1 = lcs(s, t, i+1, j);
            int ans2 = lcs(s, t, i, j+1);
            return Math.max(ans1, ans2);
        }
    }

    // 2. Recursive Memoization
    public static int lcsRecursive(String s, String t){

        int[][] storage = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < storage.length; i++){
            for (int j = 0; j < storage[i].length; j++){
                storage[i][j] = -1;
            }
        }
        return lcsRecursiveDPHelper(s, t, 0, 0, storage);
    }

    public static int lcsRecursiveDPHelper(String s, String t, int i, int j, int[][] storage) {

        // Base case
        if (i >= s.length() || j >= t.length()){
            return 0;
        }

        if (s.charAt(i) == t.charAt(j)){
            int smallAns;
            if (storage[i+1][j+1] == -1) {
               smallAns = lcsRecursiveDPHelper(s, t, i + 1, j + 1, storage);
               storage[i+1][j+1] = smallAns;
            }else {
                smallAns = storage[i+1][j+1];
            }
            return 1 + smallAns;
        }else {
            int ans1, ans2;
            if (storage[i+1][j] == -1) {
                ans1 = lcsRecursiveDPHelper(s, t, i + 1, j, storage);
                storage[i+1][j] = ans1;
            }else {
                ans1 = storage[i+1][j];
            }

            if (storage[i][j+1] == -1) {
                ans2 = lcsRecursiveDPHelper(s, t, i, j + 1, storage);
                storage[i][j+1] = ans2;
            }else {
                ans2 = storage[i][j+1];
            }
            return Math.max(ans1, ans2);
        }
    }

    // 3. Iterative Memoization :- Top Down approach
    public static int lcsIterative(String s, String t){

        int[][] storage = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < storage.length; i++){
            for (int j = 0; j < storage[i].length; j++){
                storage[i][j] = 0;
            }
        }

        for (int i = 1; i < storage.length; i++){
            for (int j = 1; j < storage[i].length; j++){

                if (s.charAt(i-1) == t.charAt(j-1)){
                    storage[i][j] = 1 + storage[i-1][j-1];
                }else {
                    storage[i][j] = Math.max(storage[i-1][j], storage[i][j-1]);
                }
            }
        }
        return storage[s.length()][t.length()];
    }

    public static void main(String[] args) {

        String s = "adebc";
        String t = "dcadb";
//        String s = "ab";
//        String t = "defg";
//        int ans = lcs(s, t, 0, 0);
//        System.out.println(ans);

//        int ans = lcsRecursive(s, t);
//        System.out.println(ans);

        int ans = lcsIterative(s, t);
        System.out.println(ans);
    }
}
