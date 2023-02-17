package tester;

public class Rekursjon {
    public static void main(String[] args) {
        int [] x = {4,6,9,23,7};
        rekursjon(x, 0);
    }


    public static void rekursjon(int [] x, int i){
        System.out.println(x[i]);
        if (i < x.length-1){
            rekursjon(x, i+1);
        }

    }
}
