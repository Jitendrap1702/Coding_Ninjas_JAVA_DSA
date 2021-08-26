package com.company.DSA.OOPS.AFractionClass;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify(){

        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++){
            if (numerator%i ==0 && denominator%i ==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;

    }

    public void print(){

        System.out.println(numerator + "/" + denominator);

    }

    public void increment(){

        numerator = numerator + denominator;
        simplify();

    }

    public int getNumerator(){

        return numerator;

    }

    public void setNumerator(int num){

        numerator = num;

    }

    public int getDenominator(){

        return denominator;

    }

    public void setDenominator(int num){

        denominator = num;

    }

    public void add(Fraction f2){

        this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;

    }

    public static Fraction add(Fraction f1, Fraction f2){

        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDen = f1.denominator*f2.denominator;

        return new Fraction(newNum, newDen);
    }
}
