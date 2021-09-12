
/* Question

    replace "pi" by 3.14 in given string

 */

package com.company.DSA.Recursion2;

import java.util.Scanner;

public class CReplacePi {

    public static String replacePi(String input){

        // Base Case
        if (input.length() <= 1){
            return input;
        }
        if (input.charAt(0) == 'p' && input.charAt(1) == 'i'){
            // Call recursion on string of length n-2 and append 3.14
            String smallOutput  = replacePi(input.substring(2));
            return "3.14" + smallOutput;
        }else{
            // Call recursion on string of length n-1 and append 0th char to it
            String smallOutput  = replacePi(input.substring(1));
            return input.charAt(0) + smallOutput;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String output = replacePi(s);
        System.out.println(output);
    }
}
