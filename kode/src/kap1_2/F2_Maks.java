package kap1_2;

// Lag en maksmetode som returnerer indeks til største element i intervallet [fra, til) for en tabell a

public class F2_Maks {
    public static int maks (int[] a, int fra, int til){
        int mix = fra;   // mix = max_index
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
        int[] liste = {5,3,8,6,9};
        System.out.println(maks(liste, 1,5));
    }
}
