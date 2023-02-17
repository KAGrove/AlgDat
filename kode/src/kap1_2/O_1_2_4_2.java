package kap1_2;

// Lag en versjon av nestmaks-metoden der du bytter om slik at den største kommer forrest. Dermed kan letingen etter
// den nest største starte i posisjon 1. Pass på og bytt tilbake før metoden avslutter slik at tabellen kommer tilbake
// i sin originale tilstand. Obs. Det blir et spesialtilfelle her når den nest største verdien ligger forrest i tabellen.
// Pass på at det tilfellet behandles rett.

import hjelpeklasser.Tabell;

public class O_1_2_4_2 {

    public static int[] nestMaksMedBytt(int[] a)
    {   int n = a.length;

        if (n < 2) throw
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = Tabell.maks(a);
        Tabell.bytt(a, 0, m);
        int nm = Tabell.maks(a, 1, n);
        if (nm == m){                           // I tilfelle nest-først havner først i tabellen
            nm = 0;}
        Tabell.bytt(a, m, 0);               // Bytter tilbake
        return new int[] {m,nm};
    }

    public static void main(String[] args) {
        int[] a = Tabell.randPerm(5);
        int[] b = nestMaksMedBytt(a);

        int m = b[0], nm = b[1];

        Tabell.skrivln(a);
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
    }
}
