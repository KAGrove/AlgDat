package host23.eksamen;

import java.util.ArrayDeque;
import java.util.Comparator;

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
    public void settvAntall(Node<T> p) {
        if(p.venstre != null){
            p.vAntall++;
            settvAntall(p.venstre);
        }
        if(p.høyre != null){
            settvAntall(p.høyre);
        }
    }
    public void settvAntall() {

        settvAntall(rot);
    }
//    public T preorden(int indeks)
//    {
//        // kode mangler - skal lages
//    }
public static void main(String[] args) {
    SBinTre3<Integer> tre = new SBinTre3<>(Comparator.naturalOrder());
    int[] values = {11, 3, 25, 10, 5, 2, 15, 13, 20, 8, 22, 16, 4, 12};
    for (int v : values) {
        tre.leggInn(v);
    }
    int antall = tre.antall();
    System.out.println("Antall noder i treet: " + antall);



    // settvAntall(): (Dette funker ikke, siden de allerede har blitt gitt verdi under leggInn() )
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
}




} // SBinTre
