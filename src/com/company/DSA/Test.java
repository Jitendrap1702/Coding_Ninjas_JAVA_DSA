package com.company.DSA;

//public class Test
//{
//    static int a = 10;
//    int b = 20;
//    static void fun1()
//    {
//        a = 20;                             //Line 1
////        b = 10;  // can't use non static in static   //Line 2
////        fun2(); // non static func                  //Line 3
////        System.out.print(this.b);           //Line 4
//    }
//    void fun2()
//    {
//        System.out.println("from m2");
//    }
//}
//class MCQ{
//    public static void main(String[] args)
//    {
//        Test.fun1();
//    }
//}


/* private Members
class Vehicle{
    String colour;
    private int number;
}

class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "black";
        v.number = 8486;
        System.out.println(v.number + " " + v.colour);
    }
}

 */


/*
class Vehicle{
    String colour;
    private int number;
    void set(int number)
    {
        this.number=number;
    }
    int get()
    {
        return number;
    }
}

class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}

 */

/*
class Vehicle{
    String colour;
    private int number;
    void set(int number)
    {
        number=number;
    }
    int get()
    {
        return number;
    }
}

class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}

 */

import java.util.Scanner;

class test {

    public static void main(String[] args) {

        char a = '1';
        System.out.println(Integer.valueOf(String.valueOf(a)));
    }

}