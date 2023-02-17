package eksamen.konte2022;

public class boblesortering {
    static void bubbleSort(int[] a){
        int end = a.length;
        for (int begin=0; begin < end; begin++){
            for (int i = begin; i < end; i++){
                if(a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a [i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        bubbleSort(a);
    }
}
