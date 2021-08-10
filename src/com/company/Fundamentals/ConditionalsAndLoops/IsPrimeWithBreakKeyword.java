
// Break keyword "Exit from particular loop"

package com.company.Fundamentals.ConditionalsAndLoops;

import java.util.Scanner;

// 0, 1 not prime
// 2, 3 prime
// prime number = a number that can be divided by itself and 1
// Math.sqrt(n) = it will return number which square is n

public class IsPrimeWithBreakKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.println("not prime");
            } else {

                Boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("prime");
                } else {
                    System.out.println("not prime");
                }
            }

        }
    }
}
