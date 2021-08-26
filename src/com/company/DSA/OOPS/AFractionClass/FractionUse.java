package com.company.DSA.OOPS.AFractionClass;

public class FractionUse {

    public static void main(String[] args) {

        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 2);
        f1.print();
        Fraction f3 = Fraction.add(f1, f2);
        f3.print();

        f1.add(f2);
        f1.print();
        f2.increment();
        f2.print();

    }

}
