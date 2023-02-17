package kap1_3;

import java.util.Arrays;

public class O_1_3_5_5_c {
    public static int kvadratrotsøk(int[] a, int verdi) {
        if (Math.sqrt(a.length) < 1)
            throw new IllegalArgumentException("Må ha arraylengde > 0!");

        int j = (int) (Math.sqrt(a.length) - 1);
        for (; j < a.length && verdi > a[j]; j += Math.sqrt(a.length));

        int i = (int) (j - Math.sqrt(a.length) + 1);  // søker i a[j-k+1:j]
        for (; i < a.length && verdi > a[i]; i++);

        if (i < a.length && a[i] == verdi) return i;  // funnet
        else return -(i + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int indeks = 0;
        for (int i = 2; indeks < 100; i = i+2){
            a[indeks] = i;
            indeks++;
        }
        System.out.println(Arrays.toString(a));

        System.out.println(kvadratrotsøk(a, 0));
    }
}

