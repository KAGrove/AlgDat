package host23.oblig1;

public class oppgave1 {
    public static int maks(int[] a){
        for(int i = 0; i < a.length-1; i++)
            if(a[i] > a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
        }
        return a[a.length-1];
    }
}
