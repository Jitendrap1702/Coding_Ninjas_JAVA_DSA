
/* Question

    Given is the code to print numbers from 1 to n in increasing order recursively.

    Input Format :
    Integer n

    Output Format :
    Numbers from 1 to n (separated by space)

    Sample Input 1 :
    6
    Sample Output 1 :
    1 2 3 4 5 6

 */

package com.company.DSA.Recursion1;

import java.util.Scanner;

public class DPrintFirstNNumbers {

    public static void print(int n){
        // base case
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        // induction step
        print(n - 1);
        // induction hypothesis
        System.out.print(n+" ");
    }

    // or we can print same thing like this :-
    public static void print2(int n){
        // base case
        if(n == 0){
            return;
        }
        // induction step
        print(n - 1);
        // induction hypothesis
        System.out.print(n+" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
