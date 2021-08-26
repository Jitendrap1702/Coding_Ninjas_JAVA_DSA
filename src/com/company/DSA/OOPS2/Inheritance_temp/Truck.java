package com.company.DSA.OOPS2.Inheritance_temp;

import com.company.DSA.OOPS2.Inheritance.Vehicle;

public class Truck extends Vehicle {

    int maxLoadingCapacity;

    public Truck(int maxLoadingCapacity, String color, int maxSpeed){
        super(color, maxSpeed);
        this.maxLoadingCapacity = maxLoadingCapacity;
    }

    public static void main(String[] args) {

        Truck t = new Truck(78987, "Red", 180);
        t.maxSpeed = 10;
    }

    public void print(){
        System.out.println("Car " + "Color " + color + " MaxSpeed " + maxSpeed + " MaxLoadingCapacity " + maxLoadingCapacity);

    }
}
