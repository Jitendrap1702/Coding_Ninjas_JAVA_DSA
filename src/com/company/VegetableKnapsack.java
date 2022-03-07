package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Vegetables{

    String name;
    int weight;
    int price;

    public Vegetables(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public Vegetables(){}

    public int getPrice(){
        return this.price;
    }
}

public class VegetableKnapsack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Vegetables> vegList = new ArrayList<>();
        int n = sc.nextInt();
        while (n != 0){
            String name = sc.nextLine();
            int weight = sc.nextInt();
            int price = sc.nextInt();
            n--;
            Vegetables v = new Vegetables(name, weight, price);
            vegList.add(v);
        }

        Collections.sort(vegList, new Comparator<Vegetables>() {
            @Override
            public int compare(Vegetables o1, Vegetables o2) {
                return o1.price - o2.price;
            }
        });
//        Comparator<Vegetables> comparator = Comparator.comparing(v -> v.price);
//        vegList.sort(comparator);


    }
}
