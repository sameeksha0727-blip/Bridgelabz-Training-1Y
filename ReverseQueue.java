package Package2.Collections.QueueInterface;

import java.util.*;

public class ReverseQueue {

    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) return;

        T front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));

        reverseQueue(q);
        System.out.println(q);
    }
}
