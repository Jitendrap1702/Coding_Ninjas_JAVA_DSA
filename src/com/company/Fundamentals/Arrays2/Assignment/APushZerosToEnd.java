package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class APushZerosToEnd {

    // time limit exceed in test case 4
    public static void pushZerosAtEnd1(int[] arr) {

        for (int i = 1; i < arr.length; i++){

            if (arr[i] != 0){
                int j = i - 1;
                int temp = arr[i];
                while (j>=0 && arr[j] == 0){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
    }

    // submitted successfully
    public static void pushZerosAtEnd2(int[] arr) {

        int i = 0;
        int j = 0;
        while (i < arr.length){
            if (arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            i++;
        }

        while (j < arr.length){
            arr[j] = 0;
            j++;
        }
    }

    // submitted successfully
    public static void pushZerosAtEnd3(int[] arr) {

        int i = 0;
        int j = 0;
        while (i < arr.length){
            if (arr[i] != 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        pushZerosAtEnd3(arr);
        ArraySum.printArray(arr);
    }
}
