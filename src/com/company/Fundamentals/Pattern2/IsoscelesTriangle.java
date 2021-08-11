
/* Question

    Print the following pattern for the given N number of rows.
    Pattern for N = 4
       1
      121
     12321
    1234321

    Input format :
    Integer N (Total no. of rows)

    Output format :
    Pattern in N lines

 */

/* solution

    we will depart it in 3 parts

    part 1 : spaces
    total rows i need to print = n
    total columns ith row has = (n - i)
    what to print = space

    part 2 : Increasing numbers
    total rows i need to print = n
    total columns ith row has = i
    what to print = 1 to i

    part 3 : Decreasing numbers
    total rows i need to print = n
    total columns ith row has = i - 1
    what to print = i - 1 to 1

 */

package com.company.Fundamentals.Pattern2;

import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            // spaces
            int spaces = 1;
            while (spaces <= n - i){
                System.out.print(" ");
                spaces++;
            }

            // numbers in increasing order
            int inc = 1;
            while (inc <= i){
                System.out.print(inc);
                inc++;
            }

            // numbers in decreasing order
            int dec = i - 1;
            while (dec >= 1){
                System.out.print(dec);
                dec--;
            }

            System.out.println();
            i++;
        }
    }
}
