
/* Question
    Print the following pattern for the given number of rows.

    Note: N is always odd.

    Pattern for N = 5
      *
     ***
    *****
     ***
      *

    Input format :
    N (Total no. of rows and can only be odd)

    Output format :
    Pattern in N lines

 */

/* Solution

    we will depart it in 6 parts (3 upper parts & 3 lower parts)

    3 upper parts :-

    part 1 : spaces
    total rows i need to print = n/2 + 1
    total columns ith row has = n/2 + 1 - i
    what to print = space

    part 2 : Increasing numbers
    total rows i need to print = n/2 + 1
    total columns ith row has = i
    what to print = *

    part 3 : Decreasing numbers
    total rows i need to print = n/2 + 1
    total columns ith row has = i - 1
    what to print = *

    3 lower parts :-

    part 1 : spaces
    total rows i need to print = n/2
    total columns ith row has = i
    what to print = space

    part 2 : Increasing numbers
    total rows i need to print = n/2
    total columns ith row has = n/2 + 1 - i
    what to print = *

    part 3 : Decreasing numbers
    total rows i need to print = n/2
    total columns ith row has = n/2 - i
    what to print = *


 */

package com.company.Fundamentals.Pattern2;

import java.util.Scanner;

public class DiamondsOfStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // For upper part of Diamond
        int i = 1;
        while (i <= n / 2 + 1){

            // part 1
            int spaces1 = 1;
            while (spaces1 <= n/2 + 1 - i){
                System.out.print(" ");
                spaces1++;
            }

            // part 2
            int star1 = i;
            while (star1 >= 1){
                System.out.print("*");
                star1--;
            }

            // part 3
            int star2 = i - 1;
            while (star2 >= 1){
                System.out.print("*");
                star2--;
            }

            System.out.println();
            i++;
        }

        // For Lower Part of Diamond
        int j = 1;
        while (j <= n / 2){

            // part 4
            int spaces2 = 1;
            while (spaces2 <= j){
                System.out.print(" ");
                spaces2++;
            }

            // part 5
            int star3 = n / 2 + 1 - j;
            while (star3 >= 1){
                System.out.print("*");
                star3--;
            }

            // part 6
            int star4 = n / 2 - j;
            while (star4 >= 1){
                System.out.print("*");
                star4--;
            }

            System.out.println();
            j++;
        }
    }
}
