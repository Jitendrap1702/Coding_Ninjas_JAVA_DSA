
/* Question

    Given a string, compute recursively a new string where all 'x' chars have been removed.

    Input format :
    String S

    Output format :
    Modified String

    Sample Input 1 :
    xaxb

    Sample Output 1:
    ab

 */

package com.company.DSA.Recursion2;

import java.util.Scanner;

public class BRemoveX {

    public static String removeX(String s, char x){

        // Base case
        if (s.length() == 0){
            return s;
        }
        // recursive call
        String smallOutput = removeX(s.substring(1), x);
        // small calculation
        if (s.charAt(0) == x){
            return smallOutput; // removing x
        }else{
            return s.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        char x = s1.charAt(0);
        String output = removeX(s, x);
        System.out.println(output);
    }
}
