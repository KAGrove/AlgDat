package kap1_5;

// Lag en rekursiv metode som finner summen av kvadrattallene fra 1 til n, dvs. finner summen 12 + 22 + 32 + . . . + n2.
// Kjenner du noen formel for den samme summen?

// ??????????????????????????????????????????????????????????

public class O_1_5_1_7 {
    public static int kvadrattall(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static int kvadrattallRekursjon(int n){
        if (n == 1) return 1;
        else return kvadrattallRekursjon(n-1) - n*n;
    }

    public static void main(String[] args) {
        System.out.println(kvadrattallRekursjon(5));
    }
}
