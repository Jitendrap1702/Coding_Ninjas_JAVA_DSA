package com.company.Codechef;

import java.util.Scanner;

public class Mixture {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0){
                System.out.println("Liquid");
            }
            else if (b == 0){
                System.out.println("Solid");
            }
            else {
                System.out.println("Solution");
            }
        }
    }
}
