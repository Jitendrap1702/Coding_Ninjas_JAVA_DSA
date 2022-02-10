/*
You are given two strings S and T of lengths M and N, respectively.
Find the 'Edit Distance' between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string equal to the other.
In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note :
Strings don't contain spaces in between.
 Input format :
The first line of input contains the string S of length M.

The second line of the input contains the String T of length N.
Output format :
Print the minimum 'Edit Distance' between the strings.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 Explanation to the Sample Input 1 :
 In 2 operations we can make string T to look like string S.
First, insert character 'a' to string T, which makes it "adc".

And secondly, replace the character 'd' of string T with 'b' from the string S.
This would make string T as "abc" which is also string S.

Hence, the minimum distance.
Sample Input 2 :
whgtdwhgtdg
aswcfg
Sample Output 2 :
9
 */
/*
Given string s (len = m) and t (len = n)
we will find out the longest common subsequence of s and t
and ans will be :- Math.max(m, n) - lcs(s, t)
 */
package com.company.DSA.DynamicProgramming2;

public class EditDistance {

    // 1. Recursive
    // here i will traverse in s and j will traverse in t
    // if s[i] == t[j] increase i and j and return
    // else output will be : min of( 1 + editDistance(i+1, j+1),
//                                    1 + editDistance(i+1, j+1),
//                                        1 + editDistance(i+1, j+1))
    public static int editDistance(String s, String t, int i, int j) {

        int m = s.length(), n = t.length();
        // Base case :
        // if i crossed m, return remaining non-traversed length of t
        if (i >= m){
            return n-j;
        }
        // if j crossed n, return remaining non-traversed length of s
        if (j >= n){
            return m-i;
        }

        if (s.charAt(i) == t.charAt(j)){
            return editDistance(s, t, i+1, j+1);
        }else {
            //int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
            int ans1 = 1 + editDistance(s,t, i+1, j+1);
            int ans2 = 1 + editDistance(s,t, i+1, j);
            int ans3 = 1 + editDistance(s,t, i, j+1);
            return Math.min(ans1, Math.min(ans2, ans3));
        }
    }

    // 2. Recursive Memoization
    public static int editDistanceRecursiveDP(String s, String t, int i, int j){

        int m = s.length(), n = t.length();
        int[][] storage = new int[m+1][n+1];
        for (int x = 0; x <= m; x++){
            for (int y = 0; y <= n; y++){
                storage[x][y] = Integer.MIN_VALUE;
            }
        }
        return editDistanceRecursiveDPHelper(s, t, 0, 0, storage);
    }

    public static int editDistanceRecursiveDPHelper(String s, String t, int i, int j, int[][] storage) {

        int m = s.length(), n = t.length();
        // Base case :
        // if i crossed m, return remaining non-traversed length of t
        if (i >= m){
            return n-j;
        }
        // if j crossed n, return remaining non-traversed length of s
        if (j >= n){
            return m-i;
        }

        int ans;
        if (s.charAt(i) == t.charAt(j)){
            if (storage[i+1][j+1] == Integer.MIN_VALUE) {
                ans = editDistanceRecursiveDPHelper(s, t, i + 1, j + 1, storage);
                storage[i+1][j+1] = ans;
            }else {
                ans = storage[i+1][j+1];
            }
        }else {

            int ans1;
            if (storage[i+1][j+1] == Integer.MIN_VALUE) {
                ans1 = editDistanceRecursiveDPHelper(s, t, i + 1, j + 1, storage);
                storage[i+1][j+1] = ans1;
            }else {
                ans1 = storage[i+1][j+1];
            }

            int ans2;
            if (storage[i+1][j] == Integer.MIN_VALUE) {
                ans2 = editDistanceRecursiveDPHelper(s, t, i + 1, j, storage);
                storage[i+1][j] = ans2;
            }else {
                ans2 = storage[i+1][j];
            }
            int ans3;
            if (storage[i][j+1] == Integer.MIN_VALUE) {
                ans3 = editDistanceRecursiveDPHelper(s, t, i, j + 1, storage);
                storage[i][j+1] = ans3;
            }else {
                ans3 = storage[i][j+1];
            }
            ans =  1 + Math.min(ans1, Math.min(ans2, ans3));
        }
        return ans;
    }

    // 3. Iterative Memoization : Top Down Approach
    public static int editDistanceIterative(String s, String t, int i, int j){

        int m = s.length(), n = t.length();
        int[][] storage = new int[m+1][n+1];
        for (int x = 0; x <= m; x++){
            storage[x][0] = x; // first column
        }
        for (int x = 0; x <= n; x++){
            storage[0][x] = x; // first row
        }

        for (int x = 1; x <= m; x++){
            for (int y = 1; y <= n; y++){

                if (s.charAt(x-1) == t.charAt(y-1)){
                    storage[x][y] = storage[x-1][y-1];
                }else {
                    storage[x][y] = 1 + Math.min(storage[x-1][y-1], Math.min(storage[x-1][y], storage[x][y-1]));
                }
            }
        }
        return storage[m][n];
    }

    public static void main(String[] args) {

        String s = "whgtdwhgtdg", t = "aswcfg";
//        String s = "wh", t = "a";
//        String s = "abc", t = "dc";
//        int ans = editDistance(s, t, 0, 0);
//        System.out.println(ans);

//        int ans = editDistanceRecursiveDP(s, t, 0, 0);
//        System.out.println(ans);

        int ans = editDistanceIterative(s, t, 0, 0);
        System.out.println(ans);
    }
}
