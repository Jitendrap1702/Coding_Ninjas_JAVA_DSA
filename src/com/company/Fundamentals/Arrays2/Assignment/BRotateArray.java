package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class BRotateArray {

    public static void rotate1(int[] arr, int d) {

        for (int i = 0; i < d; i++){
            int temp = arr[0];
            for (int j = 0; j < arr.length; j++){
                if(j == arr.length-1){
                    arr[j] = temp;
                }else{
                    arr[j] = arr[j+1];
                }
            }
        }
    }

    // Better solution than rotate1
    // if arr = [1,2,3,4,5,6,7] and d = 2

    public static void rotate2(int[] arr, int d){

        //arr1 = [1,2]
        int[] arr1 = new int[d];
        for (int i = 0; i < d; i++){
            arr1[i] = arr[i];
        }

        // arr = [3,4,5,6,7,6,7]
        for (int j = 0; j < arr.length-d; j++){
            arr[j] = arr[j + d];
        }

        // arr = [3,4,5,6,7,1,2]
        int a = 0;
        int b = arr.length-d;
        while (a < arr1.length && b < arr.length){
            arr[b] = arr1[a];
            a++;
            b++;
        }

    }

    public static void main(String[] args) {

        // take input
        Scanner sc = new Scanner(System.in);
        int[] arr = ArraySum.takeInputArray();
        int d = sc.nextInt();
        rotate2(arr, d);
        ArraySum.printArray(arr);
    }
}
