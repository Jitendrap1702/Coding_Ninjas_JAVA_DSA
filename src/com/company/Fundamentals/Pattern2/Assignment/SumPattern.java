
/* Question

    Write a program to print triangle of user defined integers sum.

    Pattern for N = 5
    1=1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    1+2+3+4+5=15

    Input Format :
    A single integer, N

    Output Format :
    Required Pattern

 */

/* Solution

    print 1 in every row

    total rows i need to print = n
    total columns ith row has = i-1
    what to print = "+" + (column no. + 1)

    at the end of the row

    print :- "=" + sum of all element of the row

 */

package com.company.Fundamentals.Pattern2.Assignment;

import java.util.Scanner;

public class SumPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            System.out.print("1");
            int sum = 1;
            int j = 1;
            while (j <= i-1){
                System.out.print("+" + (j+1));
                sum += (j+1);
                j++;
            }
            System.out.println("=" + sum);
            i++;
        }
    }
}
