
/* Question

    Given the code to find out and return the number of digits present in a number recursively.

    Input Format :
    Integer n

    Output Format :
    Count of digits

    Sample Input 1 :
    156
    Sample Output 1 :
    3

 */

package com.company.DSA.Recursion1;

import java.util.Scanner;

public class CNumberOfDigits {

    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int smallAns = count(n / 10);
        int ans = smallAns + 1;
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noOfDigits = count(n);
        System.out.println(noOfDigits);
    }
}
