package eksamen.konte2017;

public class oppg1b {
    public static int finn(int[] a, int verdi){
        int v = 0, h = a.length-1;
        while(v<=h) {
            int m = (v + h) / 2;
            if (a[m] < verdi) {
                v = m + 1;
            } else {
                h = m - 1;
            }
        }
        if (v>h){
            return -(v+1);
        }
        return v;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 10, 12, 12, 15, 18, 20};
        System.out.println( finn(a, 1) ); // utskrift -1
        System.out.println( finn(a, 12) ); // utskrift 5
        System.out.println( finn(a, 16) ); // utskrift -9
        System.out.println( finn(a, 21) ); // utskrift -11


    }
}
