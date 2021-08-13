
/* Question
     take array input of size n, print all element of array , and print sum of all element
 */

package com.company.Fundamentals.Arrays1;

import java.util.Scanner;

public class ArraySum {

    public static int sum(int[] arr) {
        //Your code goes here

        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int[] takeInputArray(){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter " + i + "th element of array : ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr){

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = takeInputArray();
        printArray(arr);
        int ans = sum(arr);
        System.out.println("sum of array is : " + ans);
    }
}
