
/*Question
    Print the following pattern for the given N number of rows.
    Pattern for N = 4
    1
    21
    321
    4321

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
    21
    321
    4321
    54321
 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = i-j+1

    i = row number
    j = column number
 */

package com.company.Fundamentals.Pattern1;

import java.util.Scanner;

public class TriangleReverseNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i<=n){
            int j = 1;
            while (j <= i){
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
