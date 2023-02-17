package kap1_4;

// 	Lag en maks-metode som finner posisjonen til den største verdien i en Integer-tabell. Hvor mange endringer må du gjøre hvis
// 	du tar utgangspunkt i maks-metoden for tegnstrenger, dvs. Programkode 1.4.1 b). Test metoden. En testtabell kan du opprette slik:
// 	Integer[] a = {5,2,7,3,9,1,8,4,6};

import java.lang.reflect.Array;
import java.util.Arrays;

public class O_1_4_1_3 {
    public static int maks(Integer[] a)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        Integer maksverdi = a[0];             // største verdi

        for (int i = 1; i < a.length; i++) if (a[i].compareTo(maksverdi) > 0)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdaters
        }
        return m;     // returnerer posisjonen til største verdi
    }

    public static void main(String[] args) {
        Integer[] a = {5,2,7,3,9,1,8,4,6};
        System.out.println(maks(a));
    }
}
