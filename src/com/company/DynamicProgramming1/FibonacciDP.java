package com.company.DynamicProgramming1;

public class FibonacciDP {

    // normal fibonacci : Time complexity : O(2 pow n)
    public static int fib(int n){

        // Base Case
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    //fibonacci using DP : Time complexity : O(n)
    public static int fibDP(int n){

        int[] storage = new int[n+1];
        for (int i = 0; i <= n; i++){
            storage[i] = -1; // -1 represents that fibDP for that index does not exist
        }
        return fibDPHelper1(n, storage);
    }

    public static int fibDPHelper1(int n, int[] storage){

        // Base Case
        if (n == 0 || n == 1){
            return n;
        }
        int ans1, ans2;
        if (storage[n-1] == -1){
            ans1 = fibDPHelper1(n-1, storage);
            storage[n-1] = ans1;
        }else {
            ans1 = storage[n-1];
        }
        if (storage[n-2] == -1){
            ans2 = fibDPHelper1(n-2, storage);
            storage[n-2] = ans2;
        }else {
            ans2 = storage[n-2];
        }

        return ans1+ans2;
    }

    public static int fibDPHelper2(int n, int[] storage){

        // Base Case
        if (n == 0 || n == 1){
            return n;
        }
        // check if output already exists
        if (storage[n] != -1){
            return storage[n];
        }

        // calculate output
        int a = fibDPHelper2(n-1, storage);
        int b = fibDPHelper2(n-2, storage);

        // save the output for future use
        storage[n] = a+b;

        // return the final output
        return storage[n];
    }

    public static void main(String[] args) {

        int ans = fibDP(4);
        System.out.println(ans);
    }
}
