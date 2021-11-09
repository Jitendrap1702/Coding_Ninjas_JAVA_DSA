package com.company.Codechef.SnackDown2021.firstRound;

import java.util.Scanner;

public class LuckyNum {

    public static boolean isAvailable(){
        Scanner sc = new Scanner(System.in);
        boolean ans = false;
        for (int i = 0; i < 3; i++){
            int x = sc.nextInt();
            if (x == 7){
                ans = true;
            }
        }
        if (ans){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {

                boolean ans = false;
                for (int j = 0; j < 3; j++) {
                    if (sc.nextInt() == 7) {
                        ans = true;
                    }
                }
                if (ans) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        catch (Exception e){

        }
    }
}
