package host23.eksamen;

import java.util.LinkedList;
import java.util.Queue;

public class BSTTraversal {
    static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }
    static void levelOrderTraversal(Node n) {
        Queue<Node> q = new LinkedList<>();
        q.add(n);

        while (!q.isEmpty()) {
            Node p = q.remove();
            if (p == null) {
                continue;
            }
            System.out.println(p.value);
            q.add(p.left);
            q.add(p.right);
        }
    }

    public static void main(String[] args) {
        // Create a binary search tree
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        // Traverse the tree level-wise
        levelOrderTraversal(root);
    }
}
