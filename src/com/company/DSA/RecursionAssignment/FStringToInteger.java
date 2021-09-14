
/* Question

    Write a recursive function to convert a given string into the number it represents.
    That is input will be a numeric string that contains only numbers,
    you need to convert the string into corresponding integer and return the answer.

    Input format :
    Numeric string S (string, Eg. "1234")

    Output format :
    Corresponding integer N (int, Eg. 1234)

    Sample Input 1 :
    00001231

    Sample Output 1 :
    1231
 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class FStringToInteger {

    public static int convertStringToInt(String input, int endIndex, int x){

        // Base Case
        if (endIndex == -1){
            return 0;
        }
        // Recursive call
        int smallOutput = convertStringToInt(input, endIndex-1, x+1);
        // Small Calculation
        int num = Integer.valueOf(String.valueOf(input.charAt(endIndex))) * ((int)Math.pow(10, x));
        return num + smallOutput;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = convertStringToInt(s, s.length()-1, 0);
        System.out.println(ans);
    }
}
