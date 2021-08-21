package com.company.Fundamentals.TwoDimensionalArrays;

import java.util.Scanner;

public class ATakeInputAndPrint {

    public static int[][] takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Enter element at " + i + "th row " + j + "th column : ");
                arr2d[i][j] = sc.nextInt();
            }
        }
        return arr2d;
    }

    public static void print2dArray(int[][] arr2d){

        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[0].length; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print2dArrayColumnWise(int[][] arr2d){

        for (int i = 0; i < arr2d[0].length; i++){
            for (int j = 0; j < arr2d.length; j++){
                System.out.print(arr2d[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr2d = takeInput();
        System.out.println("Array printing row wise : ");
        print2dArray(arr2d);
        System.out.println("Array printing column wise : ");
        print2dArrayColumnWise(arr2d);
    }
}
