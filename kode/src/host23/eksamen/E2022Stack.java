package host23.eksamen;

import java.util.Stack;

public class E2022Stack {
    public static <T> int indeks(Stack s, T val){
        if(s.empty()){
            throw new IllegalArgumentException("Stakken er tom!");
        }
        Stack s2 = new Stack<>();
        int lengde = s.size();  // Måtte lage en egen variabel ettersom s.size() minker inni løkken
        int i = 0;
        while (i < lengde){
            if (!s.peek().equals(val)){
                s2.push(s.pop());
                i++;
            }
            else{
                break;
            }
        }
        while (!s2.empty()){
            s.push(s2.pop());
        }

        if(i != lengde){
            return i;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack<>(); // en stack
        // Lag pannekakestabel der hvert element er en streng som beskriver pannekaka
        String[] pannekaker = {"Svidd","Rå","Kald","Glovarm","Perfekt"};
        for (String p : pannekaker) s.push(p); // legger inn i s
        System.out.println("Pannekake " + indeks(s, "Svidd") + " er svidd!");
        System.out.println("Pannekake " + indeks(s, "Kald") + " er kald!");
        System.out.println("Pannekake " + indeks(s, "Perfekt") + " er perfekt!");
        System.out.println("Pannekake " + indeks(s, "Lunken") + " er lunken (finnes ikke i stabelen)!");
// Utskrift:
// Pannekake 4 er svidd!
// Pannekake 2 er kald!
// Pannekake 0 er perfekt!
// Pannekake -1 er lunken (finnes ikke i stabelen)!
    }

}
