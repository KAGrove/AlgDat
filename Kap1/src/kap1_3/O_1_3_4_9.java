package kap1_3;

// Den skal sortere intervallet a[fra:til>. Pass på at du tester lovligheten til intervallet!

// (Bygger videre på forrige oppgave)

import java.util.Arrays;

public class O_1_3_4_9 {
    public static void utvalgssortering(int[] a, int fra, int til){
        for (int i = 0; i < til-1-i; i++){
            int maks = a[fra];
            int maksIndeks = fra;
            for (int j = fra+1; j < til-i; j++){
                if (a[j] > maks){
                    maks = a[j];
                    maksIndeks = j;
                }
            }

            a[maksIndeks] = a[til-1-i];
            a[til-1-i] = maks;
        }
    }

    public static void main(String[] args) {
/*        int[] a = {4,7,1,9,8,0,-5,7, 70, -45, 100, 99};
        System.out.println(Arrays.toString(a));
        utvalgssortering(a,2,6);
        System.out.println(Arrays.toString(a));*/

        int[] b = {9,8,7,6,50,40,3,2,1,0};
        System.out.println(Arrays.toString(b));
        utvalgssortering(b,2,6);
        System.out.println(Arrays.toString(b));

    }
}
