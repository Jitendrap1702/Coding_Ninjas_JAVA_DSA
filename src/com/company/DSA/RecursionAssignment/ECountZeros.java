
/* Question

    Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

    Input Format :
    Integer N

    Output Format :
    Number of zeros in N

    Sample Input 1 :
    0
    Sample Output 1 :
    1

    Sample Input 2 :
    00010204
    Sample Output 2 :
    2

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class ECountZeros {

    public static int countZerosRec(int input){

        // Base Case
        if (input == 0){
            return 1;
        }
        if (input < 10){ // for example 01, 1, 2, 0003 etc.
            return 0;
        }
        // Recursive call
        int smallOutput = countZerosRec(input/10);
        // small calculation
        if (input % 10 == 0){
            return 1 + smallOutput;
        }
        else{
            return smallOutput;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int ans = countZerosRec(input);
        System.out.println(ans);
    }
}
