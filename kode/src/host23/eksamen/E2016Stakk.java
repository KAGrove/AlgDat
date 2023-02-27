package host23.eksamen;

import hjelpeklasser.Stakk;
import hjelpeklasser.TabellStakk;

public class E2016Stakk {
    public static <T> void omvendtkopi(Stakk<T> a, Stakk<T> b){
        Stakk<T> hjelp = new TabellStakk<>();
        while (!a.tom()){
            hjelp.leggInn(a.kikk());
            b.leggInn(a.taUt());
        }

        // Legger tilbake
        while (!hjelp.tom()){
            a.leggInn(hjelp.taUt());
        }
    }

    public static void main(String[] args) {
        Stakk<String> a = new TabellStakk<>(), b = new TabellStakk<>();
        a.leggInn("C"); a.leggInn("B"); a.leggInn("A");
        System.out.println(a + " " + b); // utskrift: [A, B, C] []
        omvendtkopi(a,b);
        System.out.println(a + " " + b); // utskrift: [A, B, C] [C, B, A]

    }
}
