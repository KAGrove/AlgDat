package kap1_3;

import java.util.Arrays;

// utvalgssortering i Programkode 1.3.4 a) bruker to hjelpemetoder. Det er mest vanlig å kode den uten hjelpemetoder.
// Søk på internett. Bruk «selection sort» som søkeord. Lag så din egen versjon (uten hjelpemetoder)!
// Hvor lang tid bruker den for en tilfeldig tabell med 100000 verdier? Er den bedre enn den fra Programkode 1.3.4 a)?

public class O_1_3_4_5 {
    void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }


    // driver code
    public static void main(String args[]) {
        int[] data = {20, 12, 10, 15, 2};
        O_1_3_4_5 ss = new O_1_3_4_5();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}