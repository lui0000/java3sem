package exam.tiket14;

import java.util.Stack;

public class Ticket14 {
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        if (stack1.size() != stack2.size()) {
            return false;
        }

        Stack<Integer> helper = new Stack<>();

        boolean areEqual = true;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            if(!stack1.peek().equals(stack2.peek())) {
                areEqual = false;
                break;
            }
            helper.push(stack1.pop());
            helper.push(stack2.pop());
        }
        while (!helper.isEmpty()) {
            stack2.push(helper.pop());
            stack1.push(helper.pop());
        }
        return areEqual;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(19);
        stack.push(10);
        stack.push(9);

        stack1.push(19);
        stack1.push(10);
        stack1.push(99);
        System.out.println(equals(stack,stack1));

    }
}
