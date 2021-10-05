
/* Question

    Given an integer array A of size N, check if the input array can be splitted in two parts such that -
    - Sum of both parts is equal
    - All elements in the input, which are divisible by 5 should be in same group.
    - All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
    - Elements which are neither divisible by 5 nor by 3, can be put in any group.

    Groups can be made with any set of elements, i.e. elements need not to be continuous.
    And you need to consider each and every element of input array in some group.
    Return true, if array can be split according to the above rules, else return false.

    Note : You will get marks only if all the test cases are passed.

    Input Format :
    Line 1 : Integer N (size of array)
    Line 2 : Array A elements (separated by space)

    Output Format :
    true or false

    Constraints :
    1 <= N <= 50

    Sample Input 1 :
    2
    1 2
    Sample Output 1 :
    false

    Sample Input 2 :
    3
    1 4 3
    Sample Output 2 :
    true

 */

package com.company.DSA.Test1;

import com.company.Fundamentals.Arrays1.ArraySum;

public class SplitArray {

    public static boolean splitArray(int input[], int startIndex, int leftSum, int rightSum) {

        if (startIndex == input.length){
            return leftSum == rightSum;
        }

        if (input[startIndex] % 5 == 0){
            leftSum += input[startIndex];
        }
        else if (input[startIndex] % 3 == 0){
            rightSum += input[startIndex];
        }
        else{
            return (splitArray(input, startIndex + 1, leftSum + input[startIndex], rightSum) ||
                    splitArray(input, startIndex + 1, leftSum, rightSum+ input[startIndex]));
        }
        return splitArray(input, startIndex + 1, leftSum, rightSum);
    }

    public static void main(String[] args) {

        int[] arr = ArraySum.takeInputArray();
        boolean ans = splitArray(arr, 0, 0, 0);
        System.out.println(ans);
    }
}
