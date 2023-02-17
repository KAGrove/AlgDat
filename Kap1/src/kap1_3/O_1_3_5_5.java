package kap1_3;

// 	I lineærsøk sammenlignes én og én tabellverdi med verdi. Algoritmen stopper på verdi hvis den finnes og på den
// 	første som er større hvis den ikke finnes. Dette kan forbedres hvis vi «hopper» bortover i tabellen.
// 	La oss si at tabellen a har 100 verdier. Da kan vi f.eks. se på hver 10-ende verdi inntil vi har kommet langt nok
// 	(eller eventuelt havnet utenfor tabellen). Den søkte verdien må da, hvis den er i tabellen, ligge blant de 10 siste
// 	verdiene vi hoppet over.

import java.util.Arrays;

public class O_1_3_5_5 {
    public static int lineærsøk(int[] a, int verdi) {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);

        int i = 0;
        int j = 0;
        for( ; a[i] < a.length-1 && a[i] < verdi; i+=10){
            System.out.println("i = " + i);
        }
        if (a[i] != verdi){         // Gjør at vi ikke går inn i neste løkke hvis vi allerede har funnet tallet vårt
            if (i==0){              // Ordner tilfeller der verdi < a[0]
                i+=10;
            }
            for (j = i-10; a[j] < verdi; j++){
                System.out.println("j = " + j);
            }
        }
        else{
            j=i;
        }

        return verdi == a[j] ? j : -(j + 1);
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        int indeks = 0;
        for (int i = 2; indeks < 100; i = i+2){
            a[indeks] = i;
            indeks++;
        }
        System.out.println(Arrays.toString(a));

        System.out.println(lineærsøk(a, 3));
    }
}
