
/* Question
    Print the following pattern for the given N number of rows.
    Pattern for N = 3
    A
    BB
    CCC

    Input format :
    Integer N (Total no. of rows)

    Output format :
    Pattern in N lines

    Constraints
    0 <= N <= 26

    Sample Input 1:
    7
    Sample Output 1:
    A
    BB
    CCC
    DDDD
    EEEEE
    FFFFFF
    GGGGGGG
 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = ith character

    char ithChar = (char) 'A' + i - 1
 */

package com.company.Fundamentals.Pattern1;

import java.util.Scanner;

public class AlphaPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            char ithChar = (char) ('A' + i - 1);
            int j = 1;
            while (j <= i){
                System.out.print(ithChar);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
