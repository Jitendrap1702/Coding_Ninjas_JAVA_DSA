package com.company.DSA.OOPS2.Polymorphism;

public class Example2 {

    static class Vehicle{
        String colour;
        private int number;
        void print()
        {
            System.out.println("vehicle");
        }
    }

    static class Car extends Vehicle{
        void print()
        {
            System.out.println("car");
        }
    }
    static class Honda extends Car{
        void print()
        {
            System.out.println("Honda");
        }
    }
    static class buy_car{
        public static void main (String[] args) {
            Car c=new Honda();
            c.print();  // it will call print() of honda
        }
    }
}
