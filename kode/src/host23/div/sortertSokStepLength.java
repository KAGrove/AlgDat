package host23.div;

import java.util.Arrays;

public class sortertSokStepLength {
    static int sok(int[] a, int value){
        int step_length = 2;
        for (int i=0; i<a.length; i=i+step_length){
            if (a[i] >= value){
                int begin = i - step_length;    // Skjønner ikke helt hvorfor vi går så langt tilbake, virker unødvendig?
                int end = i + 1;
                for (int j = begin; j < end; j++){
                    if(a[j] == value){
                        return j;
                    }
                }
                return  -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,7,9,10,12,14,16,20,40,100};
        System.out.println(sok(a, 9));
    }
}
