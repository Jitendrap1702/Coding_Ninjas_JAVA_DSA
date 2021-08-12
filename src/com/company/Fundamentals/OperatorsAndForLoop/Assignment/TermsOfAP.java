
/* Question
    Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

    Input format :
    Integer x

    Output format :
    Terms of series (separated by space)

    Constraints :
    1 <= x <= 1,000

    Sample Input 1 :
    10
    Sample Output 1 :
    5 11 14 17 23 26 29 35 38 41

 */

/* Solution

 */

package com.company.Fundamentals.OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class TermsOfAP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        for (int count = 1 ; count <= n ; ){

            int nextNumberOfAP = 3*i + 2;
            if (nextNumberOfAP % 4 != 0){
                System.out.print(nextNumberOfAP + " ");
                count++;
            }
            i++;
        }
    }
}
