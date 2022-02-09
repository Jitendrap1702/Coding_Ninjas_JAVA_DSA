/*
Chef has closed his restaurant and decided to run a fruit stand instead.
His signature dish is a fruit chaat consisting of 2 bananas and 1 apple.
He currently has X bananas and Y apples. How many chaats can he make with the fruits he currently has?

Input Format
The first line will contain T, the number of testcases. Then the testcases follow.
Each testcase consists of a single line containing two space separated integers - X and Y
Output Format
For each testcase, output the answer on a new line.

Constraints
1≤T≤100
0≤X,Y≤100
Sample Input 1
3
72 50
38 93
51 4
Sample Output 1
36
19
4
Explanation
Test Case 1: Chef can make 36 chaats using 72 bananas and 36 apples.

Test Case 2: Chef can make 19 chaats using 38 bananas and 19 apples.

Test Case 3: Chef can make 4 chaats using 8 bananas and 4 apples.
 */
package com.company.Codechef.CodechefStarters25;

import java.util.Scanner;

public class ChefAndHisFruitStand {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                System.out.println(Math.min(x / 2, y));
            }
        }catch (Exception e){}
    }
}
