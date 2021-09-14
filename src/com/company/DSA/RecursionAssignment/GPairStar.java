

/* Question

    Given a string S, compute recursively a new string where identical chars that are adjacent in the original
    string are separated from each other by a "*".

    Input format :
    String S

    Output format :
    Modified string

    Sample Input 1 :
    hello

    Sample Output 1:
    hel*lo

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class GPairStar {

    public static String addStars(String s) {

        // Base case
        if (s.length() == 1){
            return s;
        }
        // Recursive call and small calculation
        if (s.charAt(0) == s.charAt(1)){
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0) + "*" + smallOutput;
        }
        else{
            String smallOutput = addStars(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = addStars(s);
        System.out.println(ans);

    }
}
