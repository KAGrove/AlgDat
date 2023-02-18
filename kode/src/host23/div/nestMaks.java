package host23.div;

public class nestMaks {
    static int nestM(int[] a){
        int maksVerdi = 0;
        int nestMaksVerdi = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > maksVerdi){
                nestMaksVerdi = maksVerdi;
                maksVerdi = a[i];
            }
        }
        return nestMaksVerdi;
    }

    public static void main(String[] args) {
        int[] a = {50,10,8,345,8,3};
        System.out.println("Nest største verdi er: " + nestM(a));
    }
}
