package host23.eksamen;

// Svakhet: Hvis man har et langt array med gjentakende verdi, og man søker etter det tallet,
// da vil man måtte være i den siste løkken hele tiden, det blir O(n).

public class E2017KBinarFinn {
    public static int finn(int[] a, int verdi)
    {
        int v = 0, h = a.length - 1; // hver sin ende av tabellen
        int m = 0;
        while (v <= h) // fortsetter så lenge som a[v:h] ikke er tom
        {
            m = (v + h)/2; // heltallsdivisjon - finner midten
            int midtverdi = a[m]; // hjelpevariabel for midtverdien
            if (verdi > midtverdi){
                v = m + 1; // verdi i a[m+1:h]
            }
            else if (verdi < midtverdi){
                h = m - 1; // verdi i a[v:m-1]
            }
            else break; // funnet
        }
        if (v > h){
            return -(v + 1); // v er innsettingspunktet
        }
        // må finne den første hvis det er flere forekomster av verdi
        while (m > 0 && a[m - 1] == verdi){
            m--;
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = {2,2,2, 3, 5, 7, 10, 12, 12, 15, 18, 20};
        System.out.println( finn(a, 1) ); // utskrift -1
        System.out.println( finn(a, 12) ); // utskrift 5
        System.out.println( finn(a, 16) ); // utskrift -9
        System.out.println( finn(a, 21) ); // utskrift -11

    }
}
