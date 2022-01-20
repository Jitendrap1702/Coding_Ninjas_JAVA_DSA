package com.company.Codechef.Exun2021_22;

import java.util.Scanner;

public class SarthakAndHisMagicGrid {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                String x = "";
                for (int j = 0; j < n; j++) {
                    x += "1 ";
                }

                for (int j = 0; j < n; j++) {
                    System.out.println(x);
                }
            }
        }catch (Exception e){}
    }
}
