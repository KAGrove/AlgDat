package host23.eksamen;

public class E2017KBinarFinn {
    public static int finn(int[] a, int verdi){
        int v = 0, h = a.length-1;
        int forsteIndeks = 0;
        boolean finnes = false;
        int level = 0;
        double log2 = Math.log(a.length) / Math.log(2);

        while((v <= h) && level <= log2){
            int m = (v + h) / 2;
            int midtverdi = a[m];

            if(verdi == midtverdi){
                forsteIndeks = m;
                finnes = true;
            }
            else if(verdi > midtverdi){
                v = m+1;
            }
            else{
                h = m-1;
            }
            level++;
        }
        if(finnes){
            return forsteIndeks;
        }
        else{
            return -(v+1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 10, 12, 12, 15, 18, 20};
        System.out.println( finn(a, 1) ); // utskrift -1
        System.out.println( finn(a, 12) ); // utskrift 5
        System.out.println( finn(a, 16) ); // utskrift -9
        System.out.println( finn(a, 21) ); // utskrift -11

    }
}
