package eksamen.host2016;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class SBinTre<T>
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
    public SBinTre(Comparator<? super T> c) // konstruktør - lager et tomt tre
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
    public int antall()
    {
        int antall = 0;
        Node<T> p = rot;
        while (p != null)
        {
            antall += (p.vAntall + 1);
            p = p.høyre;
        }
        return antall;
    }

/*    public boolean tom()
    {
        // kode mangler - skal lages
    }
    public void settvAntall()
    {
        // kode mangler - skal lages
    }*/

    public T preorden(int indeks, Node<T> p){
        if(indeks == 0){
            return p.verdi;
        }

        if(p.venstre != null) preorden(indeks-1, p.venstre);
        if(p.høyre != null) preorden(indeks-1, p.høyre);

        return p.verdi;
    }

    public void preorden(int indeks){
        if(indeks >= antall()) throw new NoSuchElementException();
        if(rot != null) preorden(indeks, rot);
    }

    public static void main(String[] args) {
        BinaryTree.BinaryTreeNode root = new BinaryTree.BinaryTreeNode('A');

        //Legg inn resterende noder på nivå 1
        BinaryTree.BinaryTreeNode b = root.addLeftChild('B');
        BinaryTree.BinaryTreeNode c = root.addRightChild('C');

        //Legg inn alle noder på nivå 2
        BinaryTree.BinaryTreeNode d = b.addLeftChild('D');
        BinaryTree.BinaryTreeNode e = b.addRightChild('E');

        BinaryTree.BinaryTreeNode f = c.addLeftChild('F');
        BinaryTree.BinaryTreeNode g = c.addRightChild('G');
    }
} // SBinTre