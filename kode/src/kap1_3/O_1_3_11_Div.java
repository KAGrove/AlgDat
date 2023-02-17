package kap1_3;

import hjelpeklasser.Tabell;

public class O_1_3_11_Div {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,9,9,11}, b = {2,3,5,6,7,8,9,10,12,14};  // sorterte tabeller
        int[] c = new int[a.length + b.length];     // nå er c stor nok
        Tabell.flett(a,b,c);                        // fletter sammen
        Tabell.skriv(c);  // Utskrift: 1 2 3 3 4 5 6 6 7 8 9 9 9 10 11 12 14
    }
}
