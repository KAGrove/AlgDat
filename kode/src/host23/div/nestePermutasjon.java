package host23.div;

import java.util.Arrays;

public class nestePermutasjon {
    static int[] neste(int[] liste) {
        int i = liste.length - 1;
        while (i >= 0) {
            if(i != liste.length-1){

            }
            if (liste[i] > liste[i - 1]) {
                int tmp = liste[i - 1];
                liste[i - 1] = liste[i];
                liste[i] = tmp;
                break;
            } else{
                i--;
            }
        }
        return liste;
    }

    public static void main(String[] args) {
        int[]liste = {7,8,9,10,5};
        System.out.println(Arrays.toString(liste));
        neste(liste);
        System.out.println(Arrays.toString(liste));
    }
}
