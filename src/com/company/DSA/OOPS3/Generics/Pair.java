package com.company.DSA.OOPS3.Generics;

public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }
}
