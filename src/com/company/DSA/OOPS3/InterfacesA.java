package com.company.DSA.OOPS3;

public interface InterfacesA {
    public void method();
}
class One{
    public void method(){
        System.out.println("Class One method");
    }
}
class Two extends One implements InterfacesA{
    public void method(){
        System.out.println("Class Two method");
    }
}
class Solution extends Two{
    public static void main(String[] args){
        InterfacesA a = new Two();
        a.method();

        One o = new One();
        o.method();
    }
}