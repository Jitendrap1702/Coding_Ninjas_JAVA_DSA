package com.company.Codechef.CodechefStarters27;

import java.util.HashMap;
import java.util.Scanner;

public class BinaryString {

    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++){
                int n = sc.nextInt();
                String s = sc.next();
                HashMap<String, Integer> map = new HashMap<>();
                for (int j = 0; j < n; j++){
                    String key = "";
                    if (j == 0){
                        key = s.substring(1);
                    }else if (j == n-1){
                        key = s.substring(0, n-1);
                    }else {
                        key = s.substring(0, j) + s.substring(j + 1);
                    }

                    if(map.containsKey(key)){
                        map.put(key, map.get(key)+1);
                    }else {
                        map.put(key, 1);
                    }
                }
                System.out.println(map.size());
            }
        }catch (Exception e){}
    }
}
