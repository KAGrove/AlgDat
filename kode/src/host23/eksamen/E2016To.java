package host23.eksamen;

import hjelpeklasser.DobbeltLenketListe;
import hjelpeklasser.Liste;

import java.util.Comparator;

public class E2016To {
    public static <T> int compare(Liste<T> a, Liste<T> b, Comparator<? super T> comp) {
        for (int i = 0; i < a.antall() && i < b.antall(); i++) {
            int cmp = comp.compare(a.hent(i), b.hent(i));
            if (cmp > 0) {
                return 1;
            } else if (cmp < 0) {
                return -1;
            }
        }
        if(a.antall() > b.antall()){
            return 1;
        }
        else if(a.antall() < b.antall()){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Character[] tegn1 = {'A','B','C'}, tegn2 = {'A','B','D'};
        Integer[] tall1 = {1,2,3,4,5}, tall2 = {1,2,3,4};
        Liste<Character> a = new DobbeltLenketListe<>(); // create empty list
        Liste<Character> b = new DobbeltLenketListe<>();
        Liste<Integer> c = new DobbeltLenketListe<>();
        Liste<Integer> d = new DobbeltLenketListe<>();
        for (Character tegn : tegn1) {
            a.leggInn(tegn); // add elements to list
        }
        for (Character tegn : tegn2) {
            b.leggInn(tegn);
        }
        for (Integer tall : tall1) {
            c.leggInn(tall);
        }
        for (Integer tall : tall2) {
            d.leggInn(tall);
        }
        int cmp1 = compare(a, b, Comparator.naturalOrder()); // cmp1 skal bli negativ
        int cmp2 = compare(c, d, Comparator.naturalOrder()); // cmp2 skal bli positiv
        System.out.println(cmp1);
        System.out.println(cmp2);

    }
}
