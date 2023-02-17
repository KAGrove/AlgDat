package kap1_4;

// I Programkode 1.4.7 i) sorteres strenger mhp. lengde.
// Lag kode som sorterer motsatt vei, dvs. lange strenger kommer først. Lag en komparator eller bruk en orden-teknikk.

import eksempelklasser.Komparator;
import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_4_7_5 {
    public static void main(String[] args) {
        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        Tabell.innsettingssortering(s, (x,y) -> y.length() - x.length());

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Kari, Lars, Berit, Bodil, Anders] // Motsatt nå da
    }
}
