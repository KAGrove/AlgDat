package obliger;

public class Oblig1_10_Test2 {
    public static int bokstavNr(char bokstav) {
        //throw new UnsupportedOperationException();
        char[] alfabetet = new char [] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'
        };
        int[] ascii = new int [] {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 146, 156, 143
        } ;
        //List<char[]> alfabetet_liste = Arrays.asList(alfabetet);
        int bokstavNr = -1;
        for (int i = 0; i < alfabetet.length; i++) {
            if (bokstav == alfabetet[i]) {
                int indeks = i;//indeksen til bokstaven i arrayet
                bokstavNr = ascii[indeks];
            }
        }
        return bokstavNr;
    }

    public static boolean inneholdt(String a, String b) {
        //throw new UnsupportedOperationException();
        boolean inneholdt = false;
        char[] a_array = a.toCharArray(); //instansierer array av lik lengde som ordet
        char[] b_array = b.toCharArray();

        int[] hjelpearray_a = new int[a_array.length]; //bytter bokstavene med ascii-verdi og legger til hjelpearray
        for (int k = 0; k < a_array.length; k++) {
            hjelpearray_a[k] = bokstavNr(a_array[k]);
        }
        int[] hjelpearray_b = new int[b_array.length];
        for (int l = 0; l < b_array.length; l++) {
            hjelpearray_b[l] = bokstavNr(b_array[l]);
        }
        for (int i = 1; i < hjelpearray_a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (hjelpearray_a[i] != hjelpearray_b[j]) {
                    inneholdt = true;
                    hjelpearray_b[j] = -1;
                    break;
                }
            }
        }
        return inneholdt;
    }

    public static void main(String[] args) {
        String a = "ABBA";
        String b = "AKRBA";

        System.out.println(inneholdt(a,b));
    }
}
