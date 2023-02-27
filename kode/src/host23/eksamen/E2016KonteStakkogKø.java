package host23.eksamen;

import hjelpeklasser.*;

public class E2016KonteStakkogKø {

    public static <T> int indeks(Stakk<T> s, T verdi){
        Stakk<T> t = new TabellStakk<>();
        for(int i = 0; !s.tom(); i++){
            if(s.kikk().equals(verdi)){
                return i;
            }
            t.leggInn(s.taUt());
        }
        // Setter tilbake i stakken
        while (!t.tom()){
            s.leggInn(t.taUt());
        }
        return -1;
    }



    public static <T> void flytt(Kø<T> A, Kø<T> B){
        int differanse = A.antall() - B.antall();
        int sizeA = A.antall();
        if(A.tom()){
            return;
        }
        // Annenhver
        for (int i = 0; i < sizeA && !B.tom(); i++){
            A.leggInn(A.taUt());
            A.leggInn(B.taUt());
        }
        //Resten av A
        while (differanse > 0){
            A.leggInn(A.taUt());
            differanse--;
        }
        // Resten av B
        while (!B.tom()){
            A.leggInn(B.taUt());
        }
    }

    public static void main(String[] args) {
        // Indeks:
        Stakk<String> s = new TabellStakk<>(); // en lenket stakk
        String[] navn = {"Ole","Kari","Ali","Eli","Per","Pia"};
        for (String n : navn) s.leggInn(n); // legger inn i s
        System.out.println(s); // skriver ut innholdet
        System.out.println("Pia har indeks " + indeks(s, "Pia"));
        System.out.println("Kari har indeks " + indeks(s, "Kari"));
        System.out.println("Petter har indeks " + indeks(s, "Petter"));
        // Utskrift:
        // [Pia, Per, Eli, Ali, Kari, Ole]
        // Pia har indeks 0
        // Kari har indeks 4
        // Petter har indeks -1

        // Flytt:
        System.out.println();
        System.out.println("Flytt:");
        Kø<String> A = new LenketKø<>(); // oppretter kø A
        Kø<String> B = new TabellKø<>(); // oppretter kø B
        String[] navn1 = {"Per","Kari","Elin","Ali","Jens"};
        String[] navn2 = {"Åse","Ole","Kjersti", "AA", "BB", "DFG","R","A","t"};
        for (String n : navn1) A.leggInn(n); // legger inn i kø A
        for (String n : navn2) B.leggInn(n); // legger inn i kø B
        System.out.println(A + " " + B); // skriver ut A og B
        flytt(A,B); // B flyttes over i A
        System.out.println(A + " " + B); // skriver ut A og B
        // Utskrift: [Per, Kari, Elin, Ali, Jens] [Åse, Ole, Kjersti]
        //[Per, Åse, Kari, Ole, Elin, Kjersti, Ali, Jens] []

    }
}
