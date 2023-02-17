package kap1_3;

import java.util.Arrays;

// Sett deg inn i metodene copyOf() og copyOfRange() fra klassen Arrays.
// De brukes både til å «utvide» en tabell og til å lage en kopi av hele eller en del av en tabell.

public class O_1_3_8_3 {
    public static void main(String[] args) {
        int[] a = {5,4,3};
        System.out.println(Arrays.toString(a));
        a = Arrays.copyOf(a,2*a.length);
        System.out.println(Arrays.toString(a));

        a = Arrays.copyOfRange(a, 1,4);
        System.out.println(Arrays.toString(a));
    }
}
