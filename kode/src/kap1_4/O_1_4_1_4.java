package kap1_4;

// La a og b være ta variabler av typen Integer. Finn ut f.eks. ved å eksperimentere, hva a.compareTo(b) returnerer.
// Sett så opp den regelen som metoden er kodet etter.

public class O_1_4_1_4 {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 100;
        System.out.println(a.compareTo(b));
    }
}

// Svar: Returnerer 1 hvis b < a, og -1 hvis b > a.
