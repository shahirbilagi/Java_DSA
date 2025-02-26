package Queues;
public class QueuesUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void addfront(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int removefront() {
            if (isEmpty()) {
                System.out.println("No Elements");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
        public static int peek() {
            if (isEmpty()) {
                System.out.println("No Elements");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        Queue q=new Queue(5);
        q.addfront(1);
        q.addfront(2);
        q.addfront(3);
        //1 2 3
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.removefront();
        }

    }
}
