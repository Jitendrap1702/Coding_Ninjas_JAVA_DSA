
/* Question

    For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.

    Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is
    equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the
    index 'i' is not included in either part.
    If more than one equilibrium indices are present, then the index appearing first in left to right fashion
    should be returned. Negative one(-1) if no such index is present.

    Example:
    Let's consider an array/list Arr = [2, 3, 10, -10, 4, 2, 9]  of size, N = 7.

    There exist two equilibrium indices, one at 2 and another at 3.

 */

package com.company.DSA.TimeComplexity;

import com.company.Fundamentals.Arrays1.ArraySum;

public class BArrayEquilibrium {

    public static int arrayEquilibriumIndex(int[] arr){
        // Calculate the total sum of given array
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        // Calculate the equilibrium index
        int leftSum = 0;
        for (int index = 0; index < arr.length; index++){
            int rightSum = totalSum - leftSum - arr[index];

            if (rightSum == leftSum){
                return index;
            }
            leftSum = leftSum + arr[index];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        int index = arrayEquilibriumIndex(arr);
        System.out.println(index);
    }
}
