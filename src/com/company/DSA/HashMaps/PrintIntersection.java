/*
You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively.
You need to print their intersection; An intersection for this problem can be defined
when both the arrays/lists contain a particular value or to put it in other words,
when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list (ARR1).


Input format :
The first line of input contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the
first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
Print the intersection elements. Each element is printed in a separate line.
Constraints :
0 <= N <= 10^6
0 <= M <= 10^6

Time Limit: 1 sec
Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7
Sample Output 1 :
2
3
4
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1
2
2
 */

package com.company.DSA.HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintIntersection {

    // O(nlogn) because of sorting (as line 9)
    public static void printIntersection(int[] arr1,int[] arr2){

        Arrays.sort(arr1);
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i : arr1){
            if (map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            }else{
                map1.put(i, 1);
            }
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : arr2){
            if (map2.containsKey(i)){
                map2.put(i, map2.get(i)+1);
            }else{
                map2.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()){
            if (map2.containsKey(entry.getKey())){
                // x is : minimum of number of times a number (key) occurs in arr1 and arr2
                int x = entry.getValue() < map2.get(entry.getKey()) ? entry.getValue() : map2.get(entry.getKey());
                for (int i = 0; i < x; i++) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    // if we don't have to print in sorted order
    public static void printIntersectionUnsorted(int[] arr1, int[] arr2){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        for (int i = 0; i < arr2.length; i++){

            if (map.containsKey(arr2[i])) {
                int freq = map.get(arr2[i]);
                if (freq > 0) {
                    System.out.println(arr2[i]);
                    map.put(arr2[i], freq-1);
                }
            }
        }

    }

    public static void main(String[] args) {

//        int[] arr1 = {2, 6, 8, 5, 4, 3};
//        int[] arr2 = {2, 3, 4, 7};
        int[] arr1 = {2, 6, 1, 2};
        int[] arr2 = {1, 2, 3, 4, 2};
        printIntersection(arr1, arr2);
        printIntersectionUnsorted(arr1, arr2);
    }
}
