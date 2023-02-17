package kap1_1;

public class O_1_1_2 {

    public static int min(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < a[m]) m = i;
        }

        return m;

    }

    public static void main(String[] args) {
        int[] liste = {17,6,9,17};
        System.out.println(min(liste    ));
    }
}


// 1) 6
// 3) >=