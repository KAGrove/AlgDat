package kap1_2;

public class O_1_2_1_1 {
    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int min(int[] a) {                // 2. oppg. Minste i hele listen. Metoden har samme navn, men ulike parametre.
        return min(a,0,a.length);               // Gir tillegsfunksjonalitet til metoden.
    }

    public static void main(String[] args) {
        int[] liste = {4,5,8,1};
        System.out.println(min(liste, 0,4));
        System.out.println(min(liste, 0, liste.length));
        System.out.println(min(liste, 0, 3));
        System.out.println(min(liste));             // 2. oppg.
    }
}