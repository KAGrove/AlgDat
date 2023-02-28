package host23.eksamen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SBinTre5<T> implements Iterable<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private int forekomster; // antall av denne verdien
        private Node(T verdi) // nodekonstruktør
        {
            this.verdi = verdi;
            venstre = høyre = null;
            forekomster = 1;
        }
    } // class Node
    private Node<T> rot; // peker til rotnoden
    private int antall; // antall verdier i treet
    private int tommeNoder; // antall tomme noder
    private final Comparator<? super T> comp; // komparator
    public SBinTre5(Comparator<? super T> c) // konstruktør
    {
        rot = null;
        antall = tommeNoder = 0;
        comp = c;
    }
    public int antall()
    {
        return antall;
    }
    public boolean tom()
    {
        return antall == 0;
    }
    public int inneholder(T verdi) {
        Node<T> p = rot;
        while (p != null){
            int cmp = comp.compare(verdi, p.verdi);
            if(cmp < 0){
                p = p.venstre;
            }
            else if(cmp > 0){
                p = p.høyre;
            }
            else{
                if(p.forekomster > 0){
                    return p.forekomster;
                }
            }
        }
        return 0;
    }

    public boolean leggInn(T verdi) {
        // Hvis treet er tomt
        if (rot == null) {
            rot = new Node<>(verdi);
            antall++;
            return true;
        }
        Node<T> p = rot, q = null;
        int cmp = 0;
        while (p != null){
            q = p;
            cmp = comp.compare(verdi, p.verdi);
            if(cmp < 0){
                p = p.venstre;
            }
            else if(cmp > 0){
                p = p.høyre;
            }
            else{
                if(p.forekomster > 0){
                    p.forekomster++;
                }
                else{
                    p.verdi = verdi;
                    tommeNoder--;
                }
                antall++;
                return true;
            }
        }
        p = new Node(verdi);
        if (comp.compare(verdi, q.verdi) < 0) {
            q.venstre = p;
        } else {
            q.høyre = p;
        }
        antall++;
        return true;
    }
    public boolean fjern(T verdi)
    {
        Node<T> p = rot; // starter i roten
        while (p != null)
        {
            int cmp = comp.compare(verdi, p.verdi); // sammenligner
            if (cmp < 0) p = p.venstre; // til venstre
            else if (cmp > 0) p = p.høyre; // til høyre
            else break; // verdi ligger i noden
        }
        if (p == null) return false; // verdi ligger ikke i treet
        if (p.forekomster == 0) return false; // en tom node regnes ikke med
        p.forekomster--; // reduserer nodens antall
        if (p.forekomster == 0) tommeNoder++; // en ny tom node
        antall--; // én verdi mindre i treet
        return true; // en forekomst av verdi er fjernet
    }
    public Iterator<T> iterator()
    {
        return new InordenIterator();
    }
    private class InordenIterator implements Iterator<T> // en iteratorklasse
    {
        private Node<T> p; // hjelpevariabel
        // andre aktuelle variabler skal inn her
        // aktuelle hjelpestrukturer skal inn her
        // aktuelle hjelpemetoder skal inn her
        private InordenIterator() // konstruktør
        {
            if(tom()) throw new NoSuchElementException("Treet er tomt!");

            Node<T> p = rot;
            while (p.venstre != null){
                p = p.venstre;
            }
        }
        public boolean hasNext()
        {
            return p != null;
        }
        public T next()
        {
            // kode mangler - skal lages
            throw new UnsupportedOperationException();
        }
    } // InordenIterator

    public static void main(String[] args) {
        int[] a = {8,10,4,7,8,2,5,9,12,6,2,8,10};
        SBinTre5<Integer> tre = new SBinTre5(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
//        System.out.println(tre.iterator().next());
//        for (Iterator<Integer> i = tre.iterator(); i.hasNext(); )
//            System.out.print(i.next() + " ");
        // Utskrift:
        // 2
        // 2 2 4 5 6 7 8 8 8 9 10 10 1
    }
} // SBinTr
