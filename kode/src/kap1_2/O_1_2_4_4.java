package kap1_2;

// Idéen i Oppgave 3 kan utvides til å bli en sorteringsalgoritme. Finn først den største og bytt om slik at den kommer
// bakerst. Finn så den største i det intervallet som ikke har med den siste og bytt om slik at den kommer nest bakerst.
// Finn så den største i intervallet som ikke har med de to siste og bytt om slik at den kommer på tredje bakerst. Osv.

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_2_4_4 {
    public static void sortering(int[] a) {
        int n = a.length;

        for (int i = 1; i<n; i++){
                int m = Tabell.maks(a, 0, n + 1 - i);       // Nøkkelen her var +1, siden maks har halvåpent intervall
                Tabell.bytt(a, m, n - i);
            }
    }

    public static void main (String[]args){
        int[] a = Tabell.randPerm(5);
        System.out.println(Arrays.toString(a));
        sortering(a);
        System.out.println(a);                  // Må man alltid ha toString når man skal printe en tabell? Ref forrige oppg.
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));



    }
}
