/*
Chef wants to store some important numerical data on his personal computer. He is using a new data type that can store values only from 0 till N both inclusive. If this data type receives a value greater than N then it is cyclically converted to fit into the range 0 to N. For example:

Value N+1 will be stored as 0.
Value N+2 will be stored as 1.
and so on…

Given X, the value chef wants to store in this new data type. Determine what will be the actual value in memory after storing X.

Input Format
First line will contain T, number of testcases. Then the testcases follow.
Each testcase contains a single line of input, two space separated integers N,X - the maximum value a data type can store and the value Chef wants to store in the data type respectively.
Output Format
For each testcase, output in a single line the value which will be actually stored in memory.

Constraints
1≤T≤3000
1≤N≤50
0≤X≤50
Sample Input 1
5
15 0
15 10
11 12
27 37
50 49
Sample Output 1
0
10
0
9
49
Explanation
Test Case 1: The data type can store values from 0 to 15. If we try to put 0 in this data type,
then the stored value will be the same, that is 0.

Test Case 2: The data type can store values from 0 to 15. If we try to put 10 in this data type,
then the stored value will be the same, that is 10.

Test Case 3: The data type can store values from 0 to 11. If we try to put 12 in this data type,
then the stored value will cyclically come back to 0. Hence the output is 0.

Test Case 4: The data type can store values from 0 to 27. If we try to put 37 in this data type,
then the stored value will cyclically convert to 9. Hence the output is 9.
 */
package com.company.Codechef.CodechefStarters25;

import java.util.Scanner;

public class FitInDataType {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                if (x <= n) {
                    System.out.println(x);
                } else {
                    System.out.println(x%(n+1));
                }
            }
        }catch (Exception e){ }
    }
}
