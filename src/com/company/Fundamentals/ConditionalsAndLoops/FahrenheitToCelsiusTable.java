
/*
    Question :-
    Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
    you need to convert all Fahrenheit values from Start to End at the gap of W,
    into their corresponding Celsius values and print the table.

    Input Format :
    3 integers - S, E and W respectively

    Output Format :
    Fahrenheit to Celsius conversion table.
    One line for every Fahrenheit and corresponding Celsius value.
    On Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

    Example :
    Sample Input 1:
    0
    100
    20

    Sample Output 1:
    0   -17
    20  -6
    40  4
    60  15
    80  26
    100 37
 */


// Solution


package com.company.Fundamentals.ConditionalsAndLoops;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startFahrenheitValue = sc.nextInt();
        int endFahrenheitValue = sc.nextInt();
        int stepSize = sc.nextInt();

        while(startFahrenheitValue <= endFahrenheitValue){

            // convert fahrenheit to celsius
            int celsiusValue = ((startFahrenheitValue - 32) * 5 ) / 9;
            // print
            System.out.println(startFahrenheitValue + "\t" + celsiusValue);
            // increase fahrenheit value by step size
            startFahrenheitValue += stepSize;

        }
    }
}
