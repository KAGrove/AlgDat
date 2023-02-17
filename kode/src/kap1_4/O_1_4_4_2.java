// e) Skjønte ikke helt hvordan equals blir brukt!
// ??????????????????????????????????????????????????????????????????????????????

package kap1_4;

import eksempelklasser.Person;
import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class O_1_4_4_2 {
    public static void main(String[] args) {
        Person[] p = new Person[6];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen
        p[5] = new Person("Jens", "Johansen");

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        Tabell.innsettingssortering(p);               // generisk sortering

        // c): I stedet for forrige linje:
        // Arrays.sort(p);

        System.out.println(Arrays.toString(p));       // skriver ut sortert

        // Utskrift:

        // Boris Zukanovic er størst
        // [Ali Kahn, Kari Pettersen, Kari Svendsen, Azra Zukanovic, Boris Zukanovic]

        // g) (Skjønner ikke dette her....)
        Stream s = Arrays.stream(p);
        Optional<Person> resultat = s.max(Comparator.naturalOrder());
        resultat.ifPresent(System.out::println);

        // h) (Skjønner ikke dette her....)
        Arrays.stream(p).max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
