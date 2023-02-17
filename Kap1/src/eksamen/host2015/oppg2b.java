package eksamen.host2015;

// Fikk det til, men ikke spesielt effektiv.

import java.util.Arrays;

public class oppg2b {
    public static int fjernDuplikater(int[] a){
        int forskjelligeVerdier = 0;
        int fjernet = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] == 0) return forskjelligeVerdier;
            if(a[i] == a[i+1]){
                int[] b = new int[a.length-(i+1)];
                for(int j = 0; j < b.length; j++){
                    b[j] = a[i+j+1];
                }
                for(int j = 0; j < b.length; j++){
                    a[i+j] = b[j];
                }
                if(a[i] == a[i+1]) i--;
                fjernet++;
                a[a.length-fjernet] = 0;
            }
            forskjelligeVerdier++;
        }
        return forskjelligeVerdier;
    }

    public static int fjernDuplikaterFasit1(int[] a) {
        if(a.length == 0) return 0; // ingen forskjellige verdier
        int j = 1;
        for (int i = 1; i < a.length; i++) {
            // hvis a[i - 1] == a[i], tas ikke a[i] med
            if (a[i - 1] != a[i])
                a[j++] = a[i];
        }
        // nuller resten av tabellen
        for (int i = j; i < a.length; i++)
            a[i] = 0;
        return j; // antall forskjellige verdier
    }


    public static void main(String[] args) {
        int[] a = {1,3,5,5,6,8,8,8,9,10,10}; // en sortert tabell med duplikater
        int antall = fjernDuplikaterFasit1(a); // kaller metoden
        System.out.println(antall + ": " + Arrays.toString(a)); // antallet og tabellen
        // Utskrift: 7: [1, 3, 5, 6, 8, 9, 10, 0, 0, 0, 0]

    }
}
