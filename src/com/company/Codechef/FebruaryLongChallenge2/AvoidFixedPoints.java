package com.company.Codechef.FebruaryLongChallenge2;

import java.util.ArrayList;
import java.util.Scanner;

public class AvoidFixedPoints {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {

                int n = sc.nextInt();
                ArrayList<Integer> a = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    a.add(sc.nextInt());
                }

                int ans = 0;
                int j = 0;
                while (j < a.size()) {
                    if (a.get(j) == j + 1) {
                        a.add(j, -1);
                        ans++;
                    } else {
                        j++;
                    }
                }
                System.out.println(ans);
            }
        }catch (Exception e){}
    }
}
