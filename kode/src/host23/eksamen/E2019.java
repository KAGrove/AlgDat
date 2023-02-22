/*
package host23.eksamen;

public class E2019 {
    public static class DoubleLinkedList {
        public class Node {
            Node next;
            Node prev;
            char value;
        }
        Node head;
        Node tail;

        void addLast(char value) {...}
        void addFirst(char value) {...}
        char removeLast() {...}
        char removeFirst() {...}
        void print() {...}

        void remove(int index) {
            if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Node q = new Node(head.value);
                for (int i = 0; i < index; i++) {
                    q = q.next;
                }
                Node p = new Node(q.prev);
                Node r = new Node(q.next);

                p.next = r;
                r.prev = q;

                size--;
            }
        }
        void remove(char value) {
            Node q = new Node(head.value);
            while (q.next != null){
                if (q.value != value){
                    q = q.next;
                }
                else{
                    Node p = new Node(q.prev);
                    Node r = new Node(q.next);

                    p.next = r;
                    r.prev = q;

                    size--;
                }
        }
    }
}



*/
