package com.company.TypeOfUserInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // 1. Using Scanner class
        System.out.println("Scanner class.....");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        String s = sc.next();
        System.out.println(s);

        // 2. Using BufferedReader class
        System.out.println("Buffered Reader.....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = br.read();
            System.out.println(a);
            String s1 = br.readLine();
            System.out.println(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. From console
        System.out.println("Console.....");
        String s2 = System.console().readLine();
        System.out.println(s2);
    }
}
