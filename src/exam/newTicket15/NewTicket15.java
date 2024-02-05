package exam.newTicket15;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NewTicket15 {
    public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                stack1.push(queue.poll());
            } else {
                stack2.push(queue.poll());
            }
        }

        Stack<Integer> stack3 = new Stack<>();
        while (!stack2.isEmpty()) {
            stack3.push(stack2.pop());
        }

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                queue.offer(stack1.pop());
            } else {
                queue.offer(stack3.pop());
            }
        }
    }



        public static void main (String[]args){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);

            System.out.println("Исходная очередь: " + queue);

            reverseHalf(queue);

            System.out.println("Очередь после reverseHalf: " + queue);
        }
    }




