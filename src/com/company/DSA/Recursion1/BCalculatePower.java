
/* Question

    Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
    Do this recursively.

    Input format :
    Two integers x and n (separated by space)

    Output Format :
    x^n (i.e. x raise to the power n)

    Sample Input 1 :
    3 4
    Sample Output 1 :
    81

 */


package com.company.DSA.Recursion1;

import java.util.Scanner;

public class BCalculatePower {

    public static int power(int x, int n) {

        // Base Case
        if (n == 0){
            return 1;
        }
        // Induction Hypothesis
        int smallOutput = power(x, n-1);
        // Induction Step
        int output = x * smallOutput;
        return output;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }
}
