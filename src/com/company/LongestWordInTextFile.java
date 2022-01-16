package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordInTextFile {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        String longestWord = "", current;

        while (sc.hasNext()){
            current = sc.next();
            if (current.length() > longestWord.length()){
                longestWord = current;
            }
        }
        System.out.println(longestWord);
    }
}
