package com.company.MultiThreading.ByExtendingThreadClass;

class OddThread extends Thread{

    @Override
    public void run() {

        System.out.println("Odd Thread Running.....");
        for (int i = 1; i <= 50; i++){
            if (i%2 == 1){
                System.out.print(i + " ");
            }
        }
    }
}

class EvenThread extends Thread{

    @Override
    public void run() {

        System.out.println("Even Thread Running.....");
        for (int i = 1; i <= 50; i++){
            if (i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

public class OddEvenNumber {

    public static void main(String[] args) {

        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        et.start();
        ot.start();
    }
}
