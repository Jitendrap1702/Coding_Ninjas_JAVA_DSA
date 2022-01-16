package com.company.Codechef.JanuaryLongChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndRiffles {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for (int j = 1; j <= n; j++) {
                    arr.add(j);
                }

                int noOfShuffle = (k)%(n-2);
                ArrayList<Integer> arr1 = null;
                for (int j = 0; j < noOfShuffle; j++) {
                    // create new arraylist
                    arr1 = new ArrayList<>();
                    for (int a = 0; a < n; a++) {
                        arr1.add(0);
                    }
                    int x = 0;
                    for (int p = 0; p < n; p += 2) {
                        arr1.set(x, arr.get(p));
                        x++;
                    }
                    for (int q = 1; q < n; q += 2) {
                        arr1.set(x, arr.get(q));
                        x++;
                    }
                    arr = arr1;
                }

                for (int j = 0; j < n; j++) {
                    System.out.print(arr1.get(j) + " ");
                }

                System.out.println();
            }
        }catch(Exception e){

        }
    }
}
