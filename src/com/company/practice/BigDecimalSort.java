package com.company.practice;
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalSort {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                } else {
                    //convert to big decimal inside comparator
                    //so permanent string values are never changed
                    //aka you only use the BigDecimal values to
                    //compare the strings!
                    BigDecimal a = new BigDecimal(o1);
                    BigDecimal b = new BigDecimal(o2);
                    return a.compareTo(b);
                }
            }
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.print(s[i] + " ");
        }
    }

}
