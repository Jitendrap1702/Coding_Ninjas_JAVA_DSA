package com.company.pepCodingLevel1.pattern;

import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // initially values of star and space
        int space = n/2;
        int star = 1;

        for(int i = 0; i < n; i++){

            // print spaces
            for( int j = 0; j < space ; j++){
                System.out.print("\t");
            }

            // print stars
            for (int j = 0 ; j < star ; j++){
                System.out.print("*\t");
            }

            if(i < n/2){
                space--;
                star += 2;
            }else{
                space++;
                star -= 2;
            }

            // change the line
            System.out.println();
        }
    }
}

// if n = 5 then pattern will be :-

//          *
//      *	*	*
//   *	*	*	*	*
//      *	*	*
//          *
