package com.company.ExceptionHandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws DivideByZeroException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Handle exception using try/catch
        try {
            int x = a / b;
            System.out.println(x);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
        }
        finally {
            System.out.println("Done");
        }

        // Throw exception
        if (b == 0){
            throw new DivideByZeroException();
        }else{
            System.out.println();
        }
    }
}

