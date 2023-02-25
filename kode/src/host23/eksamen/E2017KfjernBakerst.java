package host23.eksamen;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;

public class E2017KfjernBakerst {
    public static <T> int fjernBakerst(Kø<T> kø, int antall)
    {
        if (antall < 0) throw new IllegalArgumentException("Negativt antall!");
        int n = kø.antall();
        if (antall >= n)
        {
            kø.nullstill();
            return n;
        }
        for (int i = n - antall; i > 0; i--) kø.leggInn(kø.taUt());
        for (int i = 0; i < antall; i++) kø.taUt();
        return antall;
    }

    public static void main(String[] args) {
        Kø<Character> kø = new LenketKø<>();
        char[] c = "ABCDEFGHI".toCharArray();
        for (char d : c) kø.leggInn(d);
        System.out.println(kø); // [A, B, C, D, E, F, G, H, I]
        int antall = fjernBakerst(kø,5);
        System.out.println(antall + " " + kø); // 5 [A, B, C, D]
        antall = fjernBakerst(kø,5);
        System.out.println(antall + " " + kø); // 4 []
    }
}
