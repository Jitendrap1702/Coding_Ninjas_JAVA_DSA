
/* Question

    print all pairs of a given array

    Note :- pair (a, b) and (b, a) will be considered same so don't print (b, a) if you already print (a, b)

            pair (a, a) and (b, b) are not valid pairs

 */

/* Solution

    Sample Input :
    6
    Enter 0th element of array :
    1
    Enter 1th element of array :
    2
    Enter 2th element of array :
    3
    Enter 3th element of array :
    4
    Enter 4th element of array :
    5
    Enter 5th element of array :
    6

    Sample Output :
    (1,2)
    (1,3)
    (1,4)
    (1,5)
    (1,6)
    (2,3)
    (2,4)
    (2,5)
    (2,6)
    (3,4)
    (3,5)
    (3,6)
    (4,5)
    (4,6)
    (5,6)

 */

package com.company.Fundamentals.Arrays1;

public class PrintAllPairs {

    public static void pairs(int[] arr){

        for (int i = 0; i < arr.length-1; i++){

            for (int j = i+1; j < arr.length; j++){

                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {

        // take array input
        int[] arr = ArraySum.takeInputArray();

        // print pairs
        pairs(arr);
    }
}
