package kap1_5;

public class P_1_5_1b {
    public static int tverrsum(int n)              // n må være >= 0
    {

        if (n < 10) return n;                        // kun ett siffer
        else{
            int out = tverrsum(n / 10) + (n % 10);     // metoden kalles
            return out;
        }
    }

    public static void main(String[] args) {
        System.out.println(tverrsum(1234));
    }
}
