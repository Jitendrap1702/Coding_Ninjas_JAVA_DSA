/*
Byteland has a very strange monetary system.
Each Bytelandian gold coin has an integer number written on it.
A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4.
But these numbers are all rounded down (the banks have to make a profit).
You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1.
But you can not buy Bytelandian coins.
You have one gold coin. What is the maximum amount of American dollars you can get for it?
 Input format :
The first and the only line of input contains a the integer value of 'n'.
It is the number written on your coin.
Output format :
Print the the maximum amount of American dollars you can make.
Constraints :
0 <= n <= 10 ^ 9

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
13
Explanation of Sample Output 1 :
 You can change 12 into 6, 4 and 3, and then change these into $6 + $4 + $3 = $13.
Sample Input 2 :
2
Sample Output 1 :
2
Explanation of Sample Output 2 :
If you try changing the coin 2 into 3 smaller coins, you will get 1, 0 and 0,
and later you can get no more than $1 out of them.
It is better just to change the 2 coin directly into $2.
 */
package com.company.DynamicProgramming1.Assignment;

import java.util.HashMap;

public class ByteLandian {

    // !. Recursive
    public static long bytelandian(long n) {

        // Base case
        if (n/2+n/3+n/4 <= n){
            return n;
        }

        long ans1 = 0, ans2 = 0, ans3 = 0;
        // 1. divide n by 4
        ans1 = bytelandian(n/4);
        // 1. divide n by 3
        ans2 = bytelandian(n/3);
        // 1. divide n by 2
        ans3 = bytelandian(n/2);

        return ans1+ans2+ans3;
    }

    // 2. Recursive Using DP
    public static long bytelandianRecursiveDP(long n, HashMap<Long, Long> memo){

        // Base case
        if (n <= 1 || n/2+n/3+n/4 <= n){
            return n;
        }

        long ans1 = 0, ans2 = 0, ans3 = 0;
        // 1. divide n by 4
        if (!memo.containsKey(n/4)) {
            ans1 = bytelandianRecursiveDP(n/4, memo);
            memo.put(n/4, ans1);
        }else {
            ans1 = memo.get(n/4);
        }
        // 1. divide n by 3
        if (!memo.containsKey(n/3)) {
            ans2 = bytelandianRecursiveDP(n/3, memo);
            memo.put(n/3, ans2);
        }else {
            ans2 = memo.get(n/3);
        }
        // 1. divide n by 2
        if (!memo.containsKey(n/2)) {
            ans3 = bytelandianRecursiveDP(n/2, memo);
            memo.put(n/2, ans3);
        }else {
            ans3 = memo.get(n/2);
        }

        return ans1+ans2+ans3;
    }

    // 3. Iterative using DP
    public static long bytelandianIterativeDP(long n, HashMap<Long, Long> memo){

        if (n <= 1){
            return n;
        }
        memo.put(0L, 0L);
        memo.put(1L, 1L);
        for (long i = 2; i <= n; i++){
            if (i/2+i/3+i/4 <= i){
                memo.put(i, i);
            }else {
                memo.put(i, (memo.get(i/2) + memo.get(i/3) + memo.get(i/4)));
            }
        }
        return memo.get(n);
    }

    public static void main(String[] args) {

//        long ans = bytelandian(12); // 13
//        long ans = bytelandian(2); // 2
//        System.out.println(ans);

        //long ans = bytelandianRecursiveDP(2, new HashMap<>());
//        long ans = bytelandianRecursiveDP(12, new HashMap<>());
//        System.out.println(ans);

//        long ans = bytelandianIterativeDP(2, new HashMap<>());
        long ans = bytelandianIterativeDP(13, new HashMap<>());
        System.out.println(ans);
    }
}
