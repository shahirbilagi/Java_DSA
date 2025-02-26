package BinaryTree;

public class Tranversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildtree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);
            return newnode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String args[]) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(node);
        System.out.println("PreOrder Traversal:");
        preorder(root);
        System.out.println("\nInorder Traversal:");
        inorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
    }
}