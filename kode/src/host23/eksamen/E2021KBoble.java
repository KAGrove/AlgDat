package host23.eksamen;

public class E2021KBoble {
    static void bubbleSort(int[] a) {
        int end = a.length-1;
        for (int begin=0; begin < end; ++begin) {
            for (int i = begin; i < end; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    }
            }
        }
    }
}
