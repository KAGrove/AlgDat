package host23.eksamen;

import java.util.ArrayList;

public class E2017 {
    public static void frekvensFordeling(int[] a)
    {
        if(a.length == 0)
        {
            System.out.println(0 + " " + 0);
        }
        int temp = a[0]; //verdien man måler frekvensen til
        int frekvens = 1; //frekvensen for verdien

        for(int i = 1; i < a.length; i++)
        {
            if(temp == a[i]) //sjekker om temp er lik som verdi i tabellen
            {
                frekvens++;
            } else if(temp < a[i])
            {
                System.out.println(temp + " " + frekvens);
                temp = a[i];
                frekvens = 1;
            } else //tabellen er her ikke sortert
            {
                throw new IllegalStateException("Tabellen er ikke sortert");
            }
        }
        //må ha en ekstra utskrift for å få skrevet ut den siste verdien (som også evt. er den eneste)
        System.out.println(temp + " " + frekvens);
    }


    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8,8,8,8};
        frekvensFordeling(a);
    }
}
