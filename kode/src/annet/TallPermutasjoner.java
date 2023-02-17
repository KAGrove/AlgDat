package annet;

import java.util.Arrays;

public class TallPermutasjoner {
    static int countoccurrences(int n,
                                int d)
    {
        int count = 0;

        // Loop to find the digits of N
        while (n > 0)
        {

            // check if the digit is D
            count = (n % 10 == d) ?
                    count + 1 : count;
            n = n / 10;
        }

        // return the count of the
        // occurrences of D in N
        return count;
    }

    public static void main(String[] args) {
        int antallTreere = 0;
        int [] a = new int[9000];
        for(int i = 0; i < a.length; i++ ){
            a[i] = 1000+i;
            antallTreere += countoccurrences(a[i], 3);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(antallTreere);
    }
}
