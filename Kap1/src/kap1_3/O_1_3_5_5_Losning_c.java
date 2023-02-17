package kap1_3;

import java.util.Arrays;

import static kap1_3.O_1_3_5_5_Losning_a.lineærsøk;

public class O_1_3_5_5_Losning_c {
    public static int kvadratrotsøk(int[] a, int verdi) {
        return lineærsøk(a,(int)Math.sqrt(a.length),verdi);
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
