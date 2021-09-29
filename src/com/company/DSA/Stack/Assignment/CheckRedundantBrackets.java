
/* Question

    For a given expression in the form of a string, find if there exist any redundant brackets or not.
    It is given that the expression contains only rounded brackets or parenthesis and the input expression will
    always be balanced.
    A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless
    brackets.

    Example:
    Expression: (a+b)+c
    Since there are no needless brackets, hence, the output must be 'false'.

    Expression: ((a+b))
    The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.

    Sample Input 1:
    a+(b)+c
    Sample Output 1:
    true

    Explanation:
    The expression can be reduced to a+b+c. Hence, the brackets are redundant.

    Sample Input 2:
    (a+b)
    Sample Output 2:
    false

 */

package com.company.DSA.Stack.Assignment;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {

    // Worst time complexity : O(n**2)
    public static boolean checkRedundantBrackets(String expression) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++){

            if (expression.charAt(i) != ')'){
                stack.push(expression.charAt(i));
            }else{
                int count = 0;
                while (stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                if (count > 1){
                    stack.pop(); // pop '('
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        boolean isRedundant = checkRedundantBrackets(expression);
        System.out.println(isRedundant);
    }
}
