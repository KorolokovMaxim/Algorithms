package search.stack;

import java.util.Stack;


/**
 * Задача , сбалансированаая скобочная последовательность
 * Определить , являяется ли , последовательность скобок симметрично закрытой - true
 * Или же собки закрыты не семетрично - false
 */

public class StackExample {

    public boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        char[] charsString = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (isOpen(charsString[i])) {
                stack.push(charsString[i]);
            } else {
                if (!stack.empty() && isPair(stack.lastElement(), charsString[i])) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private static boolean isPair(char open, char close) {
        return open == '{' && close == '}'
                || open == '(' && close == ')'
                || open == '[' && close == ']';
    }

    private static boolean isOpen(char c) {
        return c == '{' || c == '(' || c == '[';
    }

}
