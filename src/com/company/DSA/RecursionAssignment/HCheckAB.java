
/* Question

    Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that
    checks if the string was generated using the following rules:
    a. The string begins with an 'a'
    b. Each 'a' is followed by nothing or an 'a' or "bb"
    c. Each "bb" is followed by nothing or an 'a'
    If all the rules are followed by the given string, return true otherwise return false.

    Input format :
    String S

    Output format :
    'true' or 'false'

    Sample Input 1 :
    abb
    Sample Output 1 :
    true

    Sample Input 2 :
    abababa
    Sample Output 2 :
    false

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class HCheckAB {

    public static boolean checkAB(String input) {

        // Base case
        if (input.length() == 0){ // ""
            return true;
        }

        if (input.length() == 1 && input.charAt(0) == 'a'){ // "a"
            return true;
        }
        else if (input.length() == 2 && (input.charAt(0) == 'a' && input.charAt(1) == 'a')){// "aa"
            return true;
        }
        else if (input.length() >= 3 ){

            if (input.charAt(0) == 'a' && input.charAt(1) == 'a'){ // "aa..."
                boolean smallOutput = checkAB(input.substring(1));
                return smallOutput;
            }
            else if (input.charAt(0) == 'a' && (input.charAt(1) == 'b' && input.charAt(2) == 'b')) { //"abb"
                boolean smallOutput = checkAB(input.substring(3));
                return smallOutput;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean ans = checkAB(input);
        System.out.println(ans);
    }
}
