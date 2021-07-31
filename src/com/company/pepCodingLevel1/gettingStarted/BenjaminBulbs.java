package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class BenjaminBulbs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= Math.sqrt(n); i++){
            System.out.println(i*i);
        }
    }
}
