/*
Miss. Noor Rashid is a teacher. She wants to give some chocolates to the students in her class.
All the students sit in a line, and each of them has a score according to performance.
Noor wants to give at least one chocolate to each student.
She distributes chocolates to them such that If two students sit next to each other,
then the one with the higher score must get more chocolates. Miss. Noor wants to save money,
so she wants to minimize the total number of chocolates.
Note :
When two students have an equal score, they are allowed to have a different number of chocolates.
Input Format:
The first line of the input contains an integer value of N.
It denotes the total number of students in Noor's class.

The second line of the input contains N integer values denoting the score of each of the students.
A single space will separate them.
Output Format:
Print the minimum number of chocolates Noor must give.
Constraints
1 <= N <= 10^5
1 <= score <= 10^5

Time Limit: 1 sec
Sample Input 1 :
4
1 4 4 6
Sample Output 1 :
6
Explanation:
One of the ways in which the chocolates can be distributed,
such Noor has to give minimum number of chocolates, are:
The first student can be given one chocolate,
second student can be given two chocolates,
third student can be one chocolate and fourth can be given two chocolates.
Sample Input 2 :
3
8 7 5
Sample Output 2 :
6
 */
package com.company.DSA.DynamicProgramming2.Assignment;

public class MinimumNumberOfChocolates {

    public static int getMin(int arr[], int N){

        int[] storage = new int[N];
        storage[0] = 1;
        // left to right
        for (int i = 1; i < N; i++){

            if (arr[i] > arr[i-1]){
                storage[i] = 1 + storage[i-1];
            }else {
                storage[i] = 1;
            }
        }
        // right to left
        for (int i = N-2; i >= 0; i--){

            if ((arr[i] > arr[i+1]) && storage[i] <= storage[i+1]){
                storage[i] = 1+storage[i+1];
            }
        }

        // ans
        int ans = 0;
        for (int i: storage){
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {

//        int N = 3;
//        int[] arr = {8, 7, 5};
        int N = 4;
        int[] arr = {1, 4, 4, 6};
        int ans = getMin(arr, N);
        System.out.println(ans);
    }
}
