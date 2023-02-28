package host23.eksamen;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class SBinTre3<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private int vAntall; // antall noder i venstre subtre
        private Node(T verdi) // konstruktør
        {
            this.verdi = verdi;
            venstre = høyre = null;
            vAntall = 0;
        }
    } // class Node
    private Node<T> rot;
    private final Comparator<? super T> comp;
    public SBinTre3(Comparator<? super T> c) // konstruktør - lager et tomt tre
    {
        rot = null; // rot er null i et tomt tre
        comp = c; // komparatoren får verdi
    }
    public boolean leggInn(T verdi)
    {
        Node<T> p = rot, q = null;
        int cmp = 0;
        while (p != null)
        {
            q = p;
            cmp = comp.compare(verdi,p.verdi);
            if (cmp < 0)
            {
                p.vAntall++;
                p = p.venstre;
            }
            else p = p.høyre;
        }
        p = new Node<>(verdi);
        if (q == null) rot = p;
        else if (cmp < 0) q.venstre = p;
        else q.høyre = p;
        return true;
    }
    public int antall(){
        int antall = 0;
        Node<T> sisteInorden = rot;
        while(sisteInorden != null){
            antall += sisteInorden.vAntall+1;
            sisteInorden = sisteInorden.høyre;
        }
        return antall;
    }
    public boolean tom()
    {
        return rot == null;
    }
    private static <T> int settvAntall(Node<T> p) {
        if (p == null) return 0;
        return (p.vAntall = settvAntall(p.venstre)) + settvAntall(p.høyre) + 1;
    }
    public void settvAntall() {
        settvAntall(rot); // bruker den rekursive metoden over
    }

    public T preorden(int indeks, Node<T> p, int[] teller) {
        if (p == null) {
            throw new NoSuchElementException("indeksen er utenfor treet");
        }
        if (teller[0] == indeks) {
            return p.verdi;
        }
        teller[0]++;
        T verdi = null;
        if (p.venstre != null) {
            verdi = preorden(indeks, p.venstre, teller);
        }
        if (verdi == null && p.høyre != null) {
            verdi = preorden(indeks, p.høyre, teller);
        }
        return verdi;
    }

    public T preorden(int indeks) {
        int[] teller = {0};
        if (indeks < 0 || indeks >= antall())
            throw new NoSuchElementException("Indeks " + indeks + " er utenfor treet!");
        return preorden(indeks, rot, teller);
    }


    public static void main(String[] args) {
        SBinTre3<Integer> tre = new SBinTre3<>(Comparator.naturalOrder());
        int[] values = {11, 3, 25, 10, 5, 2, 15, 13, 20, 8, 22, 16, 4, 12};
        for (int v : values) {
            tre.leggInn(v);
        }
        int antall = tre.antall();
        System.out.println("Antall noder i treet: " + antall);


        // settvAntall():
        System.out.println("Sett vAntall:");
        // Create a binary tree with some values
        SBinTre3<Integer> tree = new SBinTre3<>(Comparator.naturalOrder());
        int[] values2 = {11, 3, 25, 10, 5, 2, 15, 13, 20, 8, 22, 16, 4, 12};
        for (int v : values2) {
            tree.leggInn(v);
        }

        // Set the vAntall value for each node
        tree.settvAntall(tree.rot);

        // Print the vAntall value for each node
        ArrayDeque<SBinTre3.Node<Integer>> queue = new ArrayDeque<>();
        queue.offer(tree.rot);
        while (!queue.isEmpty()) {
            SBinTre3.Node<Integer> node = queue.poll();
            System.out.println(node.verdi + ": " + node.vAntall);
            if (node.venstre != null) {
                queue.offer(node.venstre);
            }
            if (node.høyre != null) {
                queue.offer(node.høyre);
            }
        }

        // Preorden:
        System.out.println();
        System.out.println("Verdien for indeks " + 0 + " er " + tree.preorden(0));
        System.out.println("Verdien for indeks " + 1 + " er " + tree.preorden(1));
        System.out.println("Verdien for indeks " + 2 + " er " + tree.preorden(2));
        System.out.println("Verdien for indeks " + 3 + " er " + tree.preorden(3));
        System.out.println("Verdien for indeks " + 4 + " er " + tree.preorden(4));
        System.out.println("Verdien for indeks " + 5 + " er " + tree.preorden(5));
        System.out.println("Verdien for indeks " + 6 + " er " + tree.preorden(6));
        System.out.println("Verdien for indeks " + 7 + " er " + tree.preorden(7));
        System.out.println("Verdien for indeks " + 8 + " er " + tree.preorden(8));
        System.out.println("Verdien for indeks " + 9 + " er " + tree.preorden(9));
        System.out.println("Verdien for indeks " + 10 + " er " + tree.preorden(10));
        System.out.println("Verdien for indeks " + 11 + " er " + tree.preorden(11));
        System.out.println("Verdien for indeks " + 12 + " er " + tree.preorden(12));
        System.out.println("Verdien for indeks " + 13 + " er " + tree.preorden(13));
        System.out.println("Verdien for indeks " + 14 + " er " + tree.preorden(14));
    }
} // SBinTre
