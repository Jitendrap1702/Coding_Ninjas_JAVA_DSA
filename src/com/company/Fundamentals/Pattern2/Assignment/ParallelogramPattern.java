
/* Question

    Write a program to print parallelogram pattern for the given N number of rows.
    For N = 4
    ****
     ****
      ****
       ****

    Input Format :
    A single integer : N

    Output Format :
    Required Pattern

 */

/* Solution

    we will depart it in 3 parts

    part 1 : spaces
    total rows i need to print = n
    total columns ith row has = i-1
    what to print = space

    part 2 : stars
    total rows i need to print = n
    total columns ith row has = n - i
    what to print = *

    part 3 : stars
    total rows i need to print = n
    total columns ith row has = i
    what to print = *

 */


package com.company.Fundamentals.Pattern2.Assignment;

import java.util.Scanner;

public class ParallelogramPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            // part 1
            int spaces = 1;
            while (spaces <= i-1){
                System.out.print(" ");
                spaces++;
            }

            // part 2
            int star1 = 1;
            while (star1 <= n-i){
                System.out.print("*");
                star1++;
            }

            // part 3
            int star2 = 1;
            while (star2 <= i){
                System.out.print("*");
                star2++;
            }

            System.out.println();
            i++;
        }
    }
}
