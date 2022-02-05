package com.company.DynamicProgramming1;

public class FibonacciIterativeDP {

    public static int fib(int n){

        if (n == 0 || n == 1){
            return n;
        }

        // for n >= 2
        int[] storage = new int[n+1];
        // fill index 0 and 1 with 0,1
        storage[0] = 0;
        storage[1] = 1;
        for (int i = 2; i <= n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }

    public static void main(String[] args) {

        int ans = fib(4);
        System.out.println(ans);
    }
}
