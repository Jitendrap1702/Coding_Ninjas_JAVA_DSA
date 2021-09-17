
/* Question

    Given two string s and t, write a function to check if s contains all characters of t (in the same order as
    they are in string t).

    Return true or false.
    Do it recursively.
    E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order.
    So function will return true.

    Input Format :
    Line 1 : String s
    Line 2 : String t
    Output Format :
    true or false

    Sample Input 1 :
    abchjsgsuohhdhyrikkknddg
    coding
    Sample Output 1 :
    true

 */

package com.company.DSA.Test3;

import java.util.Scanner;

public class DoesSContainT {

    public static boolean checkSequence(String a, String b) {

        if (b.length() == 0){
            return true;
        }
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == b.charAt(0)){
                return checkSequence(a.substring(i + 1), b.substring(1));
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean ans = checkSequence(a, b);
        System.out.println(ans);
    }
}
