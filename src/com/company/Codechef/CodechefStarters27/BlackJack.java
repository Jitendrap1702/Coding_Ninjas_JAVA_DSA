package com.company.Codechef.CodechefStarters27;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = 21 - (a+b);
                if(c <= 10){
                    System.out.println(c);
                }else{
                    System.out.println(-1);
                }
            }
        }catch(Exception e){}
    }
}
