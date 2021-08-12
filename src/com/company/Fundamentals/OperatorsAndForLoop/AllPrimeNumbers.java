
/* Question
    Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
    Print the prime numbers in different lines.

    Input Format :
    Integer N

    Output Format :
    Prime numbers in different lines

    Constraints :
    1 <= N <= 100

    Sample Input 1:
    9
    Sample Output 1:
    2
    3
    5
    7

 */

/* solution

 */

package com.company.Fundamentals.OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int num = 2 ; num <= n ; num++){

            boolean isPrime = true;
            for (int i = 2 ; i <= Math.sqrt(num) ; i++){

                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(num);
            }
        }
    }
}
