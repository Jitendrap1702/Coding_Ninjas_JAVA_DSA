package com.company.DSA.Stack.Assignment;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {

    public static int countBracketReversals(String input) {

        Stack<Character> stack = new Stack<>();
        // push first char of string to stack
        stack.push(input.charAt(0));

        // now check for rest of the elements
        for (int i = 1; i < input.length(); i++){
            char x = input.charAt(i);
            // if x is '}' ,if top of stack is '{' and stock is not empty then pop top element, else push x to stack
            // else push x to stack
            if (x == '}'){
                if (!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(x);
                }
            }else{
                stack.push(x);
            }
        }

        /*
         now if stack is empty then the input string is already balanced, no need to make changes to it , and return 0
        * else if stack is not empty and size is odd then we can't balance them by reversing brackets, so return -1
        * else stack is not empty and size is even then we can balance by reversing

        * now we will remove element from stack in pairs
        * if both are equal (like both are '{' or both are '}' then we can balance them if we reverse one bracket )
        * if both are not equal ('}{') then we can balance them if we reverse both of them)
         */
        if (stack.isEmpty()){
            return 0;
        }else if (stack.size() % 2 != 0){
            // if stack size is odd then we can't balance them by reversing
            return -1;
        }else{
            int count = 0;
            while (!stack.isEmpty()){
                // pop a pair of element
                char a = stack.pop();
                char b = stack.pop();
                // if both are equal then increase count by 1
                if (a == b){
                    count += 1;
                }
                // both are not equal (like '}{')
                else{
                    count += 2;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int ans = countBracketReversals(input);
        System.out.println(ans);
    }
}
