package kap1_5;

public class O_1_5_1_3 {
    public static int tverrsum(int n)
    {
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(tverrsum(456));
    }
}