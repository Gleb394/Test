package collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);

        Queue<Integer> integerQueue = new PriorityQueue<>();

        integerQueue.add(100);
        integerQueue.add(300);
        integerQueue.add(700);
        integerQueue.add(200);
        integerQueue.add(400);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
    }
}
