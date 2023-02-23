package host23.eksamen;

public class DoubleLinkedList<T> {
    static class Node<T> {
        T value;
        Node next;
        Node prev;
        Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
        Node(T value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head; //Peker til første node i den lenkede listen
    Node tail; //Peker til siste node i den lenkede listen
    public String toString() { }
    void add_first(T value) { }
    void add_last(T value) { }
    /**
     * Insert legger til en ny verdi på plass index i den dobbelt lenkede listen.
     * Eksempel:
     * System.out.println(list); // utskrift: ["a", "b", "c", "d", "e", "f"]
     * list.insert(4, "g");
     * System.out.println(list); // utskrift: ["a", "b", "c", "d", "g", "e", "f"]
     */
    void insert(int index, T value) {
        if(index == 0){
            Node node = new Node(value);
            node.next = head;
            head.prev = node;
            head = head.prev;
        }
        if(tail.value.equals(index)){
            Node node = new Node(value);
            tail.next = node;
            node.prev = tail;
            tail = tail.next;
        }
        else{
            Node p = head;
            Node q = new Node(value);
            Node r = p.next.next;
            for(int i = 0; i < index-1; i++){
                p = p.next;
            }
            p.next = q;
            q.prev = p;
            r.prev = q;
            q.next = r;
        }
    /**
     * Remove fjerner verdi på plass index i den dobbelt lenkede listen.
     * Eksempel:
     * System.out.println(list) // utskrift: ["a", "b", "c", "d", "e", "f"]
     * list.remove(4);
     * System.out.println(list) // utskrift: ["a", "b", "c", "d", "f"]
     */
    void remove(int index) { }
}

