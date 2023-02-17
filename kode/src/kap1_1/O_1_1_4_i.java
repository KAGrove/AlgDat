package kap1_1;

public class O_1_1_4_i {
    public static int maks(int[] a)
    {
        int m = 0;                                          // 1
        int maksverdi = a[0];                               // 1+1

        for (int i = 1; i < a.length; i++)                  // 1+10+9
            if (a[i] > maksverdi) {                         // 9+9
                maksverdi = a[i];                           // 0
                m = i;                                      // 0
            }
        return m;                                           // 1
                                                            // = 1+2+20+18+1=42
    }
    public static void main(String[] args) {
        int[] liste = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        System.out.println(maks(liste));
    }
}
