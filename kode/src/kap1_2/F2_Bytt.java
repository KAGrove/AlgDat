package kap1_2;

// Hvordan bruke maksmetoden (fra forrige kode) til å sortere en tabell i stigende rekkefølge?

import java.util.Arrays;

public class F2_Bytt {

    public static void bytt(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int maks (int[] a, int fra, int til){
        int mix = fra;
        int maksverdi = a[mix];
        for(int i = fra+1; i<til; i++){
            if(a[i] > maksverdi){
                maksverdi = a[i];
                mix = i;
            }
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 7, 999, 12, 45, 45345, 0, -56};

        for(int i = a.length; i>1; i--){
            int mix = maks(a, 0, i);
            bytt(a, i-1, mix);
            System.out.println(Arrays.toString(a));
        }
        System.out.println(a[a.length-2]); // Finner nest siste tall
    }
}
