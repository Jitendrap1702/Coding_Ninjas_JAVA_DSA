package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class PrimeFactorOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for( int div = 2; div <= Math.sqrt(n); div++){
            while(n % div == 0){
                System.out.print(div + " ");
                n = n / div;
            }
        }

        if(n>1){
            System.out.print(n);
        }
    }
}
