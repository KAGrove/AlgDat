package obliger;

import java.util.Arrays;

public class Oblig1_6_Test2 {
    public static void rotasjon(char[] a, int k) {
        /*        throw new UnsupportedOperationException();*/
        char temp = a[0]; // tar vare på verdien i indeks 0

        for (int i = -k, j = 0; i != 0; i -= k) // stopper i 0
        {
            if (i < 0) i += a.length; // sjekker fortegnet til indeks i
            a[j] = a[i]; // kopierer
            j = i; // oppdaterer indeks j
        }
        a[k] = temp; // legger tilbake verdien
    }

    public static void main(String[] args) {
        char[] c = "ABCDEFGHIJKLMNOP".toCharArray();
        System.out.println(Arrays.toString(c));
        rotasjon(c,3);
        System.out.println(c);
// Utskrift: [N, O, P, A, B, C, D, E, F, G, H, I, J, K, L, M]
    }

}
