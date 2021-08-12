
/* Question
    Given a decimal number (integer N), convert it into binary and print.
    The binary number should be in the form of an integer.

    Note: The given input number could be large, so the corresponding binary number can exceed the integer range.
    So you may want to take the answer as long for CPP and Java.

    Input format :
    Integer N

    Output format :
    Corresponding Binary number (long)

    Constraints :
    0 <= N <= 10^5

    Sample Input 1 :
    12
    Sample Output 1 :
    1100

 */

/* Solution

 */

package com.company.Fundamentals.OperatorsAndForLoop.Assignment;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        long result = 0;
        while (n > 0){
            int rem = n % 2;
            n /= 2;
            result = result + rem*(long)Math.pow(10, count);
            count++;
        }
        System.out.println(result);
    }
}
