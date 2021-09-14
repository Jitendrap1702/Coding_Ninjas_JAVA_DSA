
/* Question

    Write a recursive function that returns the sum of the digits of a given integer.

    Input format :
    Integer N

    Output format :
    Sum of digits of N

    Sample Input 1 :
    12345

    Sample Output 1 :
    15

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class CSumOfDigits {

    public static int sumOfDigits(int input){

        // Base Case
        if (input == 0){
            return 0;
        }
        // Recursive call
        int smallOutput = sumOfDigits(input/10);
        // small calculation
        int rem = input % 10;
        return rem + smallOutput;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = sumOfDigits(input);
        System.out.println(sum);
    }
}
