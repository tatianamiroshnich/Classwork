package lesson16;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by student on 6/17/2018.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(2, 3, 5, 6));
        queue.offer(new HeavyBox(7, 8, 9, 10));
        queue.offer(new HeavyBox(1, 2, 3, 4));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
