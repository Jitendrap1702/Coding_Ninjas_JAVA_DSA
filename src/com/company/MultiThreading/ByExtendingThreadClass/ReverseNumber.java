package com.company.MultiThreading.ByExtendingThreadClass;
import java.util.Scanner;

class Reverse extends Thread{

    @Override
    public void run() {

        System.out.println("Thread is running.....");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0){
            int x = num%10;
            System.out.print(x + "");
            num = num/10;
        }
    }
}

class Reverse2 implements Runnable{

    @Override
    public void run() {

        System.out.println("Thread is running.....");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0){
            int x = num%10;
            System.out.print(x + "");
            num = num/10;
        }
    }
}

public class ReverseNumber {

    public static void main(String[] args) {

//        Reverse r = new Reverse();
//        r.start();

        Reverse2 r = new Reverse2();
        r.run();
    }
}
