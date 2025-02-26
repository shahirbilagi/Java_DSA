package BinaryTree;

public class DeleteNodeBST {
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

    public static Node delete(Node root, int delval) {
        if (root.data > delval) {
            root.left = delete(root.left, delval);
        } else if (root.data < delval) {
            root.right = delete(root.right, delval);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String args[]) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        // Adding single single elements to insert function
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

        }
        delete(root, 4);
        System.out.println("Inorder traversal:");
        inorder(root);
       
    }
}