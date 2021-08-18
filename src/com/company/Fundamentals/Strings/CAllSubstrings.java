
/* Question

    For a given input string(str), write a function to print all the possible substrings.

    Substring : A substring is a contiguous sequence of characters within a string.

    Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken
    are not contiguous

    Input Format:
    The first and only line of input contains a string without any leading and trailing spaces.
    All the characters in the string would be in lower case.

    Output Format:
    Print the total number of substrings possible, where every substring is printed on a single line and
    hence the total number of output lines will be equal to the total number of substrings.

    Note : The order in which the substrings are printed, does not matter.

    Constraints:
    0 <= N <= 10^6
    Where N is the length of the input string.

    Time Limit: 1 second

    Sample Input 1:
    abc

    Sample Output 1:
    a
    ab
    abc
    b
    bc
    c

 */

package com.company.Fundamentals.Strings;

import java.util.Scanner;

public class CAllSubstrings {

    /* Method 1
        if input string str = "pqrs" then output from this method will be
        p pq pqr pqrs q qr qrs r rs s
     */
    public static void printSubstrings1(String str) {

        for (int i = 0; i < str.length(); i++){
            for (int j = i; j < str.length(); j++){
                System.out.print(str.substring(i, j + 1) + " ");
            }
        }
    }

    /* Method 2
        if input string str = "pqrs" then output from this method will be
        p q r s pq qr rs pqr qrs pqrs
     */
    public static void printSubstrings2(String str) {

        for (int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = i; j < str.length(); j++){
                System.out.print(str.substring(count, j + 1) + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubstrings1(str);
    }
}
