package kap1_3;

import java.util.Arrays;

import static hjelpeklasser.Tabell.bytt;
import static hjelpeklasser.Tabell.min;

// Ta utgangspunkt i den versjonen av utvalgssortering som står i Programkode 1.3.4 a).
// Men gjør ingen ombytting i det tilfellet samme verdi vil bli byttet med seg selv.
// Det vil påføre algoritmen en ekstra kostnad siden det må gjøres en sammenligning hver gang,
// men spare arbeidet med unødvendige ombyttinger. Finn ut, ved å bruke tilfeldige permutsajoner,
// hvor mange ganger det skjer at en verdi ville ha blitt byttet med seg selv. Spesielt hvis tabellen allerede er sortert,
// byttes en verdi med seg i hver iterasjon. Kanskje du klarer å finne en formel for det gjennomsnittlige antall ganger
// en verdi vil bli byttet med seg selv? Vil det lønne seg å ha denne ekstra testen?

// Svar:
// Misforstod oppgaven, den handler om hvor mange ganger man kan slippe å gjøre ombyttingen fordi men ved min-metoden
// har funnet ut at det minste allerede er på rett plass, dvs. nederst mulig.

// Sjanse for at tallet står på rett plass og vi slipper å bytte: Med 10 tall: 1/10 + 1/9 + ... + 1/2.
// H10 - 1 =    (Sigma x=1 til 10  (1/x)  - 1 )   = 1,93   -> Gjennomsnittsverdien er nær 2

// Siste spm, fra fasit:
// Hvis tabellen inneholder tallene fra 1 til n, vil gjennomsnittet bli Hn − 1. I Avsnitt 1.1.6 fant vi at for store n er
// Hn − 1 ≈ log(n) – 0,423. Hvis n f.eks. er 100 000, vil det bli 11,1. Dette betyr at det overhodet ikke lønner seg å
// ha testen if (m != i). Den utføres hver gang (n − 1 ganger), men det er svært sjelden at m og i er like.

public class O_1_3_4_11_Losning {
    public static int utvalgssortering(int[] a)
    {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int m = min(a, i, a.length);  // posisjonen til den minste
            if (m != i){
                bytt(a, i, m);
            }
            else antall++;
        }
        return antall;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,7,6};
        System.out.println(Arrays.toString(a));
        System.out.println(utvalgssortering(a));
        System.out.println(Arrays.toString(a));
    }
}
