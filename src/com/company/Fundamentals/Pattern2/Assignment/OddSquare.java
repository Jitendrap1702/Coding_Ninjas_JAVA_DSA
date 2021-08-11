
/* Question

    Write a program to print the pattern for the given N number of rows.

    Pattern For N = 4
    1357
    3571
    5713
    7135

    Input Format :
    A single integer: N

    Output Format :
    Required Pattern

 */

/* Solution

    we will depart it in 2 parts

    part 1 : spaces
    total rows i need to print = n
    total columns ith row has = n-i+1
    what to print = 2*j-1

    part 2 : stars
    total rows i need to print = n
    total columns ith row has = i-1
    what to print = 2*j-1

 */

package com.company.Fundamentals.Pattern2.Assignment;

import java.util.Scanner;

public class OddSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            // part 1
            int num1 = 1;
            int val = 2*i - 1;
            while (num1 <= n-i+1){
                System.out.print(val);
                num1++;
                val += 2;
            }

            // part 2
            int num2 = 1;
            while (num2 <= i-1){
                System.out.print(2*num2-1);
                num2++;
            }

            System.out.println();
            i++;
        }
    }
}
