package kap1_4;

import hjelpeklasser.Tabell;

// 	Legg de to maks-metodene fra Programkode 1.4.1 a) og b) inn i samleklassen Tabell og lag et program som utfører Programkode 1.4.1 c).

public class O_1_4_1_1 {
    public static void main(String[] args) {
        int[] a = {5,2,7,3,9,1,8,4,6};
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};

        int k = Tabell.maks(a);     // posisjonen til den største i a
        int l = Tabell.maks(d);     // posisjonen til den største i d
        int m = Tabell.maks(s);     // posisjonen til den største i s

        System.out.println(a[k] + "  " + d[l] + "  " + s[m]);
    }

}
