package com.company.DSA.OOPS2.Polymorphism;

public class Example {

    static class Vehicle{
        void print(){
            System.out.print("Vehicle class");
        }
    }
    static class Car extends Vehicle{
        void print(){
            System.out.print("Car class ");
        }
    }

    public static class Main {
        public static void main(String[] args){
            Vehicle obj1 = new Car(); // it will call print() of car
            obj1.print();

            Vehicle obj2 = new Vehicle(); // it will call print() of vehicle
            obj2.print();
        }
    }

}
