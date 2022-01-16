/*
Given an array consisting of positive and negative integers,
find the length of the longest subarray whose sum is zero.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array.
Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format
The first and only line of output contains length of the longest subarray whose sum is zero.
Constraints:
0 <= N <= 10^8
Time Limit: 1 sec
Sample Input 1:
10
 95 -97 -387 -435 -5 -70 897 127 23 284
Sample Output 1:
5
Explanation:
The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897
 */
package com.company.DSA.HashMaps.Assignment;

import java.util.HashMap;

public class LongestSubsetZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {

        // map<sum, index> , sum = sum till index
        // at index i, sum = x
        // at index j, sum = x
        // then sum of elements between i+1 and j will be 0 , length = j-i
        // if sum become 0 then length = map size + 1
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        int count = 0; // total element traversed of array
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            int l = 0;
            if (sum == 0){
                l = count + 1;
            }
            else if (map.containsKey(sum)){
                l = i-map.get(sum);
            }

            if (l > maxLength){
                maxLength = l;
            }

            map.put(sum, i);
            count++;
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int n = 10;
        //int[] arr = { 95, -97, -387, -435, -5, -70, 897, 127, 23, 284 };
        //int[] arr = { 6, 3, -1, 2, -4, 3, 1, -1, 20 };
        int[] arr = { 6, 1, 5, -8, -4, 2 };
        //int[] arr = { 2, -2, 0, -2, 2};
        int ans = lengthOfLongestSubsetWithZeroSum(arr);
        System.out.println(ans);
    }
}
