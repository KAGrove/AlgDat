package kap1_5;

// Bruk Programkode 1.5.1 h) til å finne Fibonacci-tall nr. 20, 30, 40 og 50. Hva skjer?

public class O_1_5_1_11 {
    public static int fib(int n)         // det n-te Fibonacci-tallet
    {
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }

    public static void main(String[] args) {
        System.out.println(fib(20));
    }
}
