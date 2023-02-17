package kap1_5;

// 	Lag en rekursiv metode som finner n! (dvs. n fakultet) når n er parameterverdi.

public class O_1_5_1_10 {
    public static int fakultet(int n){
        if (n == 1) return n;
        else return fakultet(n-1) * n;
        }

    public static void main(String[] args) {
        System.out.println(fakultet(5));
    }
}
