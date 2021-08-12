
/* Question
    Write a program that asks the user for a number N and a choice C.
    And then give them the possibility to choose between computing the sum and
    computing the product of all integers in the range 1 to N (both inclusive).

    If C is equal to -
    1, then print the sum
    2, then print the product
    Any other number, then print '-1' (without the quotes)

    Input format :
    Line 1 : Integer N
    Line 2 : Choice C

    Output Format :
    Sum or product according to user's choice

    Constraints :
    1 <= N <= 12

    Sample Input 1 :
    10
    1
    Sample Output 1 :
    55

    Sample Input 2 :
    10
    2
    Sample Output 2 :
    3628800

    Sample Input 3 :
    10
    4
    Sample Output 3 :
    -1

 */

/* Solution

 */

package com.company.Fundamentals.OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class SumOrProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int choice = sc.nextInt();

        // if choice == 1 then print sum of all numbers till n
        if(choice == 1){
            int sum = 0;
            for(int i = 1 ; i <= num ; i++){
                sum += i;
            }

            System.out.println(sum);
        }

        // if choice == 2 then print multiplication of all numbers till n
        else if(choice == 2){
            int mul = 1;
            for(int i = 1 ; i <= num ; i++){
                mul *= i;
            }

            System.out.println(mul);
        }

        // if choice != 1 || 2 then print -1
        else{
            System.out.println(-1);
        }

    }
}
