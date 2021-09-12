package com.company.DSA.Recursion1;

import com.company.Fundamentals.Arrays1.ArraySum;

public class IIsArraySorted2 {

    public static boolean isSorted(int[] input, int startIndex){

        // Base case
        if (startIndex == input.length - 1){
            return true;
        }
        if (input[startIndex] > input[startIndex+1]){
            return false;
        }

        // recursive call + small calculation
        boolean isSmallArraySorted = isSorted(input, startIndex + 1);
        return isSmallArraySorted;

    }

    public static void main(String[] args) {

        int[] input = ArraySum.takeInputArray();
        boolean ans = isSorted(input, 0);
        System.out.println(ans);
    }
}
