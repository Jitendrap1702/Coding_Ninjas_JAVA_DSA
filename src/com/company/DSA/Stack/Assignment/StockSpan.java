
/* Question

    Afzal has been working with an organization called 'Money Traders' for the past few years.
    The organization is into the money trading business. His manager assigned him a task.
    For a given array/list of stock's prices for N days, find the stock's span for each day.

    The span of the stock's price today is defined as the maximum number of consecutive days(starting from today
    and going backwards) for which the price of the stock was less than today's price.

    For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85],
    then the stock spans will be [1, 1, 1, 2, 1, 4, 6].

    Explanation:
    On the sixth day when the price of the stock was 75, the span came out to be 4,
    because the last 4 prices(including the current price of 75) were less than the current or the sixth day's price.

    Similarly, we can deduce the remaining results.
    Afzal has to return an array/list of spans corresponding to each day's stock's price.
    Help him to achieve the task.

    Sample Input :
    8
    60 70 80 100 90 75 80 120

    Sample Output :
    1 2 3 4 1 1 2 8

 */

package com.company.DSA.Stack.Assignment;

import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int[] price) {

        // array for output span
        int[] output = new int[price.length];

        // create a stack
        Stack<Integer> stack = new Stack<>();

        // put first element index in stack
        stack.push(0);

        // span of first element will always be 1
        output[0] = 1;

        // calculate span values for rest of the elements
        for (int i = 1; i < price.length; i++){

            // pop elements from stack while stack is not empty and price[i] is greater than top of stack
            while (!stack.empty() && price[i] > price[stack.peek()]){
                stack.pop();
            }

            // if stack is empty than price[i] is greater than all the elements on left of it , so it will be i + 1
            // else price[i] is greater than elements after top of stack , so it will be (i - stack.peek())
            output[i] = stack.empty() ? (i+1) : (i-stack.peek());

            // push this i in stack
            stack.push(i);
        }

        return output;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 8, 5};

        int[] output = stockSpan(arr);
        for (int i : output){
            System.out.print(i + " ");
        }
    }
}
