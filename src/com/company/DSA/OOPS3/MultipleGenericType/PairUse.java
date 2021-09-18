package com.company.DSA.OOPS3.MultipleGenericType;

import com.company.DSA.OOPS3.Generics.Pair;

public class PairUse {

    public static void main(String[] args) {

        com.company.DSA.OOPS3.MultipleGenericType.Pair<Integer, String> pI = new com.company.DSA.OOPS3.MultipleGenericType.Pair<>(10, "Jitendra");
        System.out.println(pI.getFirst());
        System.out.println(pI.getSecond());

        com.company.DSA.OOPS3.MultipleGenericType.Pair<String, Double> pS = new com.company.DSA.OOPS3.MultipleGenericType.Pair<>("Jitendra", 9.27);
        System.out.println(pS.getFirst());
        System.out.println(pS.getSecond());
    }
}
