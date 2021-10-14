package com.company.Codechef.OctoberLongChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MEXOR {

    public static void main(String[] args) {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {

                int input = Integer.parseInt(br.readLine());

                int j = 0;
                while ((j | j + 1) <= input) {

                    j++;
                }

                System.out.println(j + 1);
            }
        } catch (Exception e) {

        }
    }
}
