package com.company.DSA.OOPS3.BoundedGenerics;

public class Vehicle implements PrintInterface{

    String color;
    int maxSpeed;

    public Vehicle(String color, int maxSpeed){
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Color : " + color + " MaxSpeed : " + maxSpeed );
    }
}
