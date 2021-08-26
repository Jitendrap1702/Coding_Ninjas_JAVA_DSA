package com.company.DSA.OOPS2.Inheritance;

public class Car extends Vehicle {

    int numDoors;

    public Car(int numDoors, String color, int maxSpeed){
        super(color, maxSpeed);
        this.numDoors = numDoors;
        System.out.println("This is car");
    }

    public void print(){
        super.print();
        System.out.println("Car " + "Color " + color + " MaxSpeed " + maxSpeed + " NumOfDoors " + numDoors);
    }
}
