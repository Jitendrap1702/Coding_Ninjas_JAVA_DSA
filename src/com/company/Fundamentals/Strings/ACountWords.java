
/* Question
    For a given input string(str), find and return the total number of words present in it.
    It is assumed that two words will have only a single space in between.
    Also, there wouldn't be any leading and trailing spaces in the given input string.

    Sample Input 1:
    Coding Ninjas!

    Sample Output 1:
    2

 */

package com.company.Fundamentals.Strings;

import java.util.Scanner;

public class ACountWords {

    public static int countWords(String str) {
        if (str.length() == 0){
            return 0;
        }
        int totalSpaces = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                totalSpaces++;
            }
        }
        return totalSpaces + 1;
    }


    public static void main(String[] args) {

        // Take String Input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = countWords(str);
        System.out.println(count);
    }
}
