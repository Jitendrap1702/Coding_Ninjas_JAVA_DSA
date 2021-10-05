package com.company.practice;

import com.company.DSA.OOPS3.ChainedGenericPairs.Pair;

import java.util.Scanner;

public class MinMaxUsingDAndC {

    public static void minMax(int[] arr, int start, int end, int min, int max){

        int n = arr.length;
        if (start == end){
            if (min > arr[start]){
                min = arr[start];
            }
            if (max < arr[start]){
                max = arr[start];
            }
            return;
        }
        if (end - start == 1){
            if (arr[end] > arr[start]){
                if (min > arr[start]){
                    min = arr[start];
                }
                if (max < arr[end]){
                    max = arr[end];
                }
            }else{
                if (min > arr[end]){
                    min = arr[end];
                }
                if (max < arr[start]){
                    max = arr[start];
                }
            }
            return ;
        }
        int mid = (start + end)/2;
        minMax(arr, start, mid, min, max);
        minMax(arr, mid+1, end, min, max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[n-1];
        minMax(arr, 0, arr.length-1, min, max);
        System.out.println(min + " " + max);

//        int[] arr = {14,7,9,18,23,6,21};
//        int s = 0;
//        int e = arr.length - 1;
//        Pair<Integer,Integer> res = solve(arr,s,e);
//        System.out.println("Max:" +res.getFirst() + " Min:" + res.getSecond());
    }


    private static Pair<Integer,Integer> solve(int[] arr, int s, int e){

        if (s == e){
            return new Pair<>(arr[s], arr[e]);
        }
        else if(s+1 == e){
            return new Pair<>(Math.max(arr[s], arr[e]),Math.min(arr[s], arr[e]));
        }

        int mid = (s + e)/2;

        Pair<Integer , Integer> p1 = solve(arr,s,mid);
        Pair<Integer , Integer> p2 = solve(arr,mid+1,e);

        return new Pair<>(Math.max(p1.getFirst(), p2.getFirst()), Math.min(p1.getSecond(), p2.getSecond()));
    }
}
