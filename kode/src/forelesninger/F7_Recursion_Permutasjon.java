package forelesninger;

import java.util.Arrays;

import static forelesninger.F6_Recursion3_Binarsok.binarsok;

public class F7_Recursion_Permutasjon {
    public static void main(String[] args) {
        int[] p = {1,2,3, 4, 5, 6};
        permutasjon(p);
/*        for (int xi : x){
            System.out.println("Verdi " + xi + " er i indeks " + binarsok(x, xi));
        }*/
    }

    public static void permutasjon(int[] x, int k){
        if (k == x.length){ // Basistilfelle
            System.out.println(Arrays.toString(x));
            return;
        }

        for (int i = k; i < x.length; i++){
            swap(x, i, k);
            // Enklere kall
            permutasjon(x, k+1);
            swap(x, k, i);
        }
    }

    public static void permutasjon(int[] x){
        permutasjon(x, 0);
    }

    public static void swap(int[] x, int i, int j){
        int tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }
}
