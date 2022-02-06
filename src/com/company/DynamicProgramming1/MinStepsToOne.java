/*
Given a positive integer 'n',
find and return the minimum number of steps that 'n' has to take to get reduced to 1.
You can perform any one of the following 3 steps:
1.) Subtract 1 from it. (n = n - ­1) ,
2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
Write brute-force recursive solution for this.
Input format :
The first and the only line of input contains an integer value, 'n'.
Output format :
Print the minimum number of steps.
Constraints :
1 <= n <= 200

Time Limit: 1 sec
Sample Input 1 :
4
Sample Output 1 :
2
Explanation of Sample Output 1 :
For n = 4
Step 1 :  n = 4 / 2  = 2
Step 2 : n = 2 / 2  =  1
Sample Input 2 :
7
Sample Output 2 :
3
Explanation of Sample Output 2 :
For n = 7
Step 1 :  n = 7 ­- 1 = 6
Step 2 : n = 6  / 3 = 2
Step 3 : n = 2 / 2 = 1
 */
/*
we will solve this problem in 3 ways
1. Recursive
2. Recursive using Dynamic Programming
3. Iterative using Dynamic programming
 */
package com.company.DynamicProgramming1;

public class MinStepsToOne {

    // !. Recursive
    public static int countMinStepsToOne(int n) {

        // Base case
        if (n == 1){
            return 0;
        }
        // now we will perform 3 operations on n
        // 1. divide by 3, if divisible
        // 2. divide by 2, if divisible
        // 3. subtract 1
        // we can perform 1 operation at a time
        // priority for getting min steps will be : divide by 3 > divide by 2 > subtract 1

        // Induction hypothesis
        int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
        // we are taking default value as max values not 0,
        // for calculating min value default value should be largest possible value
        // 1. divide by 3, if divisible
        if (n % 3 == 0){
            ans1 = countMinStepsToOne(n/3);
        }
        // divide by 2, if divisible
        if (n % 2 == 0){
            ans2 = countMinStepsToOne(n/2);
        }
        // subtract 1
        ans3 = countMinStepsToOne(n-1);

        // Induction step
        return 1 + Math.min(ans1, Math.min(ans2, ans3));
    }

    // 2. Recursive using DP :- O(n)
    public static int countMinStepsToOneRecursiveDP(int n){

        int[] storage = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return countMinStepsToOneRecursiveDPHelper(n, storage);
    }

    public static int countMinStepsToOneRecursiveDPHelper(int n, int[] storage){

        // Base case
        if (n == 1){
            return 0;
        }

        int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
        // 1. divide by 3, if divisible
        if (n % 3 == 0){
            if (storage[n/3] == -1){
                ans1 = countMinStepsToOneRecursiveDPHelper(n/3, storage);
                storage[n/3] = ans1;
            }else {
                ans1 = storage[n/3];
            }
        }

        // 2. divide by 2, if divisible
        if (n % 2 == 0){
            if (storage[n/2] == -1){
                ans2 = countMinStepsToOneRecursiveDPHelper(n/2, storage);
                storage[n/2] = ans2;
            }else {
                ans2 = storage[n/2];
            }
        }

        // subtract 1
        if (storage[n-1] == -1){
            ans3 = countMinStepsToOneRecursiveDPHelper(n-1, storage);
            storage[n-1] = ans3;
        }else {
            ans3 = storage[n-1];
        }
        return 1 + Math.min(ans1, Math.min(ans2, ans3));
    }

    // 3. Iterative using DP : O(n)
    public static int countMinStepsToOneIterativeDP(int n){

        // Base case
        if (n == 1){
            return 0;
        }
        // >= 4
        int[] storage = new int[n + 1];
        storage[0] = 0;
        storage[1] = 0;
        for (int i = 2; i <= n; i++) {
            int ans1, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
            ans1 = storage[i-1];
            if (i%2 == 0) {
                ans2 = storage[i/2];
            }
            if (i%3 == 0) {
                ans3 = storage[i/3];
            }
            storage[i] = 1 + Math.min(ans1, Math.min(ans2, ans3));
        }
        return storage[n];
    }

    public static void main(String[] args) {

//        int ans = countMinStepsToOne(4);  // 2
//        int ans = countMinStepsToOne(7); // 3
//        int ans = countMinStepsToOne(3); // 1
//        int ans = countMinStepsToOne(2); // 1
//        int ans = countMinStepsToOne(1); // 0
//        int ans = countMinStepsToOne(10);
//        System.out.println(ans);

//        int ans = countMinStepsToOneRecursiveDP(10); // 3
//        System.out.println(ans);

        int ans = countMinStepsToOneIterativeDP(5); // 3
        System.out.println(ans);
    }
}
