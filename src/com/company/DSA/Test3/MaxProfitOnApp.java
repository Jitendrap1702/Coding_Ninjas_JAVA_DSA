
/* Question

    You have made a smartphone app and want to set its subscription price such that the profit earned is maximised.
    There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
    You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit
    that you can earn.

    Lets say you decide that price of your app is Rs. x and there are N number of subscribers.
    So maximum profit you can earn is :
    m * x

    where m is total number of subscribers whose budget is greater than or equal to x.

    Input format :
    Line 1 : N (No. of subscribers)
    Line 2 : Budget of subscribers (separated by space)

    Output Format :
    Maximum profit

    Constraints :
    1 <= N <= 10^6
    1 <=budget[i]<=9999

    Sample Input 1 :
    4
    30 20 53 14
    Sample Output 1 :
    60

    Sample Output 1 Explanation :
    Price of your app should be Rs. 20 or Rs. 30. For both prices, you can get the profit Rs. 60.

 */

package com.company.DSA.Test3;

import com.company.Fundamentals.Arrays1.ArraySum;

import java.util.Arrays;

public class MaxProfitOnApp {

    public static int maximumProfit(int budget[], int max, int index) {

        if (index > budget.length-1){
            return max;
        }
        int count = 0;
        for (int i = 0; i < budget.length; i++){
            if (budget[index] <= budget[i]){
                count++;
            }
        }
        return maximumProfit(budget, Math.max(count*budget[index], max), index + 1);

    }

    // by sorting
    public static int maximumProfit2(int budget[], int max, int index) {

        if (index > budget.length-1){
            return max;
        }

        return maximumProfit(budget, Math.max((budget.length-index)*budget[index], max), index + 1);

    }


    // by sorting and check iteratively
    public static int maximumProfit3(int budget[]) {

       Arrays.sort(budget);

       int n = budget.length;
       int maxProfit = Integer.MIN_VALUE;
       for (int i = 0; i < n; i++){

           if (maxProfit < budget[i] * (n-i)){
               maxProfit = budget[i] * (n-i);
           }
       }

       return maxProfit;
    }

    public static void main(String[] args) {

        int [] budget = ArraySum.takeInputArray();
        Arrays.sort(budget);
        int maxProfit = maximumProfit(budget, Integer.MIN_VALUE, 0);
        System.out.println(maxProfit);

        int maxProfit2 = maximumProfit3(budget);
        System.out.println(maxProfit2);
    }

}
