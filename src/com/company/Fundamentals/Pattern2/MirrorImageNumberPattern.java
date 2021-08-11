
/* Question

    Print the following pattern for the given N number of rows.
    Pattern for N = 4

        1
       12
      123
     1234

 */

/* Solution
    total rows i need to print = n
    total columns ith row has = i
    what to print = (n-i) spaces  and i numbers

 */

package com.company.Fundamentals.Pattern2;

import java.util.Scanner;

public class MirrorImageNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n){

            int spaces = 1;
            while (spaces <= n-i){
                System.out.print(" ");
                spaces++;
            }

            int numbers = 1;
            while (numbers <= i){
                System.out.print(numbers);
                numbers++;
            }

            System.out.println();
            i++;
        }
    }
}
