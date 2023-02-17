package kap1_2;

import java.util.Arrays;

// skal virke som arraycopy() fra class System (fra oppg. 1). Lag den!

public class O_1_2_13_3 {
    public static void kopier(int[] a, int i, int[] b, int j, int ant){
        for (int n = i + ant; i < n;){
            b[j++] = a[i++];
        }
    }

    public static void main(String[] args) {
        int [] a = {3,7,1,9};
        int [] b = new int[7];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        kopier(a, 0, b, b.length-a.length, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
