package gr.aueb.cf.ch1.ch5;

public class Overloading {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static long add(long a, int b){
        return a + b;
    }
    public static long add(long a, long b){
        return a +b;
    }
}
