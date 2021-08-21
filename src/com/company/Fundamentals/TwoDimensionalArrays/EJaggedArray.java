

/*
    Input :
    Enter element at 0th row 0th column :
    1
    Enter element at 0th row 1th column :
    2
    Enter element at 1th row 0th column :
    1
    Enter element at 1th row 1th column :
    2
    Enter element at 1th row 2th column :
    3
    Enter element at 2th row 0th column :
    1
    Enter element at 2th row 1th column :
    2
    Enter element at 2th row 2th column :
    3
    Enter element at 2th row 3th column :
    4
    Enter element at 3th row 0th column :
    1
    Enter element at 3th row 1th column :
    2
    Enter element at 3th row 2th column :
    3
    Enter element at 3th row 3th column :
    4
    Enter element at 3th row 4th column :
    5

    Output :
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

package com.company.Fundamentals.TwoDimensionalArrays;

import java.util.Scanner;

public class EJaggedArray {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        int[][] jaggedArr = new int[4][];
        for (int i = 0; i < jaggedArr.length; i++){
            jaggedArr[i] = new int[i+2]; // initialize each array of 2d jagged array
        }

        for (int i = 0; i < jaggedArr.length; i++){
            for (int j = 0; j < jaggedArr[i].length; j++){
                System.out.println("Enter element at " + i + "th row " + j + "th column : ");
                jaggedArr[i][j] = sc.nextInt();
            }
        }

        return jaggedArr;
    }

    public static void printJaggedArray(int[][] arr2d){

        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[i].length; j++){
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] jaggedArray = takeInput();
        printJaggedArray(jaggedArray);
    }
}
