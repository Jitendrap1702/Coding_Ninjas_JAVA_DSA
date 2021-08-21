
/* Question
    Given a string S (that can contain multiple words), you need to find the word which has minimum length.

    Note : If multiple words are of same length, then answer will be first minimum length word in the string.
    Words are seperated by single space only.

    Input Format :
    String S

    Output Format :
    Minimum length word

    Constraints :
    1 <= Length of String S <= 10^5

    Sample Input 1 :
    this is test string
    Sample Output 1 :
    is

    Sample Input 2 :
    abc de ghihjk a uvw h j
    Sample Output 2 :
    a

 */


package com.company.Fundamentals.Test2;

import java.util.Scanner;

public class MinimumLengthWord {

    public static String minLengthWord(String input){
        String ansString = "";
        int ansLength = Integer.MAX_VALUE;
        input = input + " ";

        int wordSize = 0;
        String word = "";
        for (int i = 0; i < input.length(); i++){

            if (input.charAt(i) != ' '){
                wordSize++;
                word += input.charAt(i);
            }else{
                if (wordSize < ansLength){
                    ansLength = wordSize;
                    ansString = word;
                }
                word = "";
                wordSize = 0;
            }
        }

        return ansString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = minLengthWord(input);
        System.out.println(ans);
    }
}
