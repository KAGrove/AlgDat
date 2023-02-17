package kap1_4;

// Kopier class Heltall fra Programkode 1.4.4 a) over til deg selv. Opprett mappen (package) eksempelklasser og legg den der.

import eksempelklasser.Heltall;
import hjelpeklasser.Tabell;

import java.util.Arrays;

public class O_1_4_4_1 {
    public static void main(String[] args) {
        // 	a) Lag og kjør et program med Programkode 1.4.4 c).
        int[] a = {5,2,7,3,9,1,8,10,4,6};          // en int-tabell
        Heltall[] h = new Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++){
            h[i] = new Heltall(a[i]);
        }
        Tabell.innsettingssortering(h);           // generisk sortering
        System.out.println(Arrays.toString(h));   // utskrift

        // 1.4.4.1 d)
        Heltall x = new Heltall(3), y = new Heltall(3);  // x og y er like
        System.out.println(x.compareTo(y) + "  " + x.equals(y));

        // 1.4.4.1 e)
        Heltall m = new Heltall(3), n = new Heltall(3);  // m og n er like
        System.out.println(m.hashCode() + "  " + n.hashCode());
    }
}
