package com.company.Codechef.SnackDown2021.Rund1B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class LargestLaddu {

    public static boolean isChefSucceed(ArrayList<Integer> arr){

        if (arr.size() == 1){
            return true;
        }

        ArrayList<Integer> newArr = new ArrayList<>();

        for (int j = 0; j < arr.size() - 1; j += 2) {

            if (Math.abs(arr.get(j) - arr.get(j + 1)) > 1) {
                return false;
            }

            newArr.add(arr.get(j) + arr.get(j + 1));

        }

        return isChefSucceed(newArr);

    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int cases = sc.nextInt();
            for (int i = 0; i < cases; i++) {

                int n = sc.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for (int j = 0; j < Math.pow(2, n); j++) {
                    arr.add(sc.nextInt());
                }


                System.out.println(arr);
//                boolean isSucceed = true;
//                while (isSucceed && arr.size() > 1) {
//
//                    ArrayList<Integer> newArr = new ArrayList<>();
//
//                    for (int j = 0; j < arr.size() - 1; j += 2) {
//
//                        if (Math.abs(arr.get(j) - arr.get(j + 1)) > 1) {
//                            isSucceed = false;
//                            break;
//                        }
//
//                        newArr.add(arr.get(j) + arr.get(j + 1));
//
//                    }
//                    arr = newArr;
//                }

                if (isChefSucceed(arr)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {

        }
    }
}
