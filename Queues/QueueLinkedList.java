package Queues;

import java.util.LinkedList;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isempty() {
            return head == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isempty()) { // empty queue
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data; // one data in queue
            if (head == tail) {
                tail = null;
            }
            head = head.next; // multiple data
            return front;
        }

        public static int peek() {
            if (isempty()) { // empty queue
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        // 1 2 3
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}