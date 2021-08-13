package com.company.Fundamentals.FunctionsAndScope;

import java.util.Scanner;

public class FunctionOverloading {

    public static long sum(long a,long b)
    {
        System.out.print("long sum ");
        return a+b;
    }

    public static int sum(int a,int b)
    {
        System.out.print("int sum ");
        return a+b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum(a,b));

        //As both the data types are int So second function would be called.

    }
}
