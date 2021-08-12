
/* Question

    Write a Program to determine if the given number is Armstrong number or not.
    Print true if number is armstrong, otherwise print false.
    An Armstrong number is a number (with digits n) such that
    the sum of its digits raised to nth power is equal to the number itself.

    For example,
    371, as 3^3 + 7^3 + 1^3 = 371
    1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

    Input Format :
    Integer n

    Output Format :
    true or false

    Sample Input 1 :
    1
    Sample Output 1 :
    true

    Sample Input 2 :
    103
    Sample Output 2 :
    false
 */

/* Solution

 */

package com.company.Fundamentals.Test1;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n;
        int len = 0;
        while (a > 0){
            len++;
            a = a/10;
        }

        int result = 0;
        int b = n;
        while (b > 0){
            int rem = b % 10;
            b /= 10;
            result += Math.pow(rem, len);

        }

        if (result == n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
