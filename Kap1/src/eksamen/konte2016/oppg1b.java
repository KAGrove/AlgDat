package eksamen.konte2016;

import hjelpeklasser.Kø;
import hjelpeklasser.LenketKø;
import hjelpeklasser.TabellKø;

public class oppg1b {
    public static <T> void flytt(Kø<T> A, Kø<T> B){
        Kø<T> hjelp = new LenketKø<>();

        while(!A.tom() && !B.tom()){
            hjelp.leggInn(A.taUt());
            hjelp.leggInn(B.taUt());
        }
        while(!A.tom()){
            hjelp.leggInn(A.taUt());
        }
        while(!B.tom()){
            hjelp.leggInn(B.taUt());
        }
        while(!hjelp.tom()){
            A.leggInn(hjelp.taUt());
        }
    }

    public static void main(String[] args) {
        Kø<String> A = new LenketKø<>(); // oppretter kø A
        Kø<String> B = new TabellKø<>(); // oppretter kø B
        String[] navn1 = {"Per","Kari","Elin","Ali","Jens"};
        String[] navn2 = {"Åse","Ole","Kjersti"};
        for (String n : navn1) A.leggInn(n); // legger inn i kø A
        for (String n : navn2) B.leggInn(n); // legger inn i kø B
        System.out.println(A + " " + B); // skriver ut A og B
        flytt(A,B); // B flyttes over i A
        System.out.println(A + " " + B); // skriver ut A og B
        // Utskrift: [Per, Kari, Elin, Ali, Jens] [Åse, Ole, Kjersti]
        // [Per, Åse, Kari, Ole, Elin, Kjersti, Ali, Jens] []
    }
}
