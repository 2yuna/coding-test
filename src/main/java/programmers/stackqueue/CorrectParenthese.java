package programmers.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CorrectParenthese {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(') {
                stack.push(character);
            }

            if (character == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }

    boolean solution1(String s) {
        if (s.startsWith(")")) {
            return false;
        }

        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }

        while (!queue.isEmpty()) {
            Character character = queue.poll();
            count = (character == '(') ? count + 1 : count - 1;
        }

        return count == 0;
    }

    boolean solution2(String s) {
        if (s.startsWith(")")) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = (s.charAt(i) == '(') ? count + 1 : count - 1;
        }

        return count == 0;
    }
}