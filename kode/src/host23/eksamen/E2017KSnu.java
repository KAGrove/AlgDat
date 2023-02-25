package host23.eksamen;

import java.util.Arrays;

public class E2017KSnu {
    public static void snu(int[] a){
        if(a.length == 0){
            return;
        }
        for(int i = 0; i < a.length/2; i++){
            int tmp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 5, 1, 3, 6}, b = {};
        snu(a); snu(b);
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
        // Utskrift: [6, 3, 1, 5, 2, 4] []

    }
}
