package BinaryTree;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    //Inserting into Binary Search tree
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
    //Inorder traversal for verify
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        //Adding single single elements to insert function
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

        }
        System.out.println("Inorder traversal:");
        inorder(root);
    }
}