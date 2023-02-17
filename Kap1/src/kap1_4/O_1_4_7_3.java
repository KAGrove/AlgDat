package kap1_4;

// Gitt Boolean[] b = {false, true, true, false, false, true, false, true};
// Bruk en naturligOrden-komparator til å sortere tabellen. Skriv ut resultatet.

import eksempelklasser.Komparator;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;

public class O_1_4_7_3 {
    public static void main(String[] args) {
        Boolean[] b = {false, true, true, false, false, true, false, true};
        Tabell.innsettingssortering(b, Comparator.naturalOrder());
        System.out.println(Arrays.toString(b));
    }
}
