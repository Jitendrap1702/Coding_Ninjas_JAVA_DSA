package com.company.Fundamentals;

public class MaximiseArraySum {

    // wrong
    static int sum(int[] arr1, int[] arr2){

        int i = 0, j = 0, sum1 = 0, sum2 = 0, sum = 0;
        while (i < arr1.length && j < arr2.length){

            sum1 += arr1[i];
            sum2 += arr2[i];
            if (arr1[i] == arr2[j]){
                sum += Math.max(sum1, sum2);
            }
            i++;
            j++;
        }

        if (i == arr1.length){
            while (j < arr2.length){
                sum += arr2[j];
                j++;
            }
        }

        if (j == arr2.length){
            while (i < arr2.length){
                sum += arr2[i];
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 9, 10, 15, 20, 25};
        int[] arr2 = {2, 4, 5, 10, 15};
        int sum = sum(arr1, arr2);
        System.out.println(sum);
    }
}
