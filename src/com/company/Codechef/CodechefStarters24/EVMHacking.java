/*
There are three cities and thus three EVMs. An insider told Chef that his party got A,B,C votes respectively in these three cities according to the EVMs. Also, the total number of votes cast are P,Q,R respectively for the three cities.

Chef, being the party leader, can hack at most one EVM so that his party wins. On hacking a particular EVM all the votes cast in that EVM are counted in favor of Chef's party.

A party must secure strictly more than half of the total number of votes cast in order to be considered the winner. Can Chef achieve his objective of winning by hacking at most one EVM?

Input Format
The first line of input contains an integer T, denoting the number of test cases. The description of T test cases follows.
Each test case consists of a single line of input, containing six space-separated integers — in order, A,B,C,P,Q,R.
Output Format
For each test case, output in a single line the answer — "YES", if Chef can win the election after hacking at most one EVM and "NO" if not.

You may print each character of the string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

Constraints
1≤T≤5⋅103
0≤A<P≤100
0≤B<Q≤100
0≤C<R≤100
Sample Input 1
3
1 1 1 3 3 3
49 1 49 50 100 50
0 0 0 1 1 1
Sample Output 1
YES
YES
NO
Explanation
Test case 1: Chef can hack any EVM, thus getting a total of 3+1+1=5 votes which is more than 3+3+32=4.5 votes.

Test case 2: Only hacking the second EVM works, getting a total of 49+100+49=198 votes which is more than 50+100+502=100 votes.

Test case 3: None of the EVM's can help Chef in winning the election, since maximum number of votes he can secure by doing so is 1+0+0=1 which is less than 1+1+12=1.5.
 */
package com.company.Codechef.CodechefStarters24;

import java.util.Scanner;

public class EVMHacking {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                int r = sc.nextInt();
                if (a + b + c > (p + q + r) / 2) {
                    System.out.println("YES");
                } else {
                    int x = Math.max(Math.max(p - a, q - b), r - c); // hack in which chef get less vote
                    if (x + a + b + c > (p + q + r) / 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }catch (Exception e){}
    }
}
