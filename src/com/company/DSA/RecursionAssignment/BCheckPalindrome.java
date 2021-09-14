
/* Question

    Check whether a given String S is a palindrome using recursion. Return true or false.

    Input Format :
    String S

    Output Format :
    'true' or 'false'

    Sample Input 1 :
    racecar

    Sample Output 1:
    true
 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class BCheckPalindrome {

    public static boolean isStringPalindrome(String input, int startIndex, int endIndex) {

        // Base Case
        if (startIndex >= endIndex){
            return true;
        }
        // Recursive call
        if (input.charAt(startIndex) == input.charAt(endIndex)){
            boolean smallOutput = isStringPalindrome(input, startIndex + 1, endIndex - 1);
            return smallOutput;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = isStringPalindrome(s, 0, s.length()-1);
        System.out.println(isPalindrome);
    }
}
