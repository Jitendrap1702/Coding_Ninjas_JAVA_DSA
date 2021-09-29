
/* Question

    For a given a string expression containing only round brackets or parentheses, check if they are balanced or not.
    Brackets are said to be balanced if the bracket which opens last, closes first.

    Example:
    Expression: (()())
    Since all the opening brackets have their corresponding closing brackets, we say it is balanced and
    hence the output will be, 'true'.
    You need to return a boolean value indicating whether the expression is balanced or not.

    Sample Input 1 :
    (()()())
    Sample Output 1 :
    true

    Sample Input 2 :
    ()()(()
    Sample Output 2 :
    false

 */

package com.company.DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    // time complexity O(n)
    public static boolean isBalanced(String expression){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++){

            // push the element in the stack
            char x = expression.charAt(i);
            if (x == '(' || x == '[' || x == '{'){
                stack.push(x);
            }

            // if there is not any opening parenthesis then stack will be empty
            if (stack.isEmpty()){
                return false;
            }

            char top;
            switch (x) {
                case ')' : {
                    top = stack.pop();
                    if (top != '(') {
                        return false;
                    }
                    break;
                }
                case ']' : {
                    top = stack.pop();
                    if (top != '[') {
                        return false;
                    }
                    break;
                }
                case '}' : {
                    top = stack.pop();
                    if (top != '{') {
                        return false;
                    }
                    break;
                }
            }
        }

        // if stack is empty then parenthesis will be balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        boolean ans = isBalanced(expression);
        System.out.println(ans);
    }
}
