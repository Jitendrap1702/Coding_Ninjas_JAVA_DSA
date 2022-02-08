/*
Whis and Beerus are playing a new game today.
They form a tower of N coins and make a move in alternate turns. Beerus plays first.
In one step, the player can remove either 1, X, or Y coins from the tower.
The person to make the last move wins the game. Can you find out who wins the game?
 Input format :
The first and the only line of input contains three integer values separated by a single space.
They denote the value of N, X and Y, respectively.
Output format :
Prints the name of the winner, either 'Whis' or 'Beerus' (Without the quotes).
Constraints :
1 <= N <= 10 ^ 6
2 <= X <= Y<= 50

Time Limit: 1 sec
Sample Input 1 :
4 2 3
Sample Output 1 :
Whis
Sample Input 2 :
10 2 4
Sample Output 2 :
Beerus
 */
package com.company.DSA.DynamicProgramming1.Assignment;

public class CoinTower {

    public static String findWinner(int n, int x, int y) {

        int[] storage = new int[n+1];
        // 0 - Whis wins, 1 - Beerus wins
        storage[0] = 0;
        storage[1] = 1;

        for (int i = 2; i <= n; i++){

            //Beerus wins if dp[i-1] or dp[i-x] or dp[i-y] is 0, i.e, Whis wins when the number of coins is (i-1), (i-x) or (i-y)
            //If none of them are 0, then Beerus cannot win => This means Whis wins for i number of coins

            // 1. reduce by 1
            if (storage[i-1] == 0){
                storage[i] = 1;
            }

            // 2. reduce by x
            else if ((i-x) >= 0 && storage[i-x] == 0){
                storage[i] = 1;
            }

            // 3. reduce by y
            else if ((i-y) >= 0 && storage[i-y] == 0){
                storage[i] = 1;
            }

            else {
                storage[i] = 0;
            }
        }

        // output
        if (storage[n] == 0){
            return "Whis";
        }else {
            return "Beerus";
        }

    }

    public static void main(String[] args) {

//        int n = 10, x = 2, y = 4;
        int n = 4, x = 2, y = 3;
        String ans = findWinner(n, x, y);
        System.out.println(ans);
    }
}
