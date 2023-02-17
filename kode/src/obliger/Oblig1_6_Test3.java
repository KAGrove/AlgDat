package obliger;

import java.util.Arrays;

public class Oblig1_6_Test3 {
    public static void rotasjon(char[] a, int d)            // 1. versjon
    {
        int n = a.length;
        if (n < 2){
            return;                 // tomt eller en verdi
        }
        if ((d %= n) < 0){
            d += n;                             // motsatt vei?
        }

        char[] b = Arrays.copyOfRange(a, n - d, n);           // hjelpetabell
        for (int i = n - 1; i >= d; i--){
            a[i] = a[i - d];                                            // forskyver
        }
        System.arraycopy(b, 0, a, 0, d);                      // kopierer
    }

    public static void main(String[] args) {
        char [] a = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println(a);
        rotasjon(a, -1);
        System.out.println(a);
    }
}
