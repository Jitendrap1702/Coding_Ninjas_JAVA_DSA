package com.company.Fundamentals.Strings.Assignment;

import java.util.Scanner;

public class CRemoveCharacter {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ch){
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        char ch = str1.charAt(0);
        String output = removeAllOccurrencesOfChar(str, ch);
        System.out.println(output);
    }
}
