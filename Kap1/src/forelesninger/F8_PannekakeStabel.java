package forelesninger;

import java.util.Deque;

public class F8_PannekakeStabel {
    public static void main(String[] args) {
        System.out.println("Setter main-tallerkene på bordet!");
        spisPannekaker(3);
        System.out.println("Nam!");
        System.out.println("Vasker opp main-tallerkenen!");

/*        Deque<Integer>;*/ // For å se på kildekoden. addFirst() har ikke en metode, fordi det er et interface
        //LinkedList: push -> addFirst -> linkFirst/Before
        // Pop -> remove
    }

    static void spisPannekaker(int n){
        System.out.println("Steker pannekake " + n + " og legger på main-tallerkene");
        if (n>1)spisPannekaker(n-1);
        System.out.println("Pannekake " + n + " var god!");
    }
}
