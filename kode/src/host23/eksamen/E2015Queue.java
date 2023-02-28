package host23.eksamen;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;

public class E2015Queue {
    public static <T> void byttPlass(Kø<T> kø, int indeks){
        if(indeks < 0 || indeks >= kø.antall()-1){
            throw new IndexOutOfBoundsException("Ulovelig indeks!");
        }
        int n = kø.antall();
        for(int i = 0; i < indeks; i++){
            kø.leggInn(kø.taUt());
        }
        T p = kø.taUt();
        kø.leggInn(kø.taUt());
        kø.leggInn(p);

        for (int i = indeks+2; i < n; i++){
            kø.leggInn(kø.taUt());
        }
    }

    public static void main(String[] args) {
        String[] person = {"Per","Kari","Elin","Ali","Jens","Siri"};
        Kø<String> kø = new LenketKø<>();
        for (String p : person) kø.leggInn(p); // legger inn i køen
        System.out.println(kø); // [Per, Kari, Elin, Ali, Jens, Siri]
        byttPlass(kø, 4); // den på indeks 4 bytter plass med den rett bak (indeks 5)
        System.out.println(kø); // [Per, Kari, Elin, Ali, Siri, Jens]
    }
}
