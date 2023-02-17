package kap1_2;

// Lag så et testprogram der maks-metoden inngår (bruk main i class Program), men med parameterverdier som du vet
// vil føre til at unntak kastes. Velg verdier slik at du får frem alle de mulige feilmeldingstypene.

import hjelpeklasser.Tabell;

import java.io.IOException;

public class O_1_2_3_3 {
    public static void main(String[] args) throws IOException { // Er dette nødvendig?
        int[] a = {1,5,3,8,3,6,2,9};
        System.out.println(Tabell.maks(a, 5,4));
    }
}
