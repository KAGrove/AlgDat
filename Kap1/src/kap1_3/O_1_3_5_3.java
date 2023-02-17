package kap1_3;

// Hvis verdi forekommer flere ganger i tabellen a, vil posisjonen til den første av dem (fra venstre) bli returnert.
// Lag en versjon av lineærsøk der det er posisjonen til den siste av dem som returneres.
// Gjør det f.eks. ved å lete motsatt vei, dvs. fra høyre mot venstre.

public class O_1_3_5_3 {
    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        int i = a.length-1;
        if (a.length == 0 || verdi < a[0])
            return -1;                          // verdi er mindre enn det minste


        for( ; a[i] > verdi; i--){
            System.out.println(i);              // For å se hva som skjer
        }

        return verdi == a[i] ? i : -(i + 2);
    }

    public static void main(String[] args) {
        int[] a = {3,	8,	10,	12,	14,	16,	21,	24,	27,	30,	33,	33,	34,	37,	40};
        System.out.println("Det er: " +lineærsøk(a, 3));
    }
}