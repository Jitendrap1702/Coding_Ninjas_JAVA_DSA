
/* Question

    find second largest element in given array

    Sample Input 1:
    5
    9 3 6 2 9
    Sample Output 1:
    6

    Sample Input 2:
    2
    6 6
    Sample Output 2:
    -2147483648

 */

package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class CSecondLargestInArray {

    public static int secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        // take input
        int[] arr = ArraySum.takeInputArray();
        int secondLargest = secondLargestElement(arr);
        System.out.println(secondLargest);
    }
}
