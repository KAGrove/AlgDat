package kap1_2;

import hjelpeklasser.Tabell;

public class O_1_2_2_3 {
    public static void main(String[] args) {
        // Oppg. 1_2_2_3
        char[] b = {'e', 't', 'a', 'm', 's'};
        System.out.println(b);
        Tabell.bytt(b, 1,2);
        System.out.println(b);
    }
}
