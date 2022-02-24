package com.company.Codechef.CodechefStarters27;

import java.util.Scanner;

public class Polybags {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int numBags = sc.nextInt();
                if (numBags % 10 == 0) {
                    System.out.println(numBags / 10);
                } else {
                    System.out.println(numBags / 10 + 1);
                }
            }
        }catch (Exception e){}
    }
}
