package host23.eksamen;

import java.util.LinkedList;
import java.util.Queue;

public class Huffman
{
    private static final class Node {
        private char tegn; // et tegn
        private Node venstre; // peker til venstre barn
        private Node høyre; // peker til høyre barn
        private Node() // konstruktør
        {
            tegn = 0; venstre = høyre = null;
        }
    } // slutt på class Node
    private Node rot; // instansvariabel
    public Huffman(String[] bitkoder) {
        rot = new Node(); // oppretter rotnoden
        for (int i = 0; i < bitkoder.length; i++) // går gjennom tabellen
        {
            String bitkode = bitkoder[i]; // hjelpevariabel
            if (bitkode != null) // eksisterer bitkode?
            {
                Node p = rot; // p starter i roten
                for (int j = 0; j < bitkode.length(); j++) {
                    if (bitkode.charAt(j) == '0') // går til venstre
                    {
                        if (p.venstre == null) p.venstre = new Node();
                        p = p.venstre;
                    }
                    else // går til høyre
                    {
                        if (p.høyre == null) p.høyre = new Node();
                        p = p.høyre;
                    }
                }
                p.tegn = (char)i; // legger inn tegnet
            }
        }
    }

    // Fra chatGPT for å printe i main
    public void printLevelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(rot);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.tegn + " ");

                if (current.venstre != null) {
                    queue.add(current.venstre);
                }
                if (current.høyre != null) {
                    queue.add(current.høyre);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] bitkoder = new String[256];
        bitkoder['A'] = "10";
        bitkoder['B'] = "1100";
        bitkoder['C'] = "0";
        bitkoder['D'] = "1101";
        bitkoder['E'] = "111";

        Huffman huffman = new Huffman(bitkoder);

        // Perform tests to verify that the Huffman tree was constructed correctly

        huffman.printLevelOrder();
    }

} // slutt på class Huffman
