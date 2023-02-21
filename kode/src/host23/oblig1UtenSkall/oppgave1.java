package host23.oblig1UtenSkall;

import java.util.NoSuchElementException;

public class oppgave1 {
    public static int maks(int[] a){
        if(a.length == 0){
            throw new NoSuchElementException("Listen er tom!");
        }
        for(int i = 0; i < a.length-1; i++)
            if(a[i] > a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }
        return a[a.length-1];
    }

    public static int ombyttinger(int[]a){
        if(a.length == 0){
            throw new NoSuchElementException("Listen er tom!");
        }
        int antOmbyttinger = 0;
        for(int i = 0; i < a.length-1; i++)
            if(a[i] > a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
                antOmbyttinger++;
            }
        return antOmbyttinger;
    }

}
