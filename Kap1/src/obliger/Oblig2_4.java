/*
package obliger;

import hjelpeklasser.Beholder;
import hjelpeklasser.Liste;

import java.util.Objects;

public class Oblig2_4 {
    public class DobbeltLenketListe<T> implements Liste<T> {

        private static final class Node<T> {
            private T verdi;                   // nodens verdi
            private Node<T> forrige, neste;    // pekere

            private Node(T verdi, Node<T> forrige, Node<T> neste) {
                this.verdi = verdi;
                this.forrige = forrige;
                this.neste = neste;
            }

            private Node(T verdi) {
                this(verdi, null, null);
            }
        }

        // instansvariabler
        private Node<T> hode;          // peker til den første i listen
        private Node<T> hale;          // peker til den siste i listen
        private int antall;            // antall noder i listen
        private int endringer;         // antall endringer i listen

        public DobbeltLenketListe() {
            hode = hale = null;
            antall = 0;
            endringer = 0;
        }

        //Oppgave 1
        public DobbeltLenketListe(T[] a) {
            new DobbeltLenketListe(); //oppretter et objekt med konstruktøren
            Objects.requireNonNull(a,"Tabellen a er null!"); //sjekker om tabellen er null
            this.hode = new Node(null); //oppretter hale/hode som utgangspunkt for å bygge videre
            this.hale = hode;

            for(int i=0;i<a.length;i++) { //fylle på en node så lenge verdien i arrayet ikke er null, hopper over null-verdier
                if (a[i] != null) {
                    hale.neste = new Node(a[i]);
                    hale = hale.neste;
                    antall++;
                }
            }
            if(antall == 0){ //hvis antallet noder fortsatt er 0 må hode = hale, som er null
                hode = hale;
            } else{
                hode = hode.neste=null; //hvis det er bygget på noder må vi sørge for at hode ikke lengre er null-verdien
                //hode.forrige = null;
            }
        }

        public int indeksTil(T verdi) {
            Node<T> q = hode;
            while(q!=null){
                int i = 0;
                if (q != verdi){
                    q = q.neste;
                    i++;
                } else{
                    return -1;
                }
                return i;
            }
        }
    }
}
*/
