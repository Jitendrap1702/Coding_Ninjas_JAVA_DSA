package com.company.DSA.OOPS2.Inheritance;

import com.company.DSA.OOPS2.Inheritance.Car;
import com.company.DSA.OOPS2.Inheritance.Vehicle;

public class VehicleUse {

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Red", 160);
        v.print();

        Car c = new Car(5, "Black", 190);
        c.print();
    }

}
