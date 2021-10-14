package com.company.Codechef.OctoberLongChallenge;

import java.util.Scanner;

public class ThreeBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a+b+c <= d){
                System.out.println(1);
            }
            else if (a+b <= d){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
    }
}
