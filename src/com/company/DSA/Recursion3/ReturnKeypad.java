/*
Given an integer n, using phone keypad find out all the possible strings that
can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you.
You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
 */
package com.company.DSA.Recursion3;

public class ReturnKeypad {

    static String getOptions(int digit){

        if (digit == 2){
            return "abc";
        }
        if (digit == 3){
            return "def";
        }
        if (digit == 4){
            return "ghi";
        }
        if (digit == 5){
            return "jkl";
        }
        if (digit == 6){
            return "mno";
        }
        if (digit == 7){
            return "pqrs";
        }
        if (digit == 8){
            return "tuv";
        }
        if (digit == 9){
            return "wxyz";
        }
        return "";
    }

    public static String[] keypadCombinations(Integer num){

        // base case
        if (num == 0){
            String[] ans = new String[1];
            ans[0] = "";
            return ans;
        }
        String[] smallAns = keypadCombinations(num/10);
        // small calculation
        int lastDigit = num%10;
        String lastDigitOptions = getOptions(lastDigit);
        String[] ans = new String[smallAns.length * lastDigitOptions.length()];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++){
            for (int j = 0; j < lastDigitOptions.length(); j++){
                ans[k] = smallAns[i] + lastDigitOptions.charAt(j);
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int num = 234;
        String[] ans = keypadCombinations(num);
        for (String s: ans){
            System.out.println(s);
        }
    }
}
