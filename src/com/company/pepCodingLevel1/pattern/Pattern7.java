package com.company.pepCodingLevel1.pattern;

import java.util.*;

public class Pattern7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int star = 1;
        int space = 0;

        for ( int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < space ; j++){
                System.out.print("\t");
            }

            space += 1;

            System.out.println("*\t");
        }
    }
}

// if n = 5 then pattern will be :-


//        *
//           *
//              *
//                  *
//                      *

