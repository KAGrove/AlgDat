package kap1_5;

public class P_1_5_3b {
    public static int sum(int k, int n)  // summen av tallene fra k til n
    {
//        System.out.println("sum(" + k + n + ") starter!");
        if (k == n) return k;              // summen av ett tall
        int m = (k + n)/2;                 // det midterste tallet
        int summen = sum(k,m) + sum(m+1,n);
//        System.out.println("sum(" + k + n + ") er ferdig!");
//        System.out.println("Summen er: " + summen);
        return summen;
    }

/*    public int sum(Node node) {
        if(node == null)
            return 0;
        return node.verdi + sum(node.venstre) + sum(node.høyre);
    }*/

    public static void main(String[] args) {
        System.out.println(sum(1,5));
    }
}
