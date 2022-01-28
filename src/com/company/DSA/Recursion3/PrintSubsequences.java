package com.company.DSA.Recursion3;

// Space complexity Reduced to 0(1)
public class PrintSubsequences {

    public static void printSubsequences(String input, String stringSoFor){

        // base case
        if (input.length() == 0){
            System.out.println(stringSoFor);
            return;
        }
        printSubsequences(input.substring(1), stringSoFor);// Don't include first char
        printSubsequences(input.substring(1), stringSoFor+input.charAt(0));// include first char
    }

    public static void main(String[] args) {

        String input = "abc";
        printSubsequences(input, "");
    }
}
