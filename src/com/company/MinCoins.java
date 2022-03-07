package com.company;

import java.util.Scanner;

public class MinCoins {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reqCoins = 0;

        if (x >= 10){
            reqCoins += x/10;
            x = x%10;
        }
        if (x >= 5){
            reqCoins += x/5;
            x = x%5;
        }
        if (x >= 2){
            reqCoins += x/2;
            x = x%2;
        }
        if (x == 1){
            reqCoins++;
        }
        System.out.println(reqCoins);
    }
}
