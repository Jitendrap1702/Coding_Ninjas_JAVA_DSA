
/* Question

    Print the following pattern for the given N number of rows.
    Pattern for N = 4
    A
    BC
    CDE
    DEFG

    Input format :
    Integer N (Total no. of rows)

    Output format :
    Pattern in N lines

    Constraints
    0 <= N <= 13

    Sample Input 1:
    5
    Sample Output 1:
    A
    BC
    CDE
    DEFG
    EFGHI

 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = p = (char) (ith character + j - 1);

    if i = 1 then ith char = 'A'
    if i = 2 then ith char = 'B'

 */

package com.company.Fundamentals.Pattern1;

import java.util.Scanner;

public class CharacterPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int j = 1;
            char ithChar = (char)('A' + i - 1);
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
