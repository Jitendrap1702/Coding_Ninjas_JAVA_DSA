package com.company.DSA.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReadWrite {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("input.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            int i;
            while ((i = br.read()) != -1){
                System.out.println(i);
                bw.write(i);
            }

            br.close();
            bw.close();
            fr.close();
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
