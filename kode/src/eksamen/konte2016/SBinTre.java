package eksamen.konte2016;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SBinTre<T> implements Iterable<T>
{
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private Node(T verdi, Node<T> v, Node<T> h) // konstruktør
        {
            this.verdi = verdi;
            venstre = v; høyre = h;
        }
        private Node(T verdi) // konstruktør
        {
            this(verdi, null, null);
        }
    } // class Node
    private Node<T> rot; // peker til rotnoden
    private int antall; // antall noder
    private final Comparator<? super T> comp; // komparator
    public SBinTre(Comparator<? super T> c) // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }

    public Comparator<? super T> comparator()
    {
        return comp; // returnerer treets komparator
    }
    public int antall()
    {
        return antall; // returnerer antall verdier i treet
    }
    public boolean tom()
    {
        return antall == 0; // sjekker om treet er tomt
    }


    public boolean leggInn(T verdi){
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");
        Node<T> p = rot, q = null;
        int cmp = 0;
        while (p != null){
            if(p.verdi == verdi) return false;
            q = p; // q blir forelder til p
            cmp = comp.compare(verdi, p.verdi);
            p = cmp < 0 ? p.venstre : p.høyre;
        }
        p = new Node<>(verdi);

        if (tom()) rot = p;
        else if (cmp < 0) q.venstre = p;
        else q.høyre = p;
        antall++;
        return true; // vellykket innlegging
    }

    public static void main(String[] args) {
        SBinTre<Integer> tre = new SBinTre<>(Comparator.comparingInt(a -> a));
        tre.leggInn(2);
        /*Node<> n = new Node<>(2, null, null);*/
    }
}
