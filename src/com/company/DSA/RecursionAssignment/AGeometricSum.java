
/* Question

    Given k, find the geometric sum i.e.
    1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
    using recursion.

    Input format :
    Integer k

    Output format :
    Geometric sum (upto 5 decimal places)

    Sample Input 1 :
    3

    Sample Output 1 :
    1.87500

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class AGeometricSum {

    public static double findGeometricSum(int k){

        // Base Case
        if (k == 0){
            return 1;
        }
        // recursive call
        double smallOutput = findGeometricSum(k-1);
        // Small calculation
        return 1/Math.pow(2, k) + smallOutput;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double ans = findGeometricSum(k);
        System.out.println(String.format("%.5f", ans));
    }
}
