
/* Question
    Write a program to print N number of rows for Half Diamond pattern using stars and numbers

    Note : There are no spaces between the characters in a single line.

    Pattern for N = 3
    *
    *1*
    *121*
    *12321*
    *121*
    *1*
    *

    Input Format :
    A single integer: N

    Output Format :
    Required Pattern

 */

/* Solution

    we will depart it in 4 parts (not consider star in this)

    print a star

    ------------------------------------

    2 upper parts :-

    print one star before every row

    part 1 : numbers triangle
    total rows i need to print = n
    total columns ith row has = i
    what to print = j

    part 2 : numbers triangle
    total rows i need to print = n
    total columns ith row has = i-1
    what to print = i-1 to 1

    print one star at the end of the every row

    ------------------------------------

    2 lower parts :-

    print one star before every row

    part 3 : numbers triangle
    total rows i need to print = n - 1
    total columns ith row has = n - i
    what to print = j(column no.)

    part 3 : numbers triangle
    total rows i need to print = n - 1
    total columns ith row has = n - i - 1
    what to print = j(column no.)

    print one star at the end of the every row

    ------------------------------------

    print a star

 */


package com.company.Fundamentals.Pattern2.Assignment;

import java.util.Scanner;

public class HalfDiamondPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // print a star
        System.out.println("*");

        int i = 1;
        while (i <= n){

            // print star before every row
            System.out.print("*");

            // part 1
            int num1 = 1;
            while (num1 <= i){
                System.out.print(num1);
                num1++;
            }

            // part 2
            int num2 = i-1;
            while (num2 >= 1){
                System.out.print(num2);
                num2--;
            }

            // print star at the end of the every row
            System.out.print("*");

            System.out.println();
            i++;
        }

        int j = 1;
        while (j <= n - 1){

            // print star before every row
            System.out.print("*");

            //part 3
            int num3 = 1;
            while (num3 <= n-j){
                System.out.print(num3);
                num3++;
            }

            // part 4
            int num4 = n - j - 1;
            while (num4 >= 1){
                System.out.print(num4);
                num4--;
            }

            // print star at the end of the every row
                System.out.print("*");

            System.out.println();
            j++;
        }
        // print a star
        System.out.print("*");

    }
}
