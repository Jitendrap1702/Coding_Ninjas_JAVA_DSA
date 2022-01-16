/*
You are given with an array of integers and an integer K.
You have to find and print the count of all such pairs which have difference K.
Note: Take absolute difference between the elements of the array.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array.
Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
The following line contains an integer, that denotes the value of K.
Output format :
The first and only line of output contains count of all such pairs which have an absolute difference of K.
Constraints :
0 <= n <= 10^4
Time Limit: 1 sec
Sample Input 1 :
4
5 1 2 4
3
Sample Output 1 :
2
Sample Input 2 :
4
4 4 4 4
0
Sample Output 2 :
6
 */
package com.company.DSA.HashMaps.Assignment;

import java.util.HashMap;

public class PairsWithDifferenceK {

    public static int getPairsWithDifferenceK(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++){

            if (map.containsKey(arr[i] + k)){
                count += map.get(arr[i] + k);
            }

            if (k!=0) {
                if (map.containsKey(arr[i] - k)) {
                    count += map.get(arr[i] - k);
                }
            }

            // update occurrence of number in map or add number to map
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 4;
        int[] arr = {5, 1, 2, 4};
        int k = 3;
        int count = getPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }
}
