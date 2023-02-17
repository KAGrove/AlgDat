package obliger;

public class Oblig1_10 {
    public static boolean inneholdt(int [] a, int [] b) {
        boolean funnet = false;
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < b.length-1; j++){
                if (a[i] == b[j]){
                    b[j] = -1;
                    funnet = true;
                    break;
                }
                else{
                    funnet = false;
                }
            }
            if (!funnet) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,5,1};
        int[] b = {5,3,1,5,0,1};

        System.out.println(inneholdt(a,b));
    }
}
