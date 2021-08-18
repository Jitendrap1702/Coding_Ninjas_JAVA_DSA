
/* Question
    For a given string(str), remove all the consecutive duplicate characters.
    Example:
    Input String: "aaaa"
    Expected Output: "a"

    Input String: "aabbbcc"
    Expected Output: "abc"

 */

package com.company.Fundamentals.Strings.Assignment;

import java.util.Scanner;

public class BRemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        String ans = "";
        for (int i = 0; i < str.length()-1; i++){

            if (str.charAt(i) != str.charAt(i+1)){
                ans += str.charAt(i);
            }
        }
        ans += str.charAt(str.length()-1);
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String output = removeConsecutiveDuplicates(str);
        System.out.println(output);
    }
}
