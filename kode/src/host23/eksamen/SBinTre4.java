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

    public boolean leggInn(T verdi) {
        Node<T> p = rot, q = null;
        int cmp = 0;

        while(p != null){
            q = p;
            cmp = comp.compare(verdi, p.verdi);
            p.høyde++;
            if(cmp < 0){
                p = p.venstre;
            }
            else if(cmp > 0){
                p = p.høyre;
            }
            else break;
        }

        p = new Node<>(verdi);
        if (q == null) rot = p;
        else if (cmp < 0) q.venstre = p;
        else q.høyre = p;
        return true;
    }

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
public static void main(String[] args) {
    int[] a = {12,4,10,22,2,6,17,8,20,14,15,5,9,13}; // verdiene fra Oppgave 4A/C
    SBinTre4<Integer> tre = new SBinTre4<>(Comparator.naturalOrder());
    for (int k : a){
        tre.leggInn(k); // legger inn
    }
//    System.out.print(tre.avstand(12,4) + " " + tre.avstand(4,4)); // Utskrift: 15 9
}
} // slutt på class SBinTr
