package host23.eksamen;

import java.util.Arrays;

public class E2015fjernDuplikater {
    public static int fjernDuplikater(int[] a) {
        int antallUnike = 1; // There is at least one unique value (the first element)
        int i, j;

        for (i = 1, j = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                a[j++] = a[i];
                antallUnike++;
            }
        }

        // Fill the rest of the array with 0s
        for (; j < a.length; j++) {
            a[j] = 0;
        }

        return antallUnike;
    }


    public static void main(String[] args) {
        int[] a = {1,3,5,5,6,8,8,8,9,10,10}; // en sortert tabell med duplikater
        int antall = fjernDuplikater(a); // kaller metoden
        System.out.println(antall + ": " + Arrays.toString(a)); // antallet og tabellen
        // Utskrift: 7: [1, 3, 5, 6, 8, 9, 10, 0, 0, 0, 0]
    }
}
