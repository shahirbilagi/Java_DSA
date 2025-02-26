package BinaryTree;

public class SearchNodeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Inserting into Binary Search tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal for verify
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);

        }
        if (root.data < key) {
            return search(root.right, key);
        }
        return false;

    }

    public static void main(String args[]) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        // Adding single single elements to insert function
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

        }
        System.out.println("Inorder traversal:");
        inorder(root);
        if (search(root, 7)) {
            System.out.println("\nKey Found");
        } else
            System.out.println("\nKey Not Found");
    }
}
