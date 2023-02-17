package obliger;

public class Oblig1_5 {
    public static void rotasjon(char[] a) {
        /*        throw new UnsupportedOperationException();*/

        for (int i = 0; i < a.length-1; i++) {
            char temp = a[i];
            a[i] = a[a.length - 1];
            a[a.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char [] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.println(a);
        rotasjon(a);
        System.out.println(a);
    }
}
