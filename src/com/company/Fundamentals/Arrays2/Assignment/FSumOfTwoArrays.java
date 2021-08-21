
/* Question
    Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively.
    Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index).
    The idea here is to represent each array/list as an integer in itself of digits N and M.
    You need to find the sum of both the input arrays/list treating them as two integers and
    put the result in another array/list i.e. output array/list will also contain only single digit
    at every index.

    Note : The sizes N and M can be different.

    Output array/list(of all 0s) has been provided as a function argument.
    Its size will always be one more than the size of the bigger array/list.
    Place 0 at the 0th index if there is no carry.

    No need to print the elements of the output array/list.
    Using the function "sumOfTwoArrays", write the solution to the problem and store the answer
    inside this output array/list. The main code will handle the printing of the output on its own.

    Sample Input 1:
    3
    6 2 4
    3
    7 5 6
    Sample Output 1:
    1 3 8 0

    Sample Input 2:
    3
    8 5 2
    2
    1 3
    Sample Output 2:
    0 8 6 5

 */


package com.company.Fundamentals.Arrays2.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class FSumOfTwoArrays {

    // Method 1 :- wrong answer in test case 5
    public static void sumOfTwoArrays1(int arr1[], int arr2[], int output[]) {

        int n = arr1.length-1;
        int m = arr2.length-1;
        int len = output.length-1;
        int carry = 0;
        while (len >= 0){

            int sum = 0;
            if (n >= 0 && m >= 0){
                sum = arr1[n] + arr2[m] + carry;
                n--;
                m--;
            }
            else if (n >= 0){
                sum = arr1[n] + carry;
                n--;
            }
            else if (m >= 0){
                sum = arr2[m] + carry;
                m--;
            }
            else{
                sum = carry;
            }

            if (sum >= 10){
                int remainder = sum % 10;
                int quotient = sum / 10;
                output[len] = remainder;
                carry = quotient;
                len--;
            }else{
                output[len] = sum;
                len--;
            }
        }
    }

    public static void sumOfTwoArrays2(int arr1[], int arr2[], int output[]) {

        int m = arr1.length-1;
        int n = arr2.length-1;
        int len = output.length-1;
        int carry = 0;

        while (m >= 0 && n >= 0){
            int num = arr1[m] + arr2[n] + carry;
            carry = num/10;
            output[len] = num%10;
            m--;
            n--;
            len--;
        }

        while (m >= 0){
            int num = arr1[m] + carry;
            carry = num/10;
            output[len] = num%10;
            m--;
            len--;
        }

        while (n >= 0){
            int num = arr2[n] + carry;
            carry = num/10;
            output[len] = num%10;
            n--;
            len--;
        }

        output[len] = carry;

    }

        public static void main(String[] args) {

        // take input
        int[] arr1 = ArraySum.takeInputArray();
        int[] arr2 = ArraySum.takeInputArray();

        // the length of output array will be one more than biggest array between arr1 and arr2
        int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
        sumOfTwoArrays2(arr1, arr2, output);
        ArraySum.printArray(output);
    }

}
