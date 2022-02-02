package com.company.Codechef.CodechefStarters24;

import java.util.Scanner;

public class YetAnotherConstructiveProblem {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                getABC(x);
            }
        }catch (Exception e){}
    }

    public static void getABC(int x){
        for (int a = 1; a < x; a++) {
            for (int b = a; b < x; b++) {
                for (int c = b; c < x*2+1; c++) {
                    if (((a | b) & (b | c) & (c | a)) == x) {
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
        }
    }
}
