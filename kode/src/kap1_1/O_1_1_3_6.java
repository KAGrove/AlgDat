package kap1_1;

public class O_1_1_3_6 {
    public static long fak(int n){
        int fakultet = 1;
        for(int i=n; i>0; i--){
            fakultet = fakultet*i;
        }
        return fakultet;
    }

    public static void main(String[] args) {
        System.out.println(fak(20));
    }
}
