package host23.eksamen;

public class E2015KonteToString {
    public static String toString(int[] a){
        if(a.length <= 0){
            return "[]";
        }
        String ut = "[";
        for(int i = 0; i < a.length-1; i++){
            ut += a[i] + ", ";
        }
        ut += a[a.length-1] + "]";
        return ut;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {5};
        int[] c = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(toString(a) + " " + toString(b) + " " + toString(c));
        // Utskrift: [] [5] [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
