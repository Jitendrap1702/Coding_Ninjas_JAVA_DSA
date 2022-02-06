/*
Given an integer N, find and return the count of minimum numbers required to represent N as a sum of squares.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}.
The output will be 1, as 1 is the minimum count of numbers required to represent N as sum of squares.
Input format :
The first and the only line of input contains an integer value, 'N'.
 Output format :
Print the minimum count of numbers required.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
12
Sample Output 1 :
3
Explanation of Sample Output 1 :
12 can be represented as :
A) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)

B) (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2) + (1^2)  + (2 ^ 2)

C) (1^2) + (1^2) + (1^2) + (1^2) + (2 ^ 2) + (2 ^ 2)

D) (2 ^ 2) + (2 ^ 2) + (2 ^ 2)

As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1
 */
/*
we will solve this problem in 3 ways
1. Recursive
2. Recursive using Dynamic Programming
3. Iterative using Dynamic programming
 */
package com.company.DynamicProgramming1;

public class MinSquaresToRepresentN {

    // Greedy Approach :- It will failed in some cases like 41
    public static int minCountGreedy(int n) {

        // Base case
        if (n == 1){
            return 1;
        }

        int x = (int)Math.sqrt(n); // nearest square possible (for 10, x will be 3 (3pow2 == 9))
        return 1 + minCountGreedy(n - (int)Math.pow(x, 2));
    }

    // 1. Recursive
    public static int minCount(int n){

        // Base case
        if (n == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++){ // in place of math.sqrt we can use i*i <= n
            int currAns = minCount(n - (i*i));
            if (ans > currAns){
                ans = currAns;
            }
        }
        return 1 + ans;
    }

    // 2. Recursive using DP : n*n^(1/2) : (n root n)
    public static int minCountRecursiveDP(int n){

        int[] storage = new int[n+1];
        for (int i = 0; i <= n; i++){
            storage[i] = -1;
        }
        return minCountRecursiveDPHelper(n, storage);
    }

    public static int minCountRecursiveDPHelper(int n, int[] storage){

        // Base case
        if (n == 0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++){
            int currAns;
            if (storage[n-(i*i)] == -1){
                currAns = minCount(n - (i*i));
                storage[n-(i*i)] = currAns;
            }else {
                currAns = storage[n-(i*i)];
            }
            if (ans > currAns){
                ans = currAns;
            }
        }
        return 1 + ans;
    }

    // 3. Iterative using DP
    public static int minCountIterativeDP(int n){

        int[] storage = new int[n + 1];
        storage[0] = 0;
        for (int i = 1; i <= n; i++){

            int ans = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++){
                int currAns = storage[i-(j*j)];
                if (ans > currAns){
                    ans = currAns;
                }
            }
            storage[i] = 1 + ans;
        }
        return storage[n];
    }


    public static void main(String[] args) {

//        int ans = minCountGreedy(10); // 2
//        System.out.println(ans);

//        int ans = minCount(41); // 2
//        System.out.println(ans);

//        int ans = minCountRecursiveDP(12); // 3
//        System.out.println(ans);

        int ans = minCountIterativeDP(12);
        System.out.println(ans);
    }
}
