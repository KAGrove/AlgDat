package eksamen.host2021;

import java.util.Objects;

public class DoubleLinkedList<T> {
    static class Node<T> {
        T value;
        Node next;
        Node prev;
        int size;

        Node(T value) {
            this.value = value;
            this.next = null;
            this.prev = null;
            this.size = 0;
        }

        Node(T value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
            this.size = 0;
        }
    }

    public DoubleLinkedList() {
        head = tail = null;
        size = 0;

    }

    public DoubleLinkedList(T[] a) {
        new DoubleLinkedList<T>(); //oppretter et objekt med  standardkonstruktøren
        Objects.requireNonNull(a,"Tabellen a er null!"); //sjekker om tabellen er null
        this.head = new Node<>(null); //oppretter først hale/head som utgangspunkt for å bygge videre
        this.tail = head;

        for(int i=0;i<a.length;i++) { //fylle på en node så lenge verdien i arrayet ikke er null, hopper over null-verdier
            if (a[i] != null) {
                tail.next = new Node<>(a[i], tail, null);
                tail = tail.next;
                size++;
            }
        }
        if(size == 0){ //hvis antallet noder fortsatt er 0, må head = tail, som er null
            head = tail;
        } else{
            head = head.next; //hvis det er bygget på noder må vi sørge for at head ikke lengre er null-verdien
            head.prev = null; //hode.forrige = null;
        }
    }

    Node head; //Peker til første node i den lenkede listen
    Node tail; //Peker til siste node i den lenkede listen
    int size;

    public String toString() { //oppgave 2
        //i hjelpemetoden er antall definert som antall noder i listen.
        //hvis listen er tom, returnerer en tom liste.
        if (size == 0) {
            return "[]";
        } else {
            //bruker stringBuilder får å bygge strengen som skal returneres
            StringBuilder s = new StringBuilder();
            s.append("[");
            //starter å append verdier i listen fra starten (hode) mot sluten for alle nodene som inneholder verdier
            for (Node<T> n = head; n != null; n = n.next) {
                s.append(n.value);
                //så langt listen inneholder verdier, verdiene skal append til strengen.
                if (n.next != null) {
                    s.append(", ");
                }
            }
            s.append(']');
            return s.toString();
        }
    }

    void add_first(T value) {
        Node<T> n = new Node<>(value);
        n.next = head;
        if (head != null){
            head.prev = n;
        }
        head = n;}
    void add_last(T value) {
        Node<T> n = new Node<>(value, tail, null);
        tail.next = n;
        n.prev= tail;
        tail = n;

    }

    void insert(int index, T value) {
        //Empty list handling
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty!");
        }

        if(index == 0){
            add_first(value);
        }

        else if(value == tail.value){
            add_last(value);
        }

        else{
            Node<T> p = new Node<>(value);
            Node<T> r = head, q = head.next;
            int i = 0;
            while (true){
                if(i < index-1){
                    r = r.next;
                    q = q.next;
                    i++;
                }
                else{
                    p.next = q;
                    p.prev = r;
                    r.next = p;
                    q.prev = p;
                    return;
                }
            }
        }
    }

    void remove(int index) {
        //Empty list handling
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty!");
        }

        if(index == 0){
            head = head.next;
            head.prev = null;
        }

        else{
            Node<T> r = head, q = head.next.next;
            int i = 0;
            while (true){
                if (q.next == null){        // Når vi kommer til nest-siste
                    if (i+1 == index){      // Nest-siste
                        r.next = q;
                        q.prev = r;
                    }
                    else if (i+2 == index){ // Siste
                        r.next.next = null;
                        q.prev = null;
                        return;
                    }
                    else{
                        throw new IndexOutOfBoundsException(index);
                    }

                }
                if(i < index-1){        // Flytter på nodene
                    r = r.next;
                    q = q.next;
                    i++;
                }
                else{
                    r.next = q;         // Fjerner noden mellom r og q
                    q.prev = r;
                    return;
                }
            }
        }
    }


    public static void main(String[] args) {
        DoubleLinkedList a = new DoubleLinkedList<>(new Integer[] {1,3,5});
        a.add_first(4);
        a.add_first(6);
        a.add_first(8);
        a.add_last(10);
        a.insert(2, 13);
        System.out.println(a);
        a.remove(5);
        System.out.println(a);


    }

}