package kap1_2;

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_2_4_4_Fasit {
    public static void sortering(int[] a) {
        for (int i = a.length; i > 1; i--) {
            int m = Tabell.maks(a,0,i);
            Tabell.bytt(a,i-1,m);
        }
    }

    public static void main(String[] args) {
        int[] a = Tabell.randPerm(5);
        System.out.println(Arrays.toString(a));
        sortering(a);
        System.out.println(Arrays.toString(a));
    }
}
