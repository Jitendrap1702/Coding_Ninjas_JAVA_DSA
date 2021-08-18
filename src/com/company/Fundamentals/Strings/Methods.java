package com.company.Fundamentals.Strings;

public class Methods {

    public static void main(String[] args) {

        // char array
        char[] ch = {'c', 'o', 'd', 'i', 'n', 'g'};
        // String
        String str = "coding";

        // Generally we use String to store the sequence of character not array
        // Because String has many inbuilt function which make things easy to do

        // length of string
        System.out.println(str.length()); // 6

        // we can use indexing in string as array
        System.out.println(str.charAt(2)); // d
       //  System.out.println(str[1]); this is not allowed in java

        String str1 = "Coding";
        String str2 = "Coding";
        String str3 = "And";
        String str4 = " is fun";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // false
        System.out.println(str1.compareTo(str3)); // 2 cause it compares ASCII value of 'A' and 'C'
        System.out.println(str1.concat(str4)); // Coding is fun

        System.out.println(str1.substring(2)); // ding
        System.out.println(str1.substring(5)); // g
        System.out.println(str1.substring(6)); //
        System.out.println(str1.substring(1, 4)); // odi

        String strA = "abc";
        String strB = "abc";
        String strC = new String("abc");
        System.out.println(strA == strB); // true because reference of strA and strB is same in heap memory
        System.out.println(strA == strC); // false because reference of strA and strC is different in heap memory
        System.out.println(strA.equals(strB)); // true because value of strA and strB is equal
        System.out.println(strA.equals(strC)); // true because value of strA and strC is equal

        String strX="abc";
        String strY=str1+" ";
        String strZ = str1 + "";
        String strX1 = str1;
        String strX2 = "abc";
        System.out.println(strX == strY); // false
        System.out.println(strX == strZ); // false
        System.out.println(strX == strX1); // false
        System.out.println(strX == strX2); // true
    }
}
