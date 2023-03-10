package kap1_1;

public class O_1_1_4_Programkode {
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++)
            if (a[i] > maksverdi) {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    public static void main(String[] args) {
        int[] liste = {16,6,9,7,3,55,1};
        System.out.println(maks(liste));
    }
}
