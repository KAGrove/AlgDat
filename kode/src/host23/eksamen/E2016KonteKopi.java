package host23.eksamen;

import java.util.Arrays;
import java.util.Comparator;

public class E2016KonteKopi {
    public static <T> SBinTre2<T> kopi(SBinTre2<T> tre)
    {
        T[] a = (T[]) new Object[tre.antall()]; // hjelpetabell
        int i = 0; for (T x : tre) a[i++] = x; // fra tre til tabell
        Arrays.sort(a, (x, y) -> tre.dybde(x) - tre.dybde(y)); // et lambda-uttrykk
        SBinTre2<T> kopi = new SBinTre2<T>(tre.comparator()); // kopitreet
        for (T x : a) kopi.leggInn(x); // fra tabell til tre
        return kopi;
    }


    public static void main(String[] args) {
        SBinTre2<Integer> tree = new SBinTre2<>(Comparator.naturalOrder());
        tree.leggInn(5);
        tree.leggInn(3);
        tree.leggInn(7);
        tree.leggInn(1);
        tree.leggInn(4);
        tree.leggInn(6);
        tree.leggInn(8);

        System.out.println("Original tree:");
        for (Integer i : tree) {
            System.out.print(i + " ");
        }

        SBinTre2<Integer> copy = kopi(tree);
        System.out.println("\nCopy of the tree sorted by depth:");
        for (Integer i : copy) {
            System.out.print(i + " ");
        }
    }
}
