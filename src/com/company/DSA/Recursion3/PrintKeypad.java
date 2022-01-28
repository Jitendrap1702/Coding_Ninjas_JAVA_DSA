package com.company.DSA.Recursion3;

// Reduced space complexity
public class PrintKeypad {

    static String getOptions(int digit){

        if (digit == 2){
            return "abc";
        }
        if (digit == 3){
            return "def";
        }
        if (digit == 4){
            return "ghi";
        }
        if (digit == 5){
            return "jkl";
        }
        if (digit == 6){
            return "mno";
        }
        if (digit == 7){
            return "pqrs";
        }
        if (digit == 8){
            return "tuv";
        }
        if (digit == 9){
            return "wxyz";
        }
        return ""; // in case of 0 and 1
    }

    public static void printKeypad(int input, String stringSoFar){

        if (input == 0){
            System.out.println(stringSoFar);
            return;
        }
        int lastDigit = input%10;
        String lastDigitOptions = getOptions(lastDigit);
        // call for no of options time
        for (int i = 0; i < lastDigitOptions.length(); i++){
            printKeypad(input/10, lastDigitOptions.charAt(i) + stringSoFar);
        }
    }

    public static void main(String[] args) {

        int input = 23;
        printKeypad(input, "");
    }
}
