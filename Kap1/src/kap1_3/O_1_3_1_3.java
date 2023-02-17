package kap1_3;

// Skriv opp de 10 første permutasjonene som kommer etter 3 1 4 9 7 10 8 6 5 2 leksikografisk.
// Bruk metoden nestePermutasjon som fasit.

// 3 1 4 9 7 10 8 6 5 2     0
//(3 1 4 9 8 10 7 6 5 2)
// 3 1 4 9 8 2 5 6 7 10     1
// 3 1 4 9 8 2 5 6 10 7     2
// 3 1 4 9 8 2 5 7 6 10     3
// 3 1 4 9 8 2 5 7 10 6     4
// 3 1 4 9 8 2 5 10 6 7     5
// 3 1 4 9 8 2 5 10 7 6     6
// 3 1 4 9 8 2 6 5 7 10     7
// 3 1 4 9 8 2 6 5 10 7     8
// 3 1 4 9 8 2 6 7 5 10     9
// 3 1 4 9 8 2 6 7 10 5     10



import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_3_1_3 {
    public static void main(String[] args) {
        int [] a = {3, 1, 4, 9, 7, 10, 8, 6, 5, 2};
        System.out.println("0:  "+ Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("1: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("2: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("3: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("4: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("5: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("6: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("7: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("8: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("9: " + Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println("10:" + Arrays.toString(a));

    }
}
