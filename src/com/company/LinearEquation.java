package com.company;

import java.util.Scanner;

public class LinearEquation {

    static int gcd(int a, int b){

        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if (a == b){
            return a;
        }
        if(a>b){
            return gcd(a-b, b);
        }else {
            return gcd(a, b-a);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int gcdOfAB = gcd(a, b);
        if (c%gcdOfAB == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
