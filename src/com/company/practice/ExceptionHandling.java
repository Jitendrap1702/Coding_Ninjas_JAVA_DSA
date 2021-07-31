package com.company.practice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

               try {
                   int a = sc.nextInt();
                   int b = sc.nextInt();
                   System.out.println(a/b);
               }catch (ArithmeticException | InputMismatchException e){
                   if (e instanceof ArithmeticException) {
                       System.out.println("java.lang.ArithmeticException: / by zero");
                   } else if (e instanceof InputMismatchException){
                       System.out.println("java.util.InputMismatchException");
                   }


               }
          }
}
