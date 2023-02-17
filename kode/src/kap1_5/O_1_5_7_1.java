package kap1_5;

import hjelpeklasser.Tabell;

import java.util.Arrays;

import static hjelpeklasser.Tabell.sParter0;

public class O_1_5_7_1 {
/*    public static void kvikksortering0(int[] a, int v, int h)
    {
        System.out.println("Kallet med [" + v + ":" + h + "] starter!");
        if (v >= h) return;   // tomt eller maks ett element

        int k = sParter0(a,v,h,(v + h)/2);   // se Programkode 1.3.9 f)
        kvikksortering0(a,v,k-1);
        kvikksortering0(a,k+1,h);
        System.out.println("Kallet med [" + v + ":" + h + "] er ferdig!");
    }*/

    // b) VIRKER SOM AT DENNE METODEN IKKE VIRKER, GIR FEIL SVAR!!

    private static void kvikksortering1(int[] a, int v, int h)
    {
        System.out.println("a[" + v + ":" + h + "] legges på stakken");

        int p = Tabell.sParter(a, v, h, (v + h) / 2);  // bruker midtverdien
        if (v < p - 1) kvikksortering1(a, v, p - 1);    // sorterer intervallet a[v : p - 1]
        if (p + 1 < h) kvikksortering1(a, p + 1, h);    // sorterer intervallet a[p + 1 : h]
    }

    public static void kvikksortering(int[] a) // sorterer hele tabellen
    {
        if (a.length > 1) kvikksortering1(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int [] a = {5,3,8,1,2,7};
        System.out.println(Arrays.toString(a));
        kvikksortering(a);
        System.out.println(Arrays.toString(a));
    }
}
