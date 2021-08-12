
/* Question
    Print the following pattern for given number of rows.

    Input format :
    Integer N (Total number of rows)

    Output Format :
    Pattern in N lines

    Sample Input :
    5
    Sample Output :
    5432*
    543*1
    54*21
    5*321
    *4321

 */

/* Solution

 */

package com.company.Fundamentals.Test1;

import java.util.Scanner;

public class NumberStarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            int num1 = 1;
            int x = n;
            while (num1 <= n-i){
                System.out.print(x);
                num1++;
                x--;
            }

            System.out.print("*");

            int num2 = i-1;
            int y = i-1;
            while (num2 >= 1){
                System.out.print(y);
                y--;
                num2--;
            }

            System.out.println();
            i++;
        }
    }
}
