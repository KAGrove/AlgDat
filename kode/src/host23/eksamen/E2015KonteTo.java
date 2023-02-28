package host23.eksamen;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

public class E2015KonteTo {
    public static String toString(int[] a){
        if(a.length <= 0){
            return "[]";
        }
        String ut = "[";
        for(int i = 0; i < a.length-1; i++){
            ut += a[i] + ", ";
        }
        ut += a[a.length-1] + "]";
        return ut;
    }
    public static int[] snitt(int[] a, int[] b){
        int[] hjelp = new int[a.length];
        int i = 0, j = 0, k=0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                j++;
            }
            else if (a[i] < b[j]){
                i++;
            }
            else{
                hjelp[k] = a[i];
                i++;
                j++;
                k++;
            }
        }
        // Forminsker tabellen
        int[] snitt = new int[k];
        for(int l = 0; l < k; l++){
            snitt[l] = hjelp[l];
        }
        return snitt;
    }

    public static <T> T maks(Kø<T> kø, Comparator<? super T> c){
        if(kø.tom()){
            return null;
        }
        T maks = kø.kikk();
        int n = kø.antall();
        for(int i = 0; i < n; i++){
            kø.leggInn(kø.taUt());
            int cmp = c.compare(kø.kikk(), maks);
            if (cmp > 0){
                maks = kø.kikk();
            }
        }
        return maks;
    }

    public static void main(String[] args) {
//        System.out.println("toString:");
//        int[] a = {};
//        int[] b = {5};
//        int[] c = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(toString(a) + " " + toString(b) + " " + toString(c));
//        // Utskrift: [] [5] [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("Snitt:");
        int[] a = {1,2,4,5,8,9,12};
        int[] b = {2,6,9,12,15};
        int[] c = {4,7,10};
        String ab = toString(snitt(a, b));
        String bc = toString(snitt(b,c));
        String ac = toString(snitt(a, c));
        System.out.println(ab + " " + bc + " " + ac);
        // Utskrift: [2, 9, 12] [] [4]


//        System.out.println("Maks:");
//        Integer[] a = {3,9,6,2,8,1,5,10,7,4}; // en heltallstabell
//        Kø<Integer> kø = new LenketKø<>(); // en Integer-kø
//        for (int tall : a) kø.leggInn(tall); // legger inn i køen
//        Comparator<Integer> c = Comparator.naturalOrder(); // en komparator
//        Integer maksverdi = maks(kø, c); // kaller metoden
//        System.out.println(maksverdi); // skriver ut
//        // Utskrift: 10

    }
}
