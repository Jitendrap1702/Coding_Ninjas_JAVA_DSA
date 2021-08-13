
/* Question
    You have been given an empty array(ARR) and its size N.
    The only input taken from the user will be N.
    Your task is to populate the array using the integer values
    in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.

    Sample Input 1 :
    6
    Sample Output 1 :
    1 3 5 6 4 2

    Sample Input 2 :
    9
    Sample Output 2 :
    1 3 5 7 9 8 6 4 2

 */

package com.company.Fundamentals.Arrays1;

import java.util.Scanner;

public class ArrangeNumbersInArray {

    public static void arrange(int[] arr, int n) {

        int x = (n-1)/2;

        if(n == 0){
            return;
        }
        int ele1 = 1;
        for (int i = 0 ; i <= x ; i++){
            arr[i] = ele1;
            ele1 += 2;
        }

        int ele2 = 2*(n/2);
        for (int i = x + 1 ; i < n ; i++){
            arr[i] = ele2;
            ele2 -= 2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arrange(arr, n);
        ArraySum.printArray(arr);

    }
}
