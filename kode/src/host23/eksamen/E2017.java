package host23.eksamen;

import java.util.ArrayList;

public class E2017 {
    public static int frekvensFordeling(int[] a){
        if (a.length == 0){
            System.out.println(0 + " " + 0);
        }
        int[] b = new int[a.length];

        int j = 0;
        for (int i = 0; i < a.length-1; i++){
            if(b[j] == 0){  // For første nye tall, starte b på 1
                b[j]++;
            }
            if(a[i+1] < a[i]){
                throw new IllegalStateException("Tabellen skal være sortert stigende!");
            }
            else if(a[i+1] == a[i]){
                b[j]++;
            }
            else{
                System.out.println(a[i] + " " + b[j]);
                j++;
            }
        }

        if(a[a.length-1] < a[a.length-2]){
            throw new IllegalStateException("Tabellen skal være sortert stigende!");
        }
        else if(a[a.length-1] == a[a.length-2]){
            System.out.println(a[a.length-1] + " " + b[j]);
        }
        else{
            b[j]++;
            System.out.println(a[a.length-1] + " " + b[j]);
        };

        return 5;
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 4, 5, 5, 6, 7, 7, 7, 8,8,8,8};
        frekvensFordeling(a);
    }
}
