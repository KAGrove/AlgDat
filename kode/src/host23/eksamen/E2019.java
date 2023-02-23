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
            }
            else {
                if ((size / 2) > index) {
                    Node q = head;
                    for (int i = 0; i < index; i++) {
                        q = q.next;
                    }
                } else {
                    Node q = tail;
                    for (int i = size - 1; i > index i--){
                        q = q.prev;
                    }
                }
            }
            Node p = q.prev;
            Node r = q.next;

            p.next = r;
            r.prev = p;

            size--;
        }
        void remove(char value) {
            Node q = head;
            while(true){
                if(q.value != value){
                    q = q.next;
                }
                else{
                    break;
                }
            }
            Node p = q.prev;
            Node r = q.next;

            p.next = r;
            r.prev = p;

            size--;
        }
    }
}



*/
