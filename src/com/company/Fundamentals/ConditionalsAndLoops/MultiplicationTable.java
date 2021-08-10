
/*
    Question :-
    Write a program to print multiplication table of n

    Input Format :
    A single integer, n

    Output Format :
    First 10 multiples of n each printed in new line

    Constraints :
    0 <= n <= 10,000

    Sample Input 1 :
    2
    Sample Output 1 :
    2
    4
    6
    8
    10
    12
    14
    16
    18
    20

 */

// solution

package com.company.Fundamentals.ConditionalsAndLoops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = n;
        int i = 1;
        while(i <= 10){
            System.out.println(j);
            i++;
            j += n;
        }
    }
}
