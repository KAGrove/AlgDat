package kap1_4;
// Lag en maks-metode som finner posisjonen til den «største» verdien i en char-tabell. Hvor mange endringer må du
// gjøre hvis du tar utgangspunkt i maks-metoden for datatypen double, dvs. Programkode 1.4.1 a). Test metoden din ved å
// legge inn en char-tabell i Programkode 1.4.1 c). Hint: En char-tabell c som for eksempel inneholder tegnene J, A, S, M,
// I og N, kan lages slik: char[] c = "JASMIN".toCharArray();

import hjelpeklasser.Tabell;

public class O_1_4_1_2 {
    public static void main(String[] args) {
        char[] c = "JASMIN".toCharArray();

        System.out.println(Tabell.maks(c));
    }
}
