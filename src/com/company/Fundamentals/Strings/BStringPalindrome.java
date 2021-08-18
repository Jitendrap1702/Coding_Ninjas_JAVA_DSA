
/* Question
    Given a string, determine if it is a palindrome, considering only alphanumeric characters.

    Palindrome : A palindrome is a word, number, phrase, or other sequences of characters
                 which read the same backwards and forwards.
 */

package com.company.Fundamentals.Strings;

import java.util.Scanner;

public class BStringPalindrome {

    // Reverse the string
    public static String reverseString(String str){
        String reversedString = "";
        for (int i = 0; i < str.length(); i++){
            reversedString = str.charAt(i) + reversedString;
        }
        return reversedString;
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end){

            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // method 1 :- by calculate reverse of string and compare with original string
        String reversedString = reverseString(str);
        System.out.println(reversedString);

        // if reverse of str is equal to str then string will be a palindrome string
        if (str.equals(reversedString)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }


        // Method 2 :- By comparing start index to end index till start < end
        if (isPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}
