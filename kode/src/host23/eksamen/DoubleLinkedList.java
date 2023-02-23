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
    void insert(int index, T value) { }
    /**
     * Remove fjerner verdi på plass index i den dobbelt lenkede listen.
     * Eksempel:
     * System.out.println(list) // utskrift: ["a", "b", "c", "d", "e", "f"]
     * list.remove(4);
     * System.out.println(list) // utskrift: ["a", "b", "c", "d", "f"]
     */
    void remove(int index) { }
}

