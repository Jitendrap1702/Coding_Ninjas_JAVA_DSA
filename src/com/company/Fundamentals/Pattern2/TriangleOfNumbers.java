
/* Question

    Print the following pattern for the given N number of rows.
    Pattern for N = 4
       1
      232
     34543
    4567654

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
    what to print = i in increasing order

    part 3 : Decreasing numbers
    total rows i need to print = n
    total columns ith row has = i - 1
    what to print = 2i - 2 in decreasing order

 */

package com.company.Fundamentals.Pattern2;

import java.util.Scanner;

public class TriangleOfNumbers {

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
            int inc = i;
            int num1 = 1;
            while (num1 <= i){
                System.out.print(inc);
                num1++;
                inc++;
            }

            // numbers in decreasing order
            int dec = i - 1;
            int num2 = 2*i - 2;
            while (dec >= 1){
                System.out.print(num2);
                dec--;
                num2--;
            }

            System.out.println();
            i++;
        }
    }
}
