package com.company.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // this is how we can declare a list of ArrayList [1 2 3 4
//                                                         4 3 2 1]
        ArrayList[] arrayLists = new ArrayList[n];

        for ( int i = 0; i < n; i++){

            arrayLists[i] = new ArrayList();
            int d = sc.nextInt();

            for (int j = 0; j < d; j++){
                arrayLists[i].add(sc.nextInt());
            }
        }

        //Queries
        int q = sc.nextInt();
        for (int k = 0; k < q; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(arrayLists[x-1].get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}

//Test case

//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//74
//3 4
//52
//3 1
//37
//4 3
//ERROR!
//5 5
//ERROR!
//
//Process finished with exit code 0
