package kap1_1;

public class O_1_1_4_ii {
    public static int maks(int[] a)
    {
        int m = 0;                                          // 1
        int maksverdi = a[0];                               // 1+1

        for (int i = 1; i < a.length; i++)                  // 1+10+9
            if (a[i] > maksverdi) {                         // 9+9
                maksverdi = a[i];                           // 9+9
                m = i;                                      // 9
            }
        return m;                                           // 1
                                                            // = 1+2+20+18+18+9+1=69
    }
    public static void main(String[] args) {
        int[] liste = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maks(liste));
    }
}
