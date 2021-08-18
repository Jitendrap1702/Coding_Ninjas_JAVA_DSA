
/* Question
    Reverse the given string word wise. That is, the last word in given string should come at 1st place,
    last second word at 2nd place and so on. Individual words should remain as it is.

    Input format :
    String in a single line

    Output format :
    Word wise reversed string in a single line

    Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.

    Sample Input 1:
    Welcome to Coding Ninjas

    Sample Output 1:
    Ninjas Coding to Welcome

 */

package com.company.Fundamentals.Strings;

import java.util.Scanner;

public class FReverseStringWordWise {

    // Method 1 : using new string array and split method
    public static String printReverseStringWordWise1(String str){

        String[] str1;
        str1 = str.split(" ");
        String output = "";

        for (int i = str1.length-1; i >= 0; i--){

            output = output + (str1[i] + " ");
        }

        return output;
    }

    // Method 1 : by only changing in given string
    // let assume str = abc def ghi
    public static String printReverseStringWordWise2(String str){

        // first reverse the whole string
        // it will give reversedString = ihg fed cba
        String reversedString = "";
        for (int i = 0; i < str.length(); i++){
            reversedString = str.charAt(i) + reversedString;
        }

        // Now reverse each word of string
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < reversedString.length(); i++) {
            int currentWordEnd = i - 1;
            if (reversedString.charAt(i) == ' ') {
                // reverse the current word
                String reverseWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reverseWord = reversedString.charAt(j) + reverseWord;
                }

                ans += reverseWord + " ";
                currentWordStart = i + 1;
            }
        }

            // reverse the current word
            int currentWordEnd = i-1;
            String reverseWord = "";
            for (int j = currentWordStart; j <= currentWordEnd; j++){
                reverseWord = reversedString.charAt(j) + reverseWord;
            }

            ans += reverseWord + " ";

            return ans;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // method 1
        String output1 = printReverseStringWordWise1(str);
        System.out.println(output1);

        // method 2
        String output2 = printReverseStringWordWise2(str);
        System.out.println(output2);
    }
}
