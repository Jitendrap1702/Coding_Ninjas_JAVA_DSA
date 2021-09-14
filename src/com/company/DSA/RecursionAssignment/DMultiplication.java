
/* Question

    Given two integers M & N, calculate and return their multiplication using recursion.
    You can only use subtraction and addition for your calculation. No other operators are allowed.

    Input format :
    Line 1 : Integer M
    Line 2 : Integer N

    Output format :
    M x N

    Sample Input 1 :
    3
    5

    Sample Output 1 :
    15

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class DMultiplication {

    public static int multiplyTwoIntegers(int m, int n){

        // Base Case
        if (n == 0){
            return 0;
        }
        // Recursive call
        int smallOutput = multiplyTwoIntegers(m, n-1);
        // Small Calculation
        return m + smallOutput;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mul = multiplyTwoIntegers(m, n);
        System.out.println(mul);
    }
}
