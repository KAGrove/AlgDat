package forelesninger;

import java.util.ArrayDeque;

public class F10_BinaryTree {

    Node root;
    static class Node {

        char value;
        Node leftChild;
        Node rightChild;

        Node(char value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        Node addLeftChild(char value){
            this.leftChild = new Node(value);
            return this.leftChild;
        }

        Node addRightChild(char value){
            this.rightChild = new Node(value);
            return this.rightChild;
        }

    }

    F10_BinaryTree(char[] values){

        this.root = new Node(values[0]);
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);

        int i = 1;
        while (i < values.length){
            Node current = queue.removeFirst();
            current.addLeftChild(values[i]);
            queue.addLast(current.leftChild);
            if (i < values.length - 1){
                current.addRightChild(values[i+1]);
                queue.addLast(current.rightChild);
            }
            i +=2;
            System.out.println(i);
        }
    }

    static void printBreadthFirst(Node root){
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.addLast(root);

        while (!queue.isEmpty()){
            Node current = queue.removeFirst();
            if (current.leftChild != null){
                queue.addLast(current.leftChild);
            }
            if (current.rightChild != null){
                queue.addLast(current.rightChild);
            }
            System.out.print(current.value + " ");
        }
    }

    static void printDepthFirst(Node node, int order){

        if (node == null){
            return;
        }
        if (order == 1) System.out.print(node.value + " ");
        printDepthFirst(node.leftChild, order);
        if (order == 2) System.out.print(node.value + " ");
        printDepthFirst(node.rightChild, order);
        if (order == 3) System.out.print(node.value + " ");

    }

    static void printDepthFirstIterative(Node root){

        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            if (current.rightChild != null){
                stack.push(current.rightChild);
            }
            if (current.leftChild != null){
                stack.push(current.leftChild);
            }
            System.out.print(current.value + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){

        char[] values = "ABCDEFGHIJKLM".toCharArray();
        F10_BinaryTree bt = new F10_BinaryTree(values);

        printBreadthFirst(bt.root);

        char[] values2 = "!GTALDA".toCharArray();
        F10_BinaryTree bt2 = new F10_BinaryTree(values2);

        printBreadthFirst(bt2.root);
        System.out.println();
        printDepthFirst(bt2.root,1);
        System.out.println();
        printDepthFirst(bt2.root,2);
        System.out.println();
        printDepthFirst(bt2.root,3);
        System.out.println();
        printDepthFirstIterative(bt2.root);

    }

}
