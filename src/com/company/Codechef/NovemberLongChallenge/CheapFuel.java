package com.company.Codechef.NovemberLongChallenge;

import java.util.Scanner;

public class CheapFuel {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                int k = sc.nextInt();

                if ((x + (a * k)) > (y + (b * k))) {
                    System.out.println("DIESEL");
                } else if ((x + (a * k)) < (y + (b * k))) {
                    System.out.println("PETROL");
                } else {
                    System.out.println("SAME PRICE");
                }
            }
        }
        catch (Exception e){

        }
    }
}
