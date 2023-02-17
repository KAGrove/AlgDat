package kap1_4;

// 	I Programkode 1.4.7 i) ble det laget en komparator for datatypen String som ordner etter lengde.
// 	Men strenger med samme lengde får ingen bestemt orden. Bruk metoden deretter() slik at strenger med samme lengde ordnes alfabetisk.
// 	Bruk dette til å sortere s = {"21","18","8","13","20","6","16","25","3","10"};

import eksempelklasser.Komparator;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;

public class O_1_4_8_4 {
    public static void main(String[] args) {
        String [] s = {"21","18","8","13","20","6","16","25","3","10"};
        Tabell.innsettingssortering(s, Comparator.comparing(String::length).thenComparing(x -> x));

        System.out.println(Arrays.toString(s));
    }
}
