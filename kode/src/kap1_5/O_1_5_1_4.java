package kap1_5;

import static kap1_5.O_1_5_1_3.tverrsum;

public class O_1_5_1_4 {
    public static int sifferrot(int n){
        while (n >= 10){
            n = tverrsum(n);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sifferrot(45678));
    }
}
