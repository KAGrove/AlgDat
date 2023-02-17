package forelesninger;

public class F6_Recursion2_Fakultet {
    public static void main(String[] args) {
        System.out.println("Rekursjon!");
        countDown(10);

        // Fakultet
        System.out.println();
        System.out.println(factorial(5));
        for (int k = 0; k<=30; k++){
            System.out.println(k + "! = " + factorial(k));
        }
    }

    public static void countDown(int n){

        //Basistilfelle:
        if (n == 0){
            System.out.println(n + " \nlift-off!");
            return;
        }

        // Enklere kall
        System.out.println(n + " ...");
        countDown(n-1);
    }

    public static int factorial (int n){
        if (n == 0){ // Basistilfelle
            return 1;
        }

        return n * factorial(n-1);

    }
}
