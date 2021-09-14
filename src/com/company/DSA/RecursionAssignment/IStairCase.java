
/* Question

    A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
    Implement a method to count how many possible ways the child can run up to the stairs.
    You need to return number of possible ways W.

    Input format :
    Integer N

    Output Format :
    Integer W

    Sample Input 1 :
    4
    Sample Output 1 :
    7

 */

package com.company.DSA.RecursionAssignment;

import java.util.Scanner;

public class IStairCase {

    public static int staircase(int n){

        // Base Case
        if (n < 0){
            return 0;
        }
        if (n == 1 || n == 0){  // n = 1 taking 1 step   and  n = 0  taking not any step is also a way
           return 1;
       }

       return staircase(n-1) + staircase(n-2) + staircase(n-3);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ways = staircase(n);
        System.out.println(ways);
    }
}
