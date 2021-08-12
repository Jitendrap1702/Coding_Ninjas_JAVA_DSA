
/* Question

    Given a binary number as an integer N, convert it into decimal and print.

    Input format :
    An integer N in the Binary Format

    Output format :
    Corresponding Decimal number (as integer)

    Constraints :
    0 <= N <= 10^9

    Sample Input 1 :
    1100
    Sample Output 1 :
    12

 */

/* Solution

 */

package com.company.Fundamentals.OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            result = result + rem*(int)Math.pow(2, count);
            count++;
        }
        System.out.println(result);
    }
}
