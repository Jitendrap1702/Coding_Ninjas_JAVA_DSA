
/*

Question :-
    Print 1, if the character is an uppercase alphabet (A - Z)
    Print 0, if the character is a lowercase alphabet (a - z)
    Print -1, if the character is not an alphabet

 */

// Solution



package com.company.Fundamentals.ConditionalsAndLoops;

import java.util.Scanner;

public class FindCharacterCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        int i = ch;

        if(i>=65 && i <= 90){
            System.out.println(1);
        }else if(i>=97 && i <= 122){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
