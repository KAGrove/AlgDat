package kap1_4;

// 	Finn ut, ved å eksperimentere, hva metoden compareTo i class String returnerer. Du kan f.eks. lage et program som inneholder:
//  String s = "A", t = "B";
//  System.out.println(s.compareTo(t));

//  Se hvilket tall utskriften gir. Bytt så ut A og B med andre bokstaver, og se om du finner et mønster.
//  Hva blir det hvis s = "A" og t = "a" ? Hvilket tall gir utskriften hvis s = "Æ" og t = "Å" ? Hva
//  hvis s = "Ø" og t = "Å" ? (Se også Avsnitt 1.4.10). Bruk så ord istedenfor enkelttegn. Se spesielt på
//  situasjonen der s utgjør første del av t eller t første del av s, for eksempel s = "Karianne" og t = "Kari".
//  Kildekoden til class String vil gi deg fasiten.

public class O_1_4_1_5 {
    public static void main(String[] args) {
        String s = "Z", t = "Æ";
        System.out.println(s.compareTo(t));
    }
}

// Svar: Metoden compareTo returnerer da differansen mellom ascii-verdiene til disse to tegnene.
