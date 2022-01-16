package com.company.practice;

public class Demo {

    public static void main(String[] args) {

        int result = 0;
        Demo oc = new Demo();
        Object o = oc;
        if (o == oc){
            result = 1;
        }
        if (o != oc){
            result = result + 10;
        }
        if (o.equals(oc)){
            result += 100;
        }
        if (oc.equals(o)){
            result += 1000;
        }

        System.out.println(result);
    }
}
