
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

/*
Print first n fibonacci :

void fun(int n)
{
    IntQueue q = new IntQueue();
    q.enqueue(0);
    q.enqueue(1);
    for (int i = 0; i < n; i++)
    {
        int a = q.dequeue();
        int b = q.dequeue();
        q.enqueue(b);
        q.enqueue(a + b);
        System.out.print(a);
    }
}

 */
