
/* Question
    Write a program to do basic string compression. For a character which is consecutively
    repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.

    Example:
    If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

    The string is compressed only when the repeated character count is more than 1.

    Note : Consecutive count of every character in the input string is less than or equal to 9.

    Sample Input 1:
    aaabbccdsa

    Sample Output 1:
    a3b2c2dsa

 */

package com.company.Fundamentals.Strings.Assignment;

import java.util.Scanner;

public class ECompressTheString {

    public static String getCompressedString(String str) {
        String ans = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if (count != 1){
                    ans += count;
                    ans += str.charAt(i);
                    count = 1;
                }else{
                    ans += str.charAt(i);
                }
            }
        }

        if (count != 1){
            ans += count;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String output = getCompressedString(str);
        System.out.println(output);
    }
}
