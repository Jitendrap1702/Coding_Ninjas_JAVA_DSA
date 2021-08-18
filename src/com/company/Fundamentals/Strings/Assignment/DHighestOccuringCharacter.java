
/* Question
    For a given a string(str), find and return the highest occurring character.

    Example:
    Input String: "abcdeapapqarr"
    Expected Output: 'a'

    Since 'a' has appeared four times in the string which happens to be the highest frequency character,
    the answer would be 'a'.

    If there are two characters in the input string with the same frequency, return the character which comes first.

 */

package com.company.Fundamentals.Strings.Assignment;

import java.util.Scanner;

public class DHighestOccuringCharacter {

    public static char highestOccuringChar(String str) {

        char ans = ' ';
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++){
            int x = str.charAt(i);
            arr[x]++;
        }
        int ansCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > ansCount){
                ans = (char) i;
                ansCount = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char output = highestOccuringChar(str);
        System.out.println(output);

    }
}
