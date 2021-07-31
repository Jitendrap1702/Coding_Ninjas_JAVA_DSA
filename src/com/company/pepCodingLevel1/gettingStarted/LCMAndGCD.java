package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class LCMAndGCD {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int big = 0;
        int small = 0;

        // find which number is biggest between n1 and n2
        if(num1>num2){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        }

        // calculate GCD
        int GCD = 1;
        for(int i=small; i > 1; i--){
            if(big%i==0 && small%i == 0){
                GCD = i;
                break;
            }
        }

        // calculate LCM
        // Method 1
        int LCM1 = (num1 * num2) / GCD;

        // Method 2
        int LCM2 = big;
        while(true){
            if(LCM2 % num1 == 0 && LCM2 % num2 == 0){
                break;
            }
            LCM2++;
        }


        System.out.println(GCD+ "\n"+LCM2);
    }
}
