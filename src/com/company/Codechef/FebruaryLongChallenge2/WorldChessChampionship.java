package com.company.Codechef.FebruaryLongChallenge2;

import java.util.Scanner;

public class WorldChessChampionship {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                String s = sc.next();
                int carlson = 0, chef = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'C') {
                        carlson += 2;
                    } else if (s.charAt(j) == 'N') {
                        chef += 2;
                    } else {
                        carlson++;
                        chef++;
                    }
                }

                int prizeMoney = 0;
                if (carlson > chef) {
                    prizeMoney = 60 * x;
                } else if (chef > carlson) {
                    prizeMoney = 40 * x;
                } else {
                    prizeMoney = 55 * x;
                }

                System.out.println(prizeMoney);
            }
        }catch (Exception e){}
    }
}
