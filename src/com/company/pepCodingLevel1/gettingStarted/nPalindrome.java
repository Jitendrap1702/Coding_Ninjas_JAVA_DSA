package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class nPalindrome {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 1){
            System.out.println(a);
        }else if(n == 2){
            System.out.println(a);
            System.out.println(b);
        }else{
            System.out.println(a);
            for(int i = 0; i < n-1 ; i ++){
                a = b;
                b = c;
                c = a + b;
                System.out.println(c);
            }
        }
    }
}
