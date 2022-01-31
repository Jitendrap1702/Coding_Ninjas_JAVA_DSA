/*
Given a string, find and print all the possible permutations of the input string.
Note : The order of permutations are not important. Just print them in different lines.
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba
 */
package com.company.DSA.Recursion3.Assignment;

public class PrintPermutationsOfAString {

    public static void permutations(String input){

        permutations(input, "");
    }

    public static void permutations(String input, String stringSoFar){

        // Base case
        if (input.length() == 0){
            System.out.println(stringSoFar);
            return;
        }

        // include element
        for (int i = 0; i < input.length(); i++){
            // ith char
            char ch = input.charAt(i);
            // new input
            String newInput = input.substring(0, i) + input.substring(i+1);
            // call recursion
            permutations(newInput, stringSoFar+ch);
        }
    }

    public static void main(String[] args) {

        String input = "abc";
        permutations(input);
    }
}
