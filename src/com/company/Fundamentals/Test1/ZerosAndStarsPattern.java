
/* Question
    Print the following pattern
    Pattern for N = 4
    *000*000*
    0*00*00*0
    00*0*0*00
    000***000

    Input Format :
    N (Total no. of rows)

    Output Format :
    Pattern in N lines

 */

/* Solution

 */

package com.company.Fundamentals.Test1;

import java.util.Scanner;

public class ZerosAndStarsPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            int zero1 = i-1;
            while (zero1 >=1){
                System.out.print("0");
                zero1--;
            }

            System.out.print("*");

            int zero2 = n-i;
            while (zero2 >= 1){
                System.out.print("0");
                zero2--;
            }

            System.out.print("*");

            int zero3 = n-i;
            while (zero3 >= 1){
                System.out.print("0");
                zero3--;
            }

            System.out.print("*");

            int zero4 = i-1;
            while (zero4 >= 1){
                System.out.print("0");
                zero4--;
            }

            System.out.println();
            i++;
        }
    }
}
