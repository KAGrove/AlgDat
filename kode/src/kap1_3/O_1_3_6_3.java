package kap1_3;

// Gitt at søkeverdien har duplikater. Bruker vi 1. eller 2. versjon av binærsøk, vet vi ikke hvem av dem som den
// returnerte indeksen hører til. Gitt verdiene: 1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15. Bruk 1. versjon.
// Søk etter
// i) 4     - Den siste
// ii) 7    - Den siste
// iii) 10  - Den siste
// iv) 15.  - Den i midten
//
// Hvilken av verdiene hører den returnerte indeksen til? Obs. Det er det samme
// om det er 1. eller 2. versjon. De gir alltid de samme returverdi.

// Lol, fasit bruker en annen tabell....

import hjelpeklasser.Tabell;

public class O_1_3_6_3 {
    public static int binærsøk(int[] a, int fra, int til, int verdi) // Programkode 1.3.6 a)
    {
        Tabell.fratilKontroll(a.length,fra,til);  // se Programkode 1.2.3 a)
        int v = fra, h = til - 1;  // v og h er intervallets endepunkter

        while (v <= h)    // fortsetter så lenge som a[v:h] ikke er tom
        {
            int m = (v + h)/2;      // heltallsdivisjon - finner midten
            int midtverdi = a[m];   // hjelpevariabel for midtverdien

            if (verdi == midtverdi) return m;          // funnet
            else if (verdi > midtverdi) v = m + 1;     // verdi i a[m+1:h]
            else  h = m - 1;                           // verdi i a[v:m-1]
        }

        return -(v + 1);    // ikke funnet, v er relativt innsettingspunkt
    }

    public static int binærsøk(int[] a, int verdi)  // søker i hele a
    {
        return binærsøk(a,0,a.length,verdi);  // bruker metoden over
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
        System.out.println(binærsøk(a, 4));
        System.out.println(binærsøk(a, 7));
        System.out.println(binærsøk(a, 10));
        System.out.println(binærsøk(a, 15));
    }
}
