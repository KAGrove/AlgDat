package host23.eksamen;

import java.util.Arrays;

public class Mengde
{
    private int[] a;
    public Mengde() // konstruktør
    {
        a = new int[0];
    }
    public Mengde(int[] b, int n) // konstruktør
    {
        if (n < 0 || n > b.length)
        {
            throw new IllegalArgumentException("n er utenfor tabellen!");
        }

        for (int i = 1; i < n; i++){
            if (b[i-1] >= b[i]){
                throw new IllegalArgumentException("Den er ikke strengt stigende");
            }
        }
        a = Arrays.copyOf(b, n);
    }
    public String toString()
    {
        String ut = "[";
        for (int i = 0; i < a.length; i++){
            ut += a[i];
            if (i != a.length-1){
                ut += ", ";
            } else{
                ut += "]";
            }
        }
        return ut;
    }

    public static void main(String[] args) {
        int[] b = {1,2,5,9,11,13,0,0,0,0};
        Mengde B = new Mengde(b, 6); // de 6 første verdiene i b
        System.out.println(B); // et implisitt kall på toString
// Utskrift: [1, 2, 5, 9, 11, 13]

    }
} // class Mengde
