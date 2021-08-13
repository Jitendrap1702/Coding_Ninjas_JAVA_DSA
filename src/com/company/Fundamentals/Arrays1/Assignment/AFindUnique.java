
/* Question
    You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
    Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
    You need to find and return that number which is unique in the array/list.

    Note : Unique element is always present in the array/list according to the given condition.

    Sample Input 1:
    7
    2 3 1 6 3 6 2

    Sample Output 1:
    1

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class AFindUnique {

    public static int findUnique(int[] arr){

        int val = 0;
        for (int i = 0; i < arr.length ; i++){
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++){

               if(arr[i] == arr[j] && i != j){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                val = arr[i];
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) {

        // take array input
        int[] arr = ArraySum.takeInputArray();

        // get unique value
        int uniqueValue = findUnique(arr);
        System.out.println(uniqueValue);

    }
}
