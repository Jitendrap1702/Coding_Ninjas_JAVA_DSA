package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class RotateNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // Method 1 :- By convert in string, in this method k should be <=no of digits and >=0
//        String a = String.valueOf(n);
//
//        int len = a.length();
//
//        String x = a.substring(len-k, len);
//        String y = a.substring(0, len-k);
//        System.out.println(x + y);

        // Method 2 (handle all cases)

        // 1. Calculate no. of digits in n
        int nod = 0;
        int a = n;
        while(a>0){
            a = a/10;
            nod++;
        }

        // 2. if k > nod or k is negative
        k = k % nod;
        if(k < 0){
            k = k + nod;
        }

        // 3. calculate div and mul
        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, nod-k);

        // 4. Find Quotient and remainder of n
        int q = n/div;
        int r = n%div;

        int answer = r*mul + q;

        System.out.println(answer);


    }
}
