package com.company.DSA.OOPS3.Generics;

public class PairUse {

    public static void main(String[] args) {

        Pair<Integer> pI = new Pair<>(10, 20);
        System.out.println(pI.getFirst());
        System.out.println(pI.getSecond());

        Pair<String> pS = new Pair<>("Jitendra", "Patel");
        System.out.println(pS.getFirst());
        System.out.println(pS.getSecond());
    }
}
