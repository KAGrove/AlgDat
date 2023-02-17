package kap1_1;

public class O_1_1_3_6_While {
    public static long fak(int n){
        int fakultet = 1;
        while(n>0){
            fakultet *=n;
            n--;
        }
        return fakultet;
    }

    public static void main(String[] args) {
        System.out.println(fak(4));
    }
}
