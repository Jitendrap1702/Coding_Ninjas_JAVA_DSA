/*
Given a string, find and return all the possible permutations of the input string.
Note : The order of permutations are not important.
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

public class ReturnPermutationsOfAString {

    // Ex input  = "abc"
    public static String[] permutationOfString(String input){

        // base case
        if (input.length() == 0){
            String[] ans = {""};
            return ans;
        }

        String[] smallAns = permutationOfString(input.substring(1));

        String[] ans = new String[smallAns.length * input.length()]; // if string size == 3 then output will be 3*2 = 6
        // smallAns = {bc, ca}
        int k = 0;
        for (int i = 0; i < smallAns.length; i++){
            for (int j = 0; j < input.length(); j++){
                ans[k] = smallAns[i].substring(0, j) + input.charAt(0) + smallAns[i].substring(j);
                k++;
            }
        }
        // ans = {abc, bac, bca, acb, cab, cba}
        return ans;
    }

    public static void main(String[] args) {

        String input = "abc";
        String[] ans = permutationOfString(input);
        for (String i: ans){
            System.out.println(i);
        }
    }
}
