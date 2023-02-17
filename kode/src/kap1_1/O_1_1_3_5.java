package kap1_1;

/*5
Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene
til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største,
kan du returnere tabellen b definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?*/

import java.util.Arrays;

public class O_1_1_3_5 {
    public static int[] minmaks(int[] a) {
        int returListe[] = new int[2];
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int min = 0;
        int maks = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < a[min]){
                returListe[0] = i;
                min = i;
            }
            else if (a[i] > a[maks]) {
                returListe[1] = i;
                maks = i;
            }
        }

        return returListe;
    }

    public static void main(String[] args) {
        int[] liste = {17,19,22,1,4,3,2,9};
        System.out.println(Arrays.toString(minmaks(liste)));

        /*
        Alex' løsning:
        int [] index = minmaks(liste);
        int min = index[0];
        int maks = index[1];
        System.out.println(min);
        System.out.println(maks);*/
    }
}
