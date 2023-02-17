package kap1_2;

import java.util.Arrays;
import static kap1_2.O_1_2_13_3.kopier;

// 	Gitt tabeller int[] a og int[] b med a.length <= b.length. Lag kode, vha. arraycopy() eller vha. kopier() fra Oppgave 3,
// 	slik at
// 	1) a kopieres inn først i b,
// 	2) a kopieres inn bakerst i b og
// 	3) a kopieres inn på midten av b (gitt at lengdeforskjellen er et partall).

public class O_1_2_13_4 {
    public static void main(String[] args) {
        int [] a = {3,7,1,9};
        int [] b = new int[14];

        System.out.println("Oppgave 1:");
        kopier(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // Restart
        Arrays.fill(b, 0);

        System.out.println("Oppgave 2:");
        kopier(a, 0, b, b.length-a.length, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // Restart
        Arrays.fill(b, 0);

        System.out.println("Oppgave 3:");
        kopier(a, 0, b, (b.length-a.length)/2, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
