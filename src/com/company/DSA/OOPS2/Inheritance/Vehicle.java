package com.company.DSA.OOPS2.Inheritance;

public class Vehicle {

    public String color;
    protected int maxSpeed;

    public Vehicle(String color, int maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("This is vehicle");
    }

//    public Vehicle(){
//
//    }

    public void print(){
        System.out.println("Vehicle " + "Color " + color + " MaxSpeed " + maxSpeed);
    }
}
