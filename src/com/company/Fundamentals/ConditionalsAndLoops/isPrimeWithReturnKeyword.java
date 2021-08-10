
// return keyword will "exit from main" means it will stop further execution.

package com.company.Fundamentals.ConditionalsAndLoops;

import java.util.Scanner;

public class isPrimeWithReturnKeyword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("not prime");
        } else {

            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    System.out.println("not Prime");
                    return;
                }
            }
        }

        System.out.println("prime");
    }
}
