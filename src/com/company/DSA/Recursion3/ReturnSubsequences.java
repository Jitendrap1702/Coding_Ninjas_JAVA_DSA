/*
for "abc"
all subsequences are :-
["", a, b, c, ab, bc, ca, abc]
 */
package com.company.DSA.Recursion3;

import java.util.ArrayList;

public class ReturnSubsequences {

    public static String[] allSubsequences(String s){

        // base case
        if (s.length() == 0){
            String[] ans = new String[1];
            ans[0] = "";
            return ans;
        }
        // if input s is "abc" then first calculate for "bc" then add "a" to all subsequences
        String[] smallAns = allSubsequences(s.substring(1));
        //// small calculation
        String[] ans = new String[smallAns.length*2];
        for (int i = 0; i < smallAns.length; i++){
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++){
            ans[smallAns.length + i] = s.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String[] ans =  allSubsequences(s);
        for (String i: ans){
            System.out.println(i);
        }
    }
}
