package kap1_4;

// 	Lag metoden public static void skriv(Object[] a, int fra, int til). Den skal skrive elementene (mellomrom mellom hvert)
// 	fra a[fra:til> på én linje (uten mellomrom til slutt). Lag så en skriv-metode som skriver ut hele a. Lag også tilsvarende
// 	metoder med navn skrivln (de skal avslutte med linjeskift). Lag også metoden public static void bytt(Object[] a, int i, int j).
// 	Den skal bytte om elementene på plassene i og j i tabellen a. Legg alle metodene i samleklassen Tabell.

// Jeg la løsningsforslaget inn i Tabell

import java.util.Arrays;

public class O_1_4_3_5 {
    public static void skriv(Object[] a, int fra, int til){
        for (int i = fra; i < til; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(Object[] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(Object[] a, int fra, int til){
        for (int i = fra; i < til; i++){
            System.out.println(a[i]);
        }
    }

    public static void skrivln(Object[] a){
        skrivln(a, 0, a.length);
    }

    public static void bytt(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Object[] a = {3, "hei", 5.66, "joda", 3.14, "oysann"};
        skriv(a, 0, 3);

        System.out.println();
        skriv(a);
        System.out.println();

        bytt(a, 0, 5);
        skriv(a);
    }
}
