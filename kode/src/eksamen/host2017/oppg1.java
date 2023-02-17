package eksamen.host2017;

public class oppg1 {
    public static void frekvensFordeling(int[] a){
        if(a.length == 0){
            System.out.println(0 + " " + 0);
        }

        int antall = 1;
        for(int i = 0; i < a.length; i++){
            if(i != a.length-1 && a[i] > a[i+1]){
                throw new IllegalStateException("Tabellen skal være stigende");
            }
            if(i != a.length-1 && a[i] == a[i+1]){
                antall++;
                if(a[i] != a[i+1]){
                    System.out.println(a[i] + " " + antall);
                    antall = 1;
                }
            } else{
                System.out.println(a[i] + " " + antall);
                antall = 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8};
        frekvensFordeling(a);
    }
}
