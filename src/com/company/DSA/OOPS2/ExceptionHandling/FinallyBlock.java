package com.company.DSA.OOPS2.ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args){

        try{
            int a = 5/0;
        }
        catch(Exception e){
            System.out.print("Exception caught ");
        }
//        catch(ArithmeticException e){ // exception is already handled in previous catch.
//            System.out.print("Arithmetic Exception caught ");
//        }
        finally{
            System.out.print("finally block");
        }
    }
}
