package LinkedList;

class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addlist(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void lastaddlist(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node curnode = head;
        while (curnode.next != null) {
            curnode = curnode.next;

        }
        curnode.next = newnode;
    }

    public void deletefirst() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        // if(head.next!=null)
        head = head.next;
        size--;

    }

    public void deletelast() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }

    public void printlist() {
        if (head == null)
            return;
        Node curnode = head;
        while (curnode != null) {
            System.out.print(curnode.data + "-->");
            curnode = curnode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LL list = new LL();

        list.addlist("1");
        list.addlist("2");
        list.printlist();
        list.addlist("3ADF"); // adding the list in front
        list.printlist();
        list.lastaddlist("4ADL"); // adding the list in last
        list.printlist();
        list.deletefirst();// deleting a list from front
        list.printlist();
        list.deletelast();
        list.printlist();// delete list from last
        System.out.println(list.getSize());
    }
}
