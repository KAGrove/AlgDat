package eksamen.host2015;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;

public class oppg1a {
    public static <T> void byttPlass(Kø<T> kø, int indeks)
    {
        if (indeks < 0 || indeks >= kø.antall() - 1)
            throw new IllegalArgumentException("Ulovlig indeks!");
        for (int i = 0; i < kø.antall()-1; i++)
        {
            if (i == indeks)
            {
                T temp = kø.taUt();
                kø.leggInn(kø.taUt());
                kø.leggInn(temp);
            }
            else kø.leggInn(kø.taUt());
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
