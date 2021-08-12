
/* Question
    Given a number N, find its square root.
    You need to find and print only the integral part of square root of N.

    For eg. if number given is 18, answer is 4.

    Input format :
    Integer N

    Output Format :
    Square root of N (integer part only)

    Constraints :
    0 <= N <= 10^8

    Sample Input 1 :
    10
    Sample Output 1 :
    3

 */

package com.company.Fundamentals.OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Method 1
        System.out.println((int)Math.sqrt(n));

        // Method 2 without using inbuilt functions

        int result = 0;
        int i = 1;
        while (true){
            if( i*i > n){
                System.out.println(result);
                break;
            }
            result = i;
            i++;
        }

    }
}
