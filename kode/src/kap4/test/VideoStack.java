package kap4.test;

public class VideoStack {
    public static void main(String[] args) {
        updateA();
    }
    static void updateA(){
        updateB();
        updateC();
        System.out.println("updateA");
    }

    static void updateB(){
        updateC();
        System.out.println("updateB");
    }

    static void updateC(){
        System.out.println("updateC");
    }
}
