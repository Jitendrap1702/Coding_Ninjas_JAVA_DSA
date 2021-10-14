package com.company.Codechef.OctoberLongChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LongestAndSubArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){

            int input = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int j = 1;
            int prev = 1, count = 0;
            while (j <= input){
                if ((prev & j) > 0){
                    count++;
                }
                else{
                    prev = j;
                    arr.add(count);
                    count = 1;
                }
                j++;
            }
            arr.add(count);

            System.out.println(Collections.max(arr));
        }
    }
}
