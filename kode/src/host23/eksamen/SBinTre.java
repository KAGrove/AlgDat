package host23.eksamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SBinTre<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private final T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private Node(T verdi) // konstruktør
        {
            this.verdi = verdi;
            venstre = høyre = null;
        }
    } // class Node
    private Node<T> rot;
    private int antall;
    private int høyde;
    private final Comparator<? super T> comp;
    public SBinTre(Comparator<? super T> c) // konstruktør - lager et tomt tre
    {
        rot = null; // rot er null i et tomt tre
        antall = 0; // et tomt tre har ingen noder
        høyde = -1; // et tomt tre har høyde lik -1
        comp = c; // komparatoren får verdi
    }
    public int antall() { return antall; }
    public boolean tom() { return antall == 0; }
    public int høyde() { return høyde; }
    public void leggInn(T verdi)
    {
        Node<T> p = rot, q = null;
        int cmp = 0;
        int nivå = 0;
        while (p != null)
        {
            q = p;
            nivå++;
            cmp = comp.compare(verdi,p.verdi);
            p = cmp < 0 ? p.venstre : p.høyre;
        }
        p = new Node<>(verdi);
        if (q == null) rot = p;
        else if (cmp < 0) q.venstre = p;
        else q.høyre = p;

        if(nivå > høyde){
            høyde = nivå;
        }
        antall++;
    }
    public T min()
    {
        if(tom()){
            return null;
        }
        return min(rot);
    }

    public T min(Node <T> p)
    {
        if(p.venstre == null){
            return p.verdi;
        }
        return min(p.venstre);

    }
   private int dybde(Node<T> p){
        Node<T> q = rot;
        int dybde = -1;
        int cmp = 0;
        while (q != null)
        {
            cmp = comp.compare(p.verdi, q.verdi);
            if(cmp < 0){
                q = q.venstre;
            }
            else if(cmp > 0){
                q = q.høyre;
            }
            else{
                dybde++;
                break;
            }
            dybde++;
        }
        return dybde;
    }

    public T[] nedersteNivå(){
        if(tom()){
            return (T[]) new Object[0];
        }
        ArrayList<T> liste = new ArrayList<>();
        nedersteNivå(rot, liste);
        T[] array = (T[]) new Object[liste.size()];
        for (int i = 0; i < liste.size(); i++){
            array[i] = liste.get(i);
        }
        return array;
    }


    public void nedersteNivå(Node<T> p, ArrayList<T> liste){
        if(dybde(p) == høyde()){
            liste.add(p.verdi);
        }

        if(p.venstre != null){
            nedersteNivå(p.venstre, liste);
        }
        if(p.høyre != null){
            nedersteNivå(p.høyre, liste);
        }
    }


    public static void main(String[] args) {
        // Create a new SBinTre instance with a comparator that compares integers
        SBinTre<Integer> tree = new SBinTre<>(Comparator.naturalOrder());

        // Add some elements to the tree
        tree.leggInn(5);
        tree.leggInn(3);
        tree.leggInn(7);
        tree.leggInn(2);
        tree.leggInn(4);
        tree.leggInn(1);

        // Print the minimum element in the tree
        System.out.println("Minimum element in the tree: " + tree.min());
        System.out.println("Høyde: " + tree.høyde);
        Node<Integer> node = new Node<>(1);
        System.out.println("Dybde: " + tree.dybde(node));
        System.out.println("Nederste nivå: " + Arrays.toString(tree.nedersteNivå()));
    }
} // class SBinTre
