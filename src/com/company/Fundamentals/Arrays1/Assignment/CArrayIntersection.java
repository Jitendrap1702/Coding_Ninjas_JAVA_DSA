
/* Question
    You have been given two integer arrays/list(ARR1 and ARR2) of size M and N, respectively.
    You need to print their intersection; An intersection for this problem can be defined
    when both the arrays/lists contain a particular value or to put it in other words,
    when there is a common value that exists in both the arrays/lists.

    Note : Input arrays/lists can contain duplicate elements.

    The intersection elements printed would be in the order they appear in the first array/list(ARR1)

    Sample Input 2 :
    4
    2 6 1 2
    5
    1 2 3 4 2

    Sample Output 2 :
    2 1 2

 */

package com.company.Fundamentals.Arrays1.Assignment;

import com.company.Fundamentals.Arrays1.ArraySum;

public class CArrayIntersection {

    public static void intersection(int[] arr1, int[] arr2){

        for (int i = 0; i < arr1.length; i++){

            for (int j = 0; j < arr2.length; j++){

                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        // take array input
        int[] arr1 = ArraySum.takeInputArray();
        int[] arr2 = ArraySum.takeInputArray();

        // print intersection of arr1 and arr2
        intersection(arr1, arr2);

    }
}
