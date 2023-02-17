package kap1_3;

// Gitt flg. permutasjoner av tallene fra 1 til 6: a) 2 3 6 1 4 5, b) 2 3 6 1 5 4,
//c) 2 3 1 6 5 4, d) 2 3 6 5 4 1 og e) 2 6 5 4 3 1. Finn, for hver av dem, den neste i leksikografisk rekkefølge.
// Bruk så metoden nestePermutasjon som fasit.


// a) 2 3 6 1 4 5,
//    2 3 6 1 5 4
//
// b) 2 3 6 1 5 4,
//    2 3 6 4 1 5
//
// c) 2 3 1 6 5 4,  bytt 1 med det minste som er større til høyre: 4
//    2 3 4 6 5 1   Mellomregning: snu så tallene til høyre for det utskiftede
//    2 3 4 1 5 6
//
// d) 2 3 6 5 4 1
//    2 4 6 5 3 1 Mellomregning
//    2 4 1 3 5 6
//
// e) 2 6 5 4 3 1
//    3 6 5 4 2 1 Mellomregning
//    3 1 2 4 5 6

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_3_1_2 {
    public static void main(String[] args) {
        int [] a = {2, 6, 5, 4, 3, 1};
        System.out.println(Arrays.toString(a));
        Tabell.nestePermutasjon(a);
        System.out.println(Arrays.toString(a));
    }
}
