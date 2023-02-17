package kap1_3;
// 	3. versjon av binærsøk returnerer alltid indeksen til den første av dem hvis søkeverdien det søkes forekommer
// 	flere ganger. Sjekk at det stemmer for tallene i Oppgave 3.

import hjelpeklasser.Tabell;

public class O_1_3_6_4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
        System.out.println(Tabell.binærsøk(a, 4));
    }
}
