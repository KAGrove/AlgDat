package kap1_4;

// Legg Programkode 1.4.2 e) i klassen Tabell og sjekk at Programkode 1.4.2 f) virker.

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_4_2_2 {
    public static void main(String[] args) {
        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));  // [Ali, Anne, Eva, Kari, Ole, Per]
    }
}
