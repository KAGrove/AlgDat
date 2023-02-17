package kap1_4;

// 	Sorter og skriv ut tabellen Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
// 	Bruk en naturligOrden-komparator. Sorter så tabellen motsatt vei (minst til slutt).

import eksempelklasser.Komparator;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;

public class O_1_4_7_2 {
    public static void main(String[] args) {
        Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Tabell.innsettingssortering(d, Comparator.naturalOrder());
        System.out.println(Arrays.toString(d));

        Tabell.innsettingssortering(d, Comparator.reverseOrder());
        System.out.println(Arrays.toString(d));
    }
}
