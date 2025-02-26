package Queues;

public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void addfront(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int removefront() {
            if (isEmpty()) {
                System.out.println("No Elements");
                return -1;
            }
            int result = arr[front];
            // Single element condition
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("No Elements");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.addfront(1);
        q.addfront(2);
        q.addfront(3);
        q.addfront(4);
        q.addfront(5);
        System.out.println(q.removefront());
        q.addfront(6);
        System.out.println(q.removefront());
        q.addfront(7);
        // 1 2 3
        /*while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.removefront();
        }*/

    }
}
