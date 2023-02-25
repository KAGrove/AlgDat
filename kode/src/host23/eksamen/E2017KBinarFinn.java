package host23.eksamen;

public class E2017KBinarFinn {
    public static int finn(int[] a, int verdi)
    {
        int v = 0, h = a.length - 1; // hver sin ende av tabellen
        while (v <= h) // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2; // heltallsdivisjon - finner midten
            int midtverdi = a[m]; // hjelpevariabel for midtverdien
            if (verdi > midtverdi) v = m + 1; // verdi i a[m+1:h]
            else if (verdi < midtverdi) h = m - 1; // verdi i a[v:m-1]
            else break; // funnet
        }
        if (v > h) return -(v + 1); // v er innsettingspunktet
        // må finne den første hvis det er flere forekomster av verdi
        while (v > 0 && a[v - 1] == verdi) v--;
        return v;
    }

    public static void main(String[] args) {
        int[] a = {2,2,2, 3, 5, 7, 10, 12, 12, 15, 18, 20};
        System.out.println( finn(a, 1) ); // utskrift -1
        System.out.println( finn(a, 12) ); // utskrift 5
        System.out.println( finn(a, 16) ); // utskrift -9
        System.out.println( finn(a, 21) ); // utskrift -11

    }
}
