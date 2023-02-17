package kap1_3;

// Legg metoden i Programkode 1.3.4 a) inn i samleklassen Tabell. Pass på at du da allerede har metodene bytt() og
// min() der. Se også Oppgave 1 i Avsnitt 1.2.1. Sjekk så at Programkode 1.3.4 b) virker.

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_3_4_3 {
    public static void main(String[] args) {
        int[] a = {4,7,1,9,8,0,-5,7};
        Tabell.utvalgssortering(a);
        System.out.println(Arrays.toString(a));
    }

}
