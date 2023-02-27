package host23.eksamen;

import java.util.Arrays;

public class E2016Omorganiser {
    public static int omorganiser(char[] c){
        int v = 0;
        int h = c.length -1;
        int antallLower = 0;
        omorganiser(c, v, h);
        for(int i = 0; i < c.length; i++){
            if(Character.isLowerCase(c[i])){
                antallLower++;
            } else break;
        }
        return antallLower;
    }
    public static void omorganiser(char[] c, int v, int h){
        while (v <= h){
            while(Character.isLowerCase(c[v])){
                v++;
            }
            while (Character.isUpperCase(c[h])){
                h--;
            }
            if(v <= h){
                bytt(c, v, h);
            }
        }
    }
    public static void bytt(char[] c, int v, int h){
        char tmp = c[v];
        c[v] = c[h];
        c[h] = tmp;
    }

    public static void main(String[] args) {
        char[] c = "AbaAcBbAAaCCbcAB".toCharArray();
        int antall = omorganiser(c);
        System.out.println(antall + " " + Arrays.toString(c));
        // Utskrift: 7 [c, b, a, b, c, a, b, A, A, B, C, C, A, A, A, B]

    }
}
