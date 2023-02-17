package kap1_4;

import eksempelklasser.Komparator;
import eksempelklasser.Person;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;

// Ta utgangspunkt i persontabellen p i Programkode 1.4.6 c). Lag kode som sorterer kun med hensyn på etternavn. Bruk en orden-teknikk.

public class O_1_4_7_4 {
    public static void main(String[] args) {
        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen

        Tabell.innsettingssortering(p, Comparator.comparing(Person::etternavn));
        System.out.println(Arrays.toString(p));
    }
}
