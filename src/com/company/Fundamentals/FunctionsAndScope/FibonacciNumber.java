
/* Question

    Check the number n is a fibonacci number or not

 */

package com.company.Fundamentals.FunctionsAndScope;

import java.util.Scanner;

public class FibonacciNumber {

    public static boolean checkMember(int n) {

        int a = 0, b = 1;

        int num = 1;

        while (true) {
            b = num;
            num = a + b;
            a = b;

            if (num == n) {
                return true;
            } else if (num > n) {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean result = checkMember(n);

        if (result){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
