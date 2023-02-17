package kap1_3;

// Setningen for (int i = antall; i > k; i--) a[i] = a[i-1]; i Programkode 1.3.8 a) forskyver verdier i tabellen.
// Dette kan også gjøres ved hjelp av metoden arraycopy() i klassen System. Gjør det!

import hjelpeklasser.Tabell;

public class O_1_3_8_4 {
    public static void innsettingTrorJeg(){
        int[] a = {3,5,6,10,10,11,13,14,16,20,0,0,0,0,0};  // en tabell
        int antall = 10;                                   // antall verdier

        if (antall >= a.length) throw new IllegalStateException("Tabellen er full");

        int nyverdi = 10;                                  // ny verdi
        int k = Tabell.binærsøk(a, 0, antall, nyverdi);    // søker i a[0:antall>
        if (k < 0) k = -(k + 1);                           // innsettingspunkt

        System.arraycopy(a, k, a, k+1, antall-k);

        a[k] = nyverdi;                                    // legger inn
        antall++;                                          // øker antallet

        Tabell.skrivln(a, 0, antall);  // Se Oppgave 4 og 5 i Avsnitt 1.2.2
    }

    public static void main(String[] args) {
        innsettingTrorJeg();
    }
}
