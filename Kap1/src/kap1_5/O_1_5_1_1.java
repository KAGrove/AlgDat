package kap1_5;

public class O_1_5_1_1 {
    public static int a(int n)           // n et ikke-negativt tall
    {
        if (n < 0) throw new IllegalArgumentException("n er negativ!");

        int x = 0, y = 1, z = 1;

        for (int i = 0; i < n; i++) {
            z = 2*y + 3*x; x = y; y = z;
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println(a(1));
    }
}
