package kap1_4;

// Legg inn maks-metoden fra Programkode 1.4.2 b) i klassen Tabell (legg også inn, hvis du ikke gjorde det i forrige avsnitt,
// maks-metoden fra 1.4.1 b). Lag et program som utfører Programkode 1.4.2 d). Hvilken metode velges? Fjern så maks-metoden for
// String (dvs. Programkode 1.4.1 b) fra Tabell og utfør Programkode 1.4.2 d) på nytt.

import hjelpeklasser.Tabell;

public class O_1_4_2_1 {
    public static void main(String[] args) {
        String [] a = {"Heisann", "Joda", "Neida"};
        System.out.println(Tabell.maks(a));
    }
}

// Kjører metoden som tar inn String. Når jeg kommenterer den ut, kjører den den som tar inn T.