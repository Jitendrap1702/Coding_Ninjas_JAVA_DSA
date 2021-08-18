
/* Question
    For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
    Permutations of each other
    Two strings are said to be a permutation of each other when either of the string's characters can be
    rearranged so that it becomes identical to the other one.

    Example:
    str1= "sinrtg"
    str2 = "string"

    The character of the first string(str1) can be rearranged to form str2 and hence we can say that
    the given strings are a permutation of each other.

    Input Format:
    The first line of input contains a string without any leading and trailing spaces,
    representing the first string 'str1'.

    The second line of input contains a string without any leading and trailing spaces,
    representing the second string 'str2'.

    Note : All the characters in the input strings would be in lower case.

    Output Format:
    The only line of output prints either 'true' or 'false', denoting whether the two strings are a
    permutation of each other or not.

    You are not required to print anything. It has already been taken care of. Just implement the function.

    Sample Input 1:
    abcde
    baedc

    Sample Output 1:
    true

 */

package com.company.Fundamentals.Strings.Assignment;

import javax.print.DocFlavor;
import java.util.Scanner;

public class ACheckPermutation {


    // we will use frequency array to solve this problem
    public static boolean isPermutation(String str1, String str2) {

        // if length of both strings are not equal then they will not be permutation
        if (str1.length() != str2.length()){
            return false;
        }

        int[] arr1 = new int[256];
        for (int i = 0; i < str1.length(); i++){
            int x = str1.charAt(i);
            arr1[x]++;
        }

        for (int i = 0; i < str2.length(); i++){
            int x = str2.charAt(i);
            arr1[x]--;
        }

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean isPermutation = isPermutation(str1, str2);
        System.out.println(isPermutation);
    }
}
