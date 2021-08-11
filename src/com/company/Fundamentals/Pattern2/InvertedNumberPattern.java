

/* Question

    Print the following pattern for the given N number of rows.
    Pattern for N = 4
    4444
    333
    22
    1

    Input format :
    Integer N (Total no. of rows)

    Output format :
    Pattern in N lines

 */

/* Solution
    total rows i need to print = n
    total columns ith row has = (n - i + 1)
    what to print = (n - i + 1)

 */


package com.company.Fundamentals.Pattern2;

import java.util.Scanner;

public class InvertedNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            int j = 1;
            while (j <= n - i + 1){
                System.out.print(n - i + 1);
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
