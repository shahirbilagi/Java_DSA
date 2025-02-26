package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class QueueUsingCollection {
    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<Integer>();
        //Queue<Integer> q = new ArrayDeque<Integer>();
        // Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        // 1 2 3
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}