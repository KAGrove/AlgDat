package kap1_3;

// 	Lag en versjon av innsettingssortering som sorterer i tabellintervallet a[fra:til>. Legg den i samleklassen Tabell.

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_3_8_7 {

    public static void main(String[] args) {
        int[] a = Tabell.randPerm(10);
        System.out.println(Arrays.toString(a));
        Tabell.innsettingssortering(a, 2,7);
        System.out.println(Arrays.toString(a));
    }

    // Oppgave 8:
    // Fasit: Innsettingssortering er stabil fordi indre for-løkke har setningen verdi < a[j].
    // Det betyr at letingen etter rett sortert plass stopper hvis verdi er lik a[j] og verdi blir satt inn i a[j+1], dvs. etter a[j].


}
