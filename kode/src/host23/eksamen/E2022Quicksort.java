package host23.eksamen;

import java.util.Arrays;

import static hjelpeklasser.Tabell.bytt;

public class E2022Quicksort {
    // R til venstre, H i midten, B til høyre
    public static void omorganiser(char[] c){
        int v = 0, h = c.length-1, k = h;
        while (v <= k){
            if (c[k] == 'R') bytt(c,v++,k);
            else if (c[k] == 'H') k--;
            else bytt(c,h--,k--);
        }
    }
    public static int[] parterMLS(int[] x, int v, int h) {
        int pivot = x[h];   // Sett skilleverdi lik siste element
        int k = h;
        while(v <= k){
            if(x[k] < pivot){
                bytt(x, v++, k);
            }
            else if(x[k] == pivot){
                k--;
            }
            else{
                bytt(x, h--, k--);
            }

        }
        return new int[] {v, h}; // Returner indeks til første og siste element lik skilleverdi
    }

    public static void main(String[] args) {
        int[] x = {3,4,1,3,4,2,2,1,2,4,3};
        int[] pindeks = parterMLS(x, 0, x.length-1);
        System.out.println(Arrays.toString(pindeks));
    }

}
