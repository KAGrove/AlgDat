package kap1_1;

import java.util.Arrays;

public class O_1_1_3_5_Fasit {
    public static int[] minmaks(int[] a)
    {
        int mi = 0, minverdi = a[0];
        int ma = 0, maksverdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++)
        {
            verdi = a[i];

            if (verdi > maksverdi) { maksverdi = verdi; ma = i;}
            else if (verdi < minverdi) {minverdi = verdi; mi = i;}
        }

        return new int[]{mi,ma};
    }

    public static void main(String[] args) {
        int[] liste = {17,6,9,17};
        System.out.println(Arrays.toString(minmaks(liste)));
    }
}
