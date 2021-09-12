package com.company.DSA.Recursion1;

import java.util.Scanner;

public class EFibonacciNumber {

    public static int fibonacci(int n){

        // base case
        if (n == 1 || n == 2){
            return 1;
        }
        // small calculation
        int smallOutput = fibonacci(n-1) + fibonacci(n-2);
        return smallOutput;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
    }
}
