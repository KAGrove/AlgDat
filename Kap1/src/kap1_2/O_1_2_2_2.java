package kap1_2;

import hjelpeklasser.*;

import java.util.Arrays;

// Programkode 1.2.2 b)

public class O_1_2_2_2 {
    public static void main(String ... args)      // hovedprogram
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
    }
}

// De neste oppgavene ligger i klassen Tabell

// O_1_2_2_3
