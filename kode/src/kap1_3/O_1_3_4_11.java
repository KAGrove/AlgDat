package kap1_3;

// Ta utgangspunkt i den versjonen av utvalgssortering som står i Programkode 1.3.4 a).
// Men gjør ingen ombytting i det tilfellet samme verdi vil bli byttet med seg selv.
// Det vil påføre algoritmen en ekstra kostnad siden det må gjøres en sammenligning hver gang,
// men spare arbeidet med unødvendige ombyttinger. Finn ut, ved å bruke tilfeldige permutsajoner,
// hvor mange ganger det skjer at en verdi ville ha blitt byttet med seg selv. Spesielt hvis tabellen allerede er sortert,
// byttes en verdi med seg i hver iterasjon. Kanskje du klarer å finne en formel for det gjennomsnittlige antall ganger
// en verdi vil bli byttet med seg selv? Vil det lønne seg å ha denne ekstra testen?

// Svar:
// (Har merget programkode 1.3.4 a), tatt bytt- og min-metoden inn i utvalgssorteringsmetoden.)

import java.util.Arrays;

public class O_1_3_4_11 {
    public static void utvalgssortering(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            int minIndeks = i;
            int minVerdi = a[i];

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minVerdi) {
                    minIndeks = j;
                    minVerdi = a[minIndeks];
                }
            }
            int temp = a[i];
            a[i] = a[minIndeks];
            a[minIndeks] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4,7,7,9,8,0,-5,7};
        System.out.println(Arrays.toString(a));
        utvalgssortering(a);
        System.out.println(Arrays.toString(a));
    }


}
