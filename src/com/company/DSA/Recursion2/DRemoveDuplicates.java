
/* Question

    Given a string S, remove consecutive duplicates from it recursively.

    Input Format :
    String S

    Output Format :
    Output string

    Sample Input 1 :
    aabccba

    Sample Output 1 :
    abcba

 */

package com.company.DSA.Recursion2;

import java.util.Scanner;

public class DRemoveDuplicates {

    public static String removeConsecutiveDuplicates(String s){

        // Base Case
        if (s.length() <= 1){
            return s;
        }

        if (s.charAt(0) == s.charAt(1)){
            // call recursion on string of length n-1
            String smallOutput = removeConsecutiveDuplicates(s.substring(1));
            return smallOutput;
        }
        else{
            // call recursion on string of length n-1 and 0th char to it
            String smallOutput = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0) + smallOutput;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String output = removeConsecutiveDuplicates(s);
        System.out.println(output);
    }
}
