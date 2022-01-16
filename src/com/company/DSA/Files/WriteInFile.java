package com.company.DSA.Files;

import java.io.FileWriter;

public class WriteInFile {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("output.txt");
            for (int i = 0; i < 100; i++) {
                fw.write(i);
            }
            fw.close();
        }catch (Exception e){

        }
    }
}
