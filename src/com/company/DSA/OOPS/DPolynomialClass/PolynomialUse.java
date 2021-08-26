package com.company.DSA.OOPS.DPolynomialClass;

import com.company.DSA.OOPS.DPolynomialClass.Polynomial;

import java.util.Scanner;

public class PolynomialUse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }

    }
}
