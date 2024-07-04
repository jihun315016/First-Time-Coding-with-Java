package ch17.sec01_05;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("World");

        System.out.println(queue.poll()); // Hello
        System.out.println(queue.size()); // 1
    }
}
