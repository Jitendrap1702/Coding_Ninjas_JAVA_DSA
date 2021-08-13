
/* Question

    search element from given array
    if element found print that index
    else print -1

 */

package com.company.Fundamentals.Arrays1;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int x) {

        int index = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = ArraySum.takeInputArray();
        int element = sc.nextInt();
        int index = linearSearch(arr, element);
        System.out.println(index);

    }
}
