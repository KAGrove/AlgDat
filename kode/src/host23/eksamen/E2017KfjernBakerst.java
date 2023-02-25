package host23.eksamen;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;

public class E2017KfjernBakerst {
    public static <T> int fjernBakerst(Kø<T> kø, int antall){
        int fjernet = 0;
        int size = kø.antall();
        if(antall > kø.antall()){
            while(!kø.tom()){
                kø.taUt();
                fjernet++;
            }
        }

        Kø <T> kø2 = new LenketKø<>();

        while(!kø.tom()){
            kø2.leggInn(kø.taUt());
        }

        if(!kø2.tom()){
            fjernet = antall;
        }
        for(int i = 0; i < size - antall; i++){
            kø.leggInn(kø2.taUt());
        }

        return fjernet;
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
