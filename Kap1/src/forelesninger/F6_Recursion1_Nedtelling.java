package forelesninger;

public class F6_Recursion1_Nedtelling {
    public static void main(String[] args) {
        System.out.println("Rekursjon!");
        countDown(10);
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
}
