package obliger;

public class Oblig1_6 {
    public static void rotasjon(char[] a, int k) {
        /*        throw new UnsupportedOperationException();*/

        for (int j = 0; j < k; j++){
            for (int i = 0; i < a.length; i++) {
                char temp = a[0+i];
                a[0+i] = a[a.length - 1];
                a[a.length - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        char [] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.println(a);
        rotasjon(a,3);
        System.out.println(a);
    }
}
