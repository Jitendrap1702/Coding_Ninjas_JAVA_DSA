package com.company.DSA.Recursion1;

import java.util.Scanner;

public class AFactorial {

    public static int factorial(int n){
        // base case
        if (n == 0){
            return 1;
        }
        // recursive call (induction step)
        int smallOutput = factorial(n-1);
        // small calculation (induction hypothesis)
        int output = n * smallOutput;
        return output;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int output = factorial(n);
        System.out.println(output);
    }
}
