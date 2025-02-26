package LinkedList;

import java.util.LinkedList;
import java.util.*;

public class ReverseList {

    Node head;
    private int size;

    ReverseList() {
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

    public void reverse() {
        if (head == null || head.next == null)
            return;
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            // update
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseStack(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseStack(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        ReverseList list = new ReverseList();

        list.addlist("1");
        list.addlist("2");
        list.addlist("3ADF"); // adding the list in front
        list.lastaddlist("4ADL"); // adding the list in last
        list.printlist();
        list.head = list.reverseStack(list.head);// reverse list by stack method
        list.printlist();

    }

}