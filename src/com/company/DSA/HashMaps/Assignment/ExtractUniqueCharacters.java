/*
Given a string S, you need to remove all the duplicates. That means,
the output string should contain each character only once.
The respective order of characters should remain same, as in the input string.
Input format:
The first and only line of input contains a string, that denotes the value of S.
Output format :
The first and only line of output contains the updated string, as described in the task.
Constraints :
0 <= Length of S <= 10^8
Time Limit: 1 sec
Sample Input 1 :
ababacd
Sample Output 1 :
abcd
Sample Input 2 :
abcde
Sample Output 2 :
abcde
 */

package com.company.DSA.HashMaps.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacters {

    public static String uniqueChar(String str){

        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c, 1);
                ans += c;
            }
        }
        // return all unique chars
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = uniqueChar(s);
        System.out.println(ans);
    }
}
