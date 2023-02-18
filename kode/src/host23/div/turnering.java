package host23.div;

import java.util.Arrays;

public class turnering {
    static void turner(int[] a){
        int begin = 5;
        for(int i = begin; i>0; i--){
            int left = a[i *2];
            int right = a[i *2+1];
            if(left > right){
                a[i] = left;
            } else a[i] = right;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[12];
        a[6] = 2;
        a[7] = 9;
        a[8] = 8;
        a[9] = 6;
        a[10] = 5;
        a[11] = 3;
        System.out.println(Arrays.toString(a));

        turner(a);
        System.out.println(Arrays.toString(a));

    }
}
