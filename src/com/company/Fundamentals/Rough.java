package com.company.Fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Rough {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        String str = sc.next();
//
//        char ch = str.charAt(0);
//
//        System.out.println(str);
//        System.out.println(ch);
//        System.out.println(a);

        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char ch = str.charAt(0);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int ans = (a+b+c)/3;
//
//        System.out.println(ch);
//        System.out.println(ans);

//        char ch = 'a';
//        ch = ((char) (ch + 2));
//
//        int i = ch;
//
//        System.out.println(i + 1); // 100
//        System.out.println(ch); // c
//        System.out.println('a' + 1.0); // 98.0
//        System.out.println('a' + 1); // 98
//        System.out.println('a' + (byte)1); // 98

//        byte b = 50;
//        b = b * 50;

//        double a = 6 / 4;
//        System.out.println(a); // 1.0
//        double x = (double)6/4;
//        System.out.println(x);  // 1.5
//        int b  = 6 / 4;
//        System.out.println(b);  // 1
//        double c = a + b;
//        System.out.println(c);  // 2.0

//        double a = 55.5;
//        int b = 55;
//        a = a % 10; // 5.5
//        b = b % 10; // 5
//        System.out.println(a + " "  + b);

//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(var2 + 1);

//        int a=50;
//        int b=Integer.MIN_VALUE;
//        if(a/0==b)
//        {
//
//            System.out.println("Hello");
//        }
//        else
//        {
//            System.out.println("Hi");
//        }

//        int a=50,b=20;
//        if(a>b)
//        {
//            if(a>100)
//                System.out.println("Ace");
//            if(b<100)
//                b=50;
//        }
//        else if(a==b)
//        {
//            System.out.println("King");
//        }
//        else
//        {
//            System.out.println("Queen");
//        }

//        int a = 10;
//        if(a > 5) {
//            int a = 100;  // a is already define in scope (error)
//        }
//
//        int j = 60;
//        System.out.println("ans " + j + 1); // ans 601
//        System.out.println("ans " + (j+1)); // ans 61
//
         // Increment and decrement operator
//        int a=10,b=20;
//        System.out.println(a+++--b);//line 1
//        System.out.println(a--+(++b));//line 2
//        System.out.println(a++-++b);//line 3
//        System.out.println(a+++(++b));//line 4

        // Bitwise Operator

//        int a=10,b=20;
//        int c=a&b;
//        System.out.print(c);
//        int d=a|b;
//        System.out.print(d);
//        int e=a^b;
//        System.out.print(e);
//        int f=c+d+e;
//        System.out.print(~f);

//        int a=10,b=-20;
//        System.out.print(a^b);

//        int a = 42;
//        int b = ~a; //(there is tilde sign before a)
//        System.out.print(a + " " + b);

//        int x = 15;
//        int y = x++;
//        int  z = ++x;
//        System.out.println(y +" " + z);

        // precedence
//        int a=10;
//        a+=++a-5/3+6*a;
//        System.out.print(a); // 86

        // For Loop
//        for(int i=386;i>0;i=i%3)
//        {
//            System.out.print("*");
//        }   // infinite for loop

//        for(int i=7;i!=0;i--)
//        {
//            System.out.print(i--);
//        } // infinite loop


//        System.out.println("2.5");

//        int a = -98;
//        int b = 2;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a/b);
//        System.out.println(a*b);

        // Array
//        int[] arr = new int[5];
//        System.out.println(arr.length);
//        arr = new int[6];
//        System.out.println(arr.length);

        String arr[] = new String[5];
        System.out.println(arr[0]);
    }
}
