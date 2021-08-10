
/*
    Question :-
    Print the following pattern for the given N number of rows.
    Pattern for N = 4
    1
    22
    333
    4444

    Input format :
    Integer N (Total no. of rows)

    Output format :
    Pattern in N lines

    Constraints
    0 <= N <= 50

    Sample Input 1:
    5
    Sample Output 1:
    1
    22
    333
    4444
    55555
 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = i
 */

package com.company.Fundamentals.Pattern1;

import java.util.Scanner;

public class TriangleNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
