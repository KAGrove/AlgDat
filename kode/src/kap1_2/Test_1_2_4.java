package kap1_2;

// Forøk på å finne nest største verdi uten sortering

public class Test_1_2_4 {
    public static void main(String[] args) {
        int [] a = {5,13,2,55, 33, 45, 15, 12, -45};
        int maks = a[0];
        int nestMaks = maks;
        int temp = 0;
        for (int i = 1; i<a.length; i++){
            if (a[i] > maks){
                temp = maks;
                maks = a[i];
            }
            if (a[i] > nestMaks && a[i] != maks){
                nestMaks = a[i];
            }
            if (temp > nestMaks){
                nestMaks = temp;
            }
        }
        System.out.println(nestMaks);
    }
}
