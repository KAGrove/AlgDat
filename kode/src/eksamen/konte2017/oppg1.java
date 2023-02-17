package eksamen.konte2017;

import java.util.Arrays;

public class oppg1 {
    public static void snu(int[] a){
        if(a.length == 0){
            return;
        }
        for(int i = 0; i < a.length / 2; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,5,1,3,6}, b ={};
        snu(a); snu(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
