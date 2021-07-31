package com.company.pepCodingLevel1.gettingStarted;

import java.util.*;

public class PythagoreanTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int squareA = a*a;
        int squareB = b*b;
        int squareC = c*c;

        if((squareA == squareB + squareC) || (squareB == squareA + squareC) || (squareC == squareA + squareB)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
