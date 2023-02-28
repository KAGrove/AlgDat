package host23.eksamen;

import java.util.Comparator;
import java.util.Objects;

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

    public boolean leggInn(T verdi)
    {
        Objects.requireNonNull(verdi,"Ikke tillatt med null-verdier!");
        Node<T> p = rot, q = null; // hjelpepekere
        int cmp = 0; // for sammenligninger
        int avstand = 0; // avstand opp til roten
        while (p != null)
        {
            q = p; // q blir forelder til p
            avstand++; // øker avstanden
            cmp = comp.compare(verdi, p.verdi); // sammenligner
            p = cmp < 0 ? p.venstre : p.høyre; // flytter p
        }
        p = new Node<>(verdi); // en ny node
        if (tom()) // er treet tomt?
        {
            rot = p; // roten opprettes
        }
        else
        {
            if (cmp < 0) q.venstre = p; // p blir venstre barn til q
            else q.høyre = p; // p blir høyre barn til q
            if (q.høyde == 0) // høydeoppdateringer trengs
            {
                Node<T> r = rot; // starter på nytt i roten
                while (r != p) // fortsetter ned til p
                {
                    if (r.høyde < avstand) r.høyde++; // høyden til r økes
                    avstand--; // reduserer avstanden
                    if (comp.compare(verdi,r.verdi) < 0)
                        r = r.venstre; // går til venstre
                    else r = r.høyre; // går til høyre
                } // while
            } // if
        } // else
        antall++; // en ny verdi i treet
        return true; // vellykket innlegging
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
    public T avstand(T verdi, int d)
    {
        Objects.requireNonNull(verdi,"Ingen null-verdier!");
        if (d < 0) throw new IllegalArgumentException("Negativ avstand!");
        Node<T> p = rot; // starter i roten
        while (p != null)
        {
            int cmp = comp.compare(verdi, p.verdi); // sammenligner
            if (cmp < 0) p = p.venstre; // går til venstre
            else if (cmp > 0) p = p.høyre; // går til høyre
            else break; // verdi ligger i p
        }
        if (p == null) return null; // verdi ligger ikke i treet
        // verdi ligger i p, eventuelle duplikater må ligge til høyre
        if (p.høyre != null)
        {
            Node<T> q = p.høyre;
            while (q.venstre != null) q = q.venstre;
            if (comp.compare(verdi, q.verdi) == 0) return null; // et duplikat
        }
        // Det er nå kun en forekomst av verdi og den ligger i p.
        // Hvis høyden til p er mindre enn d, kan vi gi opp
        if (p.høyde < d) return null;
        // Subtreet med p som rotnode har nå minst en node med avstand d
        // opp til p. Hvis det høyre subtreet er høyt nok, går vi dit.
        // Hvis ikke, går vi til det venstre subtreet. Osv.
        while (d-- > 0 && p != null) {
            if (p.høyre != null && d <= p.høyre.høyde) {
                p = p.høyre;
            } else {
                p = p.venstre;
            }
        }


        return p.verdi;
    }


    public static void main(String[] args) {
    int[] a = {12,4,10,22,2,6,17,8,20,14,15,5,9,13}; // verdiene fra Oppgave 4A/C
    SBinTre4<Integer> tre = new SBinTre4<>(Comparator.naturalOrder());
    for (int k : a){
        tre.leggInn(k); // legger inn
    }
        System.out.print(tre.avstand(12,4) + " " + tre.avstand(4,4)); // Utskrift: 15 9
        System.out.println();
        System.out.println("Nest minst her: " + tre.nestMinst());
    }
} // slutt på class SBinTr
