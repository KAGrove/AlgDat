package kap1_3;

// a) I metoden public static int lineærsøk(int[] a, int k, int verdi) skal a og verdi være som i vanlig lineærsøk.
// Parameter k (et positivt heltall) er «hopplengden». I beskrivelsen over var k lik 10.
// Metoden skal returnere nøyaktig det samme som vanlig lineærsøk, også i det tilfellet den søkte verdien ikke finnes.

import java.util.Arrays;

public class O_1_3_5_5_Losning_a {
    public static int lineærsøk(int[] a, int k, int verdi)
    {
        if (k < 1)
            throw new IllegalArgumentException("Må ha k > 0!");

        int j = k - 1;
        for (; j < a.length && verdi > a[j]; j += k);

        int i = j - k + 1;  // søker i a[j-k+1:j]
        for (; i < a.length && verdi > a[i]; i++);

        if (i < a.length && a[i] == verdi) return i;  // funnet
        else return -(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int indeks = 0;
        for (int i = 2; indeks < 100; i = i+2){
            a[indeks] = i;
            indeks++;
        }
        System.out.println(Arrays.toString(a));

        System.out.println(lineærsøk(a, 1, 6));
    }
}
