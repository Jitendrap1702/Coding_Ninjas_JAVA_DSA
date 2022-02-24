package com.company.Codechef.CodechefStarters27;

import java.util.Scanner;

public class TheProductMystery {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++){
                int b = sc.nextInt();
                int c = sc.nextInt();
                for (int j = 1; j <= c/b; j++){
                    if (((j*b) % c) == 0){
                        System.out.println(j);
                        break;
                    }
                }
            }
        }catch (Exception e){}
    }
}
