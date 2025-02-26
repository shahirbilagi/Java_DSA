package BinaryTree;

public class CountNodes {
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

    // return root node
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

    // Count the number of nodes
    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnode = Count(root.left);
        int rightnode = Count(root.right);
        return leftnode + rightnode + 1;
    }

    // Sum of the nodes
    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnode = Sum(root.left);
        int rightnode = Sum(root.right);
        return leftnode + rightnode + root.data;
    }

    // Height of the nodes
    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftnode = Height(root.left);
        int rightnode = Height(root.right);
        return Math.max(leftnode, rightnode) + 1;
    }

    public static void main(String args[]) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(node);
        System.out.println("Count of the Nodes are:" + Count(root));
        System.out.println("Sum of the Nodes are:" + Sum(root));
        System.out.println("Height of the Nodes are:" + Height(root));

    }
}