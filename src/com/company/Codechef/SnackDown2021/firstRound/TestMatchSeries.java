package com.company.Codechef.SnackDown2021.firstRound;

import java.util.Scanner;

public class TestMatchSeries {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                int indWon = 0;
                int engWon = 0;
                for (int j = 0; j < 5; j++) {
                    int x = sc.nextInt();
                    if (x == 1) {
                        indWon++;
                    }
                    else if (x == 2){
                        engWon++;
                    }
                }
                if (indWon == engWon) {
                    System.out.println("DRAW");
                } else if (indWon > engWon){
                    System.out.println("INDIA");
                } else {
                    System.out.println("ENGLAND");
                }
            }
        }
        catch (Exception e){

        }
    }
}
