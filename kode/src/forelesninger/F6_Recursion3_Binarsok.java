package forelesninger;

public class F6_Recursion3_Binarsok {
    public static void main(String[] args) {
        int[] x = {0,2,4,6,9,12,13,99};
        System.out.println(binarsok(x, 7));
        for (int xi : x){
            System.out.println("Verdi " + xi + " er i indeks " + binarsok(x, xi));
        }
    }

    public static int binarsok(int[] x, int verdi, int v, int h){
        if (v == h){    // Basistilfelle, bladnode (funnet/ikke funnet)
/*            return (verdi == x[v]) ? v : -1;*/ // Alternativ kompakt if-else
            if (x[v] == verdi){
                return v;
            }
            else {
                return -v+1;  // Håndterer indekser som
            }
        }

        int m = (v + h) / 2;    // Finn midten, heltallsdivisjon

        if (verdi == x[m]){     // Basistilfelle, alle noder (funnet)
            return m;
        }

        if (verdi > x[m]){
            return binarsok(x, verdi, m+1, h);  // Enklere kall
        }
        else {
            return binarsok(x, verdi, v, m-1);  // Enklere kall
        }
    }

    public static int binarsok(int[] x, int verdi){
        return binarsok(x, verdi, 0, x.length-1);
    }
}
