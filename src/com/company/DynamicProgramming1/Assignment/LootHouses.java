package com.company.DynamicProgramming1.Assignment;

import java.util.HashMap;

public class LootHouses {

    // Thief can't loot in consecutive houses
    // 1. Recursive
    public static int maxMoneyLooted(int[] houses, int startIndex) {

        // Base case
        if (startIndex >= houses.length){
            return 0;
        }

        // not include first element
        int maxLoot1 = maxMoneyLooted(houses, startIndex+1);

        // include first element
        int maxLoot2 = houses[startIndex] + maxMoneyLooted(houses, startIndex+2);

        return Math.max(maxLoot1, maxLoot2);
    }

    // 2. Recursive using DP (Memoization)
    public static int maxMoneyLootedMemoization(int[] houses, int startIndex, HashMap<Integer, Integer> memo){

        // Base case
        if (startIndex >= houses.length){
            return 0;
        }

        int maxLoot1 = 0, maxLoot2 = 0;
        // not include first element
        if (!memo.containsKey(startIndex+1)) {
            maxLoot1 = maxMoneyLootedMemoization(houses, startIndex + 1, memo);
            memo.put(startIndex+1, maxLoot1);
        }else {
            maxLoot1 = memo.get(startIndex+1);
        }

        // include first element
        if (!memo.containsKey(startIndex+2)) {
            maxLoot2 = houses[startIndex] + maxMoneyLootedMemoization(houses, startIndex + 2, memo);
            memo.put(startIndex+2, maxLoot2);
        }else {
            maxLoot2 = houses[startIndex] + memo.get(startIndex+2);
        }

        return Math.max(maxLoot1, maxLoot2);
    }

    // 3. Iterative Memoization
    public static int maxMoneyLootedIterative(int[] houses){

        int n = houses.length;
        int[] storage = new int[n];

        if (n == 0){
            return 0;
        }

        storage[0] = houses[0];
        storage[1] = Math.max(houses[0], houses[1]);

        for (int i = 2; i < n; i++){
            storage[i] = Math.max(houses[i]+storage[i-2], storage[i-1]);
        }

        return storage[n-1];
    }

    public static void main(String[] args) {

        int[] houses = {5, 5, 10, 100, 10, 5};
//        int[] houses = {10, 2, 30, 20, 3, 50};
//        int ans = maxMoneyLooted(houses, 0);
//        System.out.println(ans);

//        int ans = maxMoneyLootedMemoization(houses, 0, new HashMap<>());
//        System.out.println(ans);

        int ans = maxMoneyLootedIterative(houses);
        System.out.println(ans);
    }
}
