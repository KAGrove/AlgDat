package host23.eksamen;

import hjelpeklasser.Stakk;
import hjelpeklasser.TabellStakk;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SBinTre2<T> implements Iterable<T>
{
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
    public SBinTre2(Comparator<? super T> c) // konstruktør
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

    public boolean leggInn(T verdi)
    {
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");
        Node<T> p = rot, q = null;
        int cmp = 0;
        while (p != null)
        {
            q = p; // q blir forelder til p
            cmp = comp.compare(verdi, p.verdi);
            if(cmp < 0) p = p.venstre;
            else if(cmp > 0) p = p.høyre;
            else return false; // verdi finnes fra før
        }
        p = new Node<>(verdi);
        if (tom()) rot = p;
        else if (cmp < 0) q.venstre = p;
        else q.høyre = p;
        antall++;
        return true; // vellykket innlegging
    }

    public int dybde(T verdi, Node<T> p) {
        int dybde = 0;

        while (p != null){
            int cmp = comp.compare(verdi, p.verdi);

            if(cmp < 0) p = p.venstre;
            else if(cmp > 0) p = p.høyre;
            else return dybde;
        }
        return -1;
    }

    public int dybde(T verdi){
        return dybde(verdi, rot);
    }

    public int avstand(T verdi1, T verdi2) {
        Node<T> f = rot;

        while (f != null){
            int cmp1 = comp.compare(verdi1, f.verdi);
            int cmp2 = comp.compare(verdi2, f.verdi);
            if(cmp1 < 0 && cmp2 < 0){
                f = f.venstre;
            }
            else if(cmp1 > 0 && cmp2 > 0){
                f = f.høyre;
            }
            else break;
        }
        int dybde1 = dybde(verdi1,f);
        int dybde2 = dybde(verdi2,f);
        if (dybde1 == -1 || dybde2 == -1){
            throw new NoSuchElementException("Et av tallene er ikke i treet");
        }

        return dybde1+dybde2;
    }

    // Løsningen
    private static <T> int høyde(Node<T> p, int[] d) {
        if (p == null) return -1;
        int vHøyde = høyde(p.venstre, d); // høyden til venstre subtre
        int hHøyde = høyde(p.høyre, d); // høyden til høyre subtre
        if (vHøyde + hHøyde > d[0]) d[0] = vHøyde + hHøyde; // oppdaterer
        return Math.max(vHøyde, hHøyde) + 1; // returnerer høyden
    }
    public int diameter() {
        if (antall < 2) return antall - 1; // tomt eller kun en node
        int[] d = {-1};
        høyde(rot, d); // traverserer
        return d[0] + 2; // returnerer diameter
    }

    private class InordenIterator implements Iterator<T>
    {
        private Stakk<Node<T>> stakk = new TabellStakk<>();
        private Node<T> p = null;
        private Node<T> først(Node<T> q)
        {
            while (q.venstre != null)
            {
                stakk.leggInn(q);
                q = q.venstre;
            }
            return q;
        }
        private InordenIterator()
        {
            if (!tom()) p = først(rot);
        }
        public boolean hasNext()
        {
            return p != null;
        }
        public T next()
        {
            if (!hasNext()) throw new NoSuchElementException();
            T verdi = p.verdi;
            if (p.høyre != null) p = først(p.høyre);
            else if (!stakk.tom()) p = stakk.taUt();
            else p = null;
            return verdi;
        }
    } // InordenIterator
    public Iterator<T> iterator()
    {
        return new InordenIterator();
    }


    public static void main(String[] args) {
        SBinTre2<Integer> tre = new SBinTre2<>(Comparator.naturalOrder());
        tre.leggInn(4);
        tre.leggInn(2);
        tre.leggInn(6);
        tre.leggInn(1);

        int diameter = tre.diameter();
        System.out.println("Diameter of the tree is: " + diameter);
    }



} // class SBinTr