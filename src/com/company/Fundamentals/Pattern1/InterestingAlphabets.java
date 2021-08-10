
/* Question

    Print the following pattern for the given number of rows.
    Pattern for N = 5
    E
    DE
    CDE
    BCDE
    ABCDE

    Input format :
    N (Total no. of rows)

    Output format :
    Pattern in N lines

    Constraints
    0 <= N <= 26

    Sample Input 1:
    8
    Sample Output 1:
    H
    GH
    FGH
    EFGH
    DEFGH
    CDEFGH
    BCDEFGH
    ABCDEFGH

 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = (char) ('A' + n - i)

 */

package com.company.Fundamentals.Pattern1;

import java.util.Scanner;

public class InterestingAlphabets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int j = 1;
            char ithChar = (char) ('A' + n - i);
            while (j <= i){
                System.out.print(ithChar);
                ithChar = (char) (ithChar + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
