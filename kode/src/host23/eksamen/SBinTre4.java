package host23.eksamen;

import java.util.Comparator;

public class SBinTre4<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private int høyde; // nodens høyde
        private Node(T verdi) // nodekonstruktør
        {
            this.verdi = verdi;
            venstre = null;
            høyre = null;
            høyde = 0;
        }
    } // slutt på class Node
    private Node<T> rot; // peker til rotnoden
    private int antall; // antall noder
    private final Comparator<? super T> comp; // komparator
    public SBinTre4(Comparator<? super T> c) // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }
    public int antall() { return antall; }
    public boolean tom() { return antall == 0; }
    public int høyde() { return tom() ? -1 : rot.høyde; }
//    public boolean leggInn(T verdi)
//    {
//        // kode mangler - skal kodes
//    }
    public T nestMinst() {
        if(antall < 2){
            throw new IllegalStateException("Treet er for lite");
        }

        Node<T> p = rot;        // Første inorden
        Node<T> q = rot;        // Andre inorden
        while (p.venstre != null){
            p = p.venstre;
        }

        // Tilfelle 1
        if(p.høyre == null){
            while(q.venstre != p){
                q = q.venstre;
            }
        }

        // Tilfelle 2
        else{
            q = p.høyre;
            while (q.venstre != null){
                q = q.venstre;
            }
        }
        return q.verdi;
    }
//    public T avstand(T verdi, int d)
//    {
//        // kode mangler - skal kodes
//    }
} // slutt på class SBinTr
