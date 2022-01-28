package com.company.DSA.Recursion3;

public class PrintFactorial {

    public static int factorial(int input){

        if (input == 0){
            return 1;
        }
        return input * factorial(input-1);
    }

    public static void printFactorial(int input){
        int ans = factorial(input);
        System.out.println(ans);
    }

    // print factorial , not return
    public static void printFactorial1(int input, int answer){

        // base case
        if (input == 0){
            System.out.println(answer);
            return;
        }
        printFactorial1(input-1, answer*input);
    }

    public static void main(String[] args) {

        int n = 10;
        printFactorial1(n, 1);
    }
}
