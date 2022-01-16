package com.company.DSA.Files;

import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("output.txt");
            int i;
            while ((i = fr.read()) != -1){
                System.out.println(i);
            }
            fr.close();
        }catch(Exception e){

        }
    }
}
