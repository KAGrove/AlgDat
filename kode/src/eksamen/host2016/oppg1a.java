package eksamen.host2016;

import hjelpeklasser.Tabell;

import java.util.Arrays;

public class oppg1a {
    public static int omorganiser(char[] c) {
        int v = 0;
        int h = c.length - 1;
        while (v < h) {
            while (!Character.isUpperCase(c[v])) v++;
            while (v < h && Character.isUpperCase(c[h])) h--;

            char tmp = c[v];
            c[v] = c[h];
            c[h] = tmp;
        }
        return v;
    }


    public static void main(String[] args) {
        char[] c = "AbaAcBbAAaCCbcAB".toCharArray();
        int antall = omorganiser(c);
        System.out.println(antall + " " + Arrays.toString(c));
        // Utskrift: 7 [c, b, a, b, c, a, b, A, A, B, C, C, A, A, A, B]

    }
}
