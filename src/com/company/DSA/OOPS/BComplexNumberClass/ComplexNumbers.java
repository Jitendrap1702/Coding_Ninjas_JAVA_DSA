package com.company.DSA.OOPS.BComplexNumberClass;

public class ComplexNumbers {

    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print(){

        if (imaginary >=0) {
            System.out.println(real + " + " + "i" + imaginary);
        }else {
            System.out.println(real + " - " + "i" + Math.abs(imaginary)); // Math.abs will give only values for ex :- if c = -3 then Math.abs(c) will be 3
        }

    }

    public void plus(ComplexNumbers c2){

        int realPart = this.real + c2.real;
        int imaginaryPart = this.imaginary + c2.imaginary;

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }

    public void multiply(ComplexNumbers c2){

        int realPart = (this.real*c2.real) - (this.imaginary*c2.imaginary);
        int imaginaryPart = (this.real*c2.imaginary) + (this.imaginary*c2.real);

        this.real = realPart;
        this.imaginary = imaginaryPart;

    }
}
