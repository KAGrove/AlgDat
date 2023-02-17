package kap1_3;

// Sjekk at metoden lineærsøk gir korrekt returverdi hvis det søkes etter en verdi som er mindre enn den minste i tabellen.
// Hva skjer hvis tabellen er tom, dvs. a.length = 0? La a være tabellen i Figur 1.3.5 a).
// Hva blir returverdiene fra lineærsøk hvis vi søker etter
// 2 -> -1
// 15 -> -6
// 16 -> 5
// 40 -> 14
// 41 -> -16

public class O_1_3_5_2 {
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0; for( ; a[i] < verdi; i++);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }

    public static void main(String[] args) {
        int[] a = {3,	8,	10,	12,	14,	16,	21,	24,	27,	30,	32,	33,	34,	37,	40};
        System.out.println(lineærsøk(a, 1));
    }
}
