package com.company.DSA.Recursion2;

import java.util.Scanner;

public class AReplaceChar {

    public static String replaceChar(String str, char a, char b){

        if (str.length() == 0){
            return str;
        }

        String smallOutput = replaceChar(str.substring(1), a, b);
        if (str.charAt(0) == a){
            return b + smallOutput;
        }else{
            return str.charAt(0) + smallOutput;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sa = sc.next();
        char a = sa.charAt(0);
        String sb = sc.next();
        char b = sb.charAt(0);

        String ans = replaceChar(str, a, b);
        System.out.println(ans);
    }
}
