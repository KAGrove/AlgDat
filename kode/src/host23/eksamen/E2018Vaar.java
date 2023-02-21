package host23.eksamen;

public class E2018Vaar {
    public static int ukjent(int[] a, int[] b, int[] c)
    {
        int i = 0, j = 0, k = 0;
        while ( i < a.length && j < b.length)
        {
            if (a[i] < b[j]) c[k++] = a[i++];
            else if (a[i] == b[j]) { i++; j++; }
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        return k;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,9};
        int[] b = {2,3,5,6,8};
        int[] c = new int[a.length + b.length];
        int k = ukjent(a,b,c);
        for (int i = 0; i < k; i++) System.out.print(c[i] + " ");
    }

}
