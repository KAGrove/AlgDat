package kap1_3;

// 	Lag kode som viser tidsforbruket til innsettings- og utvalgssortering.
// 	Den første har bare halvparten så mange sammenligninger, men har flere ombyttinger (eller tilordninger).

// Bare copy-pastet fasit.

import hjelpeklasser.Tabell;

public class O_1_3_8_6 {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(100000);
        int[] b = a.clone();
        long tid1 = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid1 = System.currentTimeMillis() - tid1;

        long tid2 = System.currentTimeMillis();
        Tabell.innsettingssortering(b);
        tid2 = System.currentTimeMillis() - tid2;

        System.out.println("Utvalgssortering: " + tid1);
        System.out.println("Innsettingssortering: " + tid2);
    }
}
