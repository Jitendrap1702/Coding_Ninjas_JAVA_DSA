package com.company.DSA.OOPS3.ChainedGenericPairs;

public class PairUse {

    public static void main(String[] args) {

        // chained generic pairs
        Pair<String, Integer> pI = new Pair<>("Patel", 999);
        Pair<Pair<String, Integer>, String> p = new Pair<>(pI, "Jitendra");

        System.out.println(p.getFirst().getFirst());
        System.out.println(p.getFirst().getSecond());
        System.out.println(p.getSecond());
    }
}
