package kap1_3;

// utvalgssortering i Programkode 1.3.4 a) bruker to hjelpemetoder. Det er mest vanlig å kode den uten hjelpemetoder.
// Søk på internett. Bruk «selection sort» som søkeord. Lag så din egen versjon (uten hjelpemetoder)!
// Hvor lang tid bruker den for en tilfeldig tabell med 100000 verdier? Er den bedre enn den fra Programkode 1.3.4 a)?

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_3_4_5_b {
    public static void selectionSort(int[] a){      // Hjemmelaget
        for (int i = 0; i < a.length-1; i++){
            int maks = a[0];              // Bruker mest minne på å definere variabel i hver iterasjon, eller definere oppe?
            int maksIndeks = 0;
            for (int j = 1; j < a.length-i; j++){
                if (a[j] > maks){
                    maks = a[j];
                    maksIndeks = j;
                }
            }

            a[maksIndeks] = a[a.length-1-i];
            a[a.length-1-i] = maks;
        }
    }

    public static void main(String[] args) {
        int[] a = {4,7,1,9,8,0,-5,7, 70, -45, 100, 99};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
