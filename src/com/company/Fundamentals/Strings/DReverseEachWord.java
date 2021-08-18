package com.company.Fundamentals.Strings;

import java.util.Scanner;

public class DReverseEachWord {

    // Method 1 : Using string array and split method
    public static void printReverseEachWord1(String str){

        String[] str1;
        str1 = str.split(" ");

        for (int i = 0; i < str1.length ; i++){

            for (int j = str1[i].length()-1; j >= 0; j--){
                System.out.print(str1[i].charAt(j));
            }

            System.out.print(" ");
        }
    }

    // Method 2  use only loop
    public static String printReverseEachWord2(String str){

        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++){
            int currentWordEnd = i-1;
            if (str.charAt(i) == ' '){
                // reverse the current word
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++){
                    reversedWord = str.charAt(j) + reversedWord;
                }
                ans += reversedWord + " ";
                currentWordStart = i+1;
            }
        }

        // for reverse the last word
        int currentWordEnd = i-1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++){
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord + " ";

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printReverseEachWord1(str);

        System.out.println();

        String output = printReverseEachWord2(str);
        System.out.println(output);
    }
}
