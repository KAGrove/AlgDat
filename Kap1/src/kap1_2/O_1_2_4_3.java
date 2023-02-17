package kap1_2;

// Som i Oppgave 2, men bytt om slik at den største havner bakerst. Obs. Det blir et spesialtilfelle her når den
// nest største verdien ligger bakerst i tabellen. Pass på at det tilfellet behandles rett.

import hjelpeklasser.Tabell;

public class O_1_2_4_3 {
    public static int[] nestMaks(int[] a)
    {   int n = a.length;

        if (n < 2) throw
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = Tabell.maks(a);
        Tabell.bytt(a, m , a.length-1);
        int nm = Tabell.maks(a, 0, n - 1);
        if (nm == m){
            nm = a.length-1;}
        Tabell.bytt(a, a.length-1, m);
        return new int[] {m,nm};

    }

    public static void main(String[] args) {
        int[] a = Tabell.randPerm(5);
        int[] b = nestMaks(a);

        int m = b[0], nm = b[1];

        Tabell.skrivln(a);
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
    }
}
