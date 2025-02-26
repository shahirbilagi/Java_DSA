package BinaryTree;

public class BT {
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
        static int idx=-1;
        public static Node buildtree(int node[]) {
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newnode=new Node(node[idx]);
            newnode.left=buildtree(node);
            newnode.right=buildtree(node);
            return newnode;
        }
    }

    public static void main(String args[]) {
        int node[] = { 1, 2, 4, -1,-1,  5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(node);
        System.out.println(root.data);
    }
}
