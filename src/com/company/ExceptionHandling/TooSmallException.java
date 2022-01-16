package com.company.ExceptionHandling;


public class TooSmallException extends Exception{

    @Override
    public String toString() {
        return "age to small for casting vote";
    }

    public static void main(String[] args) throws TooSmallException{

        int age = 16;

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
