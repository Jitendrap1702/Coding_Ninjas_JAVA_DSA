package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class Inverse {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ans = 0;
        while(n>0){
            int digit = n % 10;
            n = n/10;
            count += 1;
            ans += count* Math.pow(10, digit-1);

        }
        System.out.println(ans);
    }
}

