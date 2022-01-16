package com.company.ExceptionHandling;


import java.util.Scanner;

class TooSmallExceptionR extends Exception{

    @Override
    public String toString() {
        return "age to small for casting vote";
    }
}

public class CanVote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new TooSmallException();
            } else {
                System.out.println("age greater than 18");
            }
        }catch(TooSmallException e){
            System.out.println(e.toString());
        }
    }
}
