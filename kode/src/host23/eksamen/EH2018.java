package host23.eksamen;

public class EH2018 {
    public static class DoubleLinkedList {
        int size;
        Node start;
        Node end;
        /**
         * Klasse som representerer en node i en dobbelt lenket liste
         * next er neste node,
         * prev er forrige node, og
         * value er verdien til denne noden
         */
        public static class Node {
            Node next;
            Node prev;
            char value;
            /**
             * Konstruktør som lager en ny node
             * @param value Verdien dene noden skal ha
             */
            Node(char value) {
                this.value = value;
            }
        }
        DoubleLinkedList() {
            this.size = 0;
            this.start = null;
            this.end = null;
        }
        /**
         * Funksjon som legger til en verdi på slutten av listen
         */
        void addBack(char value) {
            Node new_node = new Node(value);
            if (this.start == null) {
                this.start = new_node;
            }
            if (this.end == null) {
                this.end = new_node;
            }
            new_node.prev = this.end;
            this.end.next = new_node;
            new_node.next = this.start;
            this.start.prev = new_node;
            this.end = new_node;
            this.size += 1;
        }
        /**
         * Funksjon som fjerner noden på plass index
         * @param index Indexen å fjerne
         */
        void remove(int index) {
            throw new UnsupportedOperationException("Ikke kodet ennå!");
        }
        /**
         * Funksjon som fjerner noden q fra en dobbelt lenket liste
         * @param q Noden som skal fjernes
         */
        void remove(Node q) {
            // Første node
            if (q.prev == null){
                start.next.prev = null;
                start = start.next;
            }

            // Siste node
            if (q.next == null){
                end.prev.next = null;
            }

            Node p = new Node(start.value);
            Node r = new Node(start.next.value);
            while(true){
                if (p.value != q.value){
                    p = p.next;
                    r = r.next;
                }
                else{
                    p = p.prev;
                    p.next = r;
                    r.prev = p;
                }
            }
        }
        /**
         * Funksjon som skriver ut den lenkede listen
         */
        void print() {
            Node current = this.start;
            System.out.print(current.value);
            for (int i=1; i<this.size; ++i) {
                current = current.next;
                System.out.print(", " + current.value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        char values[] = "ABCDEFGHI".toCharArray();
        for (char val : values) {
            list.addBack(val);
        }
        list.print();
        list.remove(2);
        list.remove(4);
        list.remove(0);
        list.print();
        list.remove(6);
        list.print();


    }
}
