package kap1_3;

import hjelpeklasser.Tabell;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static hjelpeklasser.Tabell.sParter0;

public class O_1_3_9_Div {
    public static int kvikksøk(int[] a, int m)
    {
        if (m < 0 || m >= a.length)
            throw new IllegalArgumentException("m(" + m + ") er ulovlig!");

        int v = 0, h = a.length - 1;  // intervallgrenser

        while (true)
        {
            int k = sParter0(a,v,h,(v + h)/2);   // se Programkode 1.3.9 f)
            if (m < k) h = k - 1;
            else if (m > k) v = k + 1;
            else return k;
        }
    }
    public static double median(int[] a)
    {
        if (a.length == 0) throw new NoSuchElementException("Tom tabell!");

        int k = kvikksøk(a, a.length/2);
        return (a.length & 1) == 0 ? (a[k-1] + a[k])/2.0 : a[k];
    }

    public static void main(String[] args) {
        int[] a = Tabell.randPerm(10);
        System.out.println(Arrays.toString(a) + " " + median(a));
    }
}
