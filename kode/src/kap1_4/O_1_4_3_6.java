package kap1_4;

// 	Legg bytt og randPermInteger fra Programkode 1.4.3 d) inn i samleklassen Tabell og sjekk at Programkode 1.4.3 e) virker.
// 	Lag større tabeller, f.eks. med 20 verdier.

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_4_3_6 {
    public static void main(String[] args) {
        Integer[] a = Tabell.randPermInteger(10);
        System.out.println(Arrays.toString(a));
        // En mulig utskrift: [7, 1, 8, 2, 10, 3, 4, 6, 5, 9]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
