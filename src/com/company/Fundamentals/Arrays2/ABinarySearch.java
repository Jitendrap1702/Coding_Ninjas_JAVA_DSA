
/* Question
    Binary Search (It is applicable for only sorted arrays)

    Input
    1. array size
    2. array elements
    3. item to be searched

    Output :
    index of element if element exists, else -1

 */

package com.company.Fundamentals.Arrays2;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Scanner;

public class ABinarySearch {

    public static int binarySearch(int[] arr, int x) {

        int len = arr.length;
        int start = 0;
        int end = len-1;
        while (start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] > x){
                end = mid-1;
            }
            else if (arr[mid] < x){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // take input
        Scanner sc = new Scanner(System.in);
        int[] arr = ArraySum.takeInputArray();
        int x = sc.nextInt();

        // print index of x
        int indexOfX = binarySearch(arr, x);
        System.out.println(indexOfX);
    }
}
