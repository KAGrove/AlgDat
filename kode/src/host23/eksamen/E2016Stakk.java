package host23.eksamen;

import hjelpeklasser.Kø;
import hjelpeklasser.Stakk;
import hjelpeklasser.TabellStakk;

public class E2016Stakk {

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

    }

    public static void main(String[] args) {
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
    }
}
