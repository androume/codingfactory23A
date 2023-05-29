package gr.aueb.cf.ch1.ch5;

public class FactorialRecursiveApp {
    public static void main(String[] args) {

    }

    /**
     * Recursive solution of n
     * @param n n of n!
     * @return n!
     */

    public static int facto(int n){
        if(n <= 1) return 1;
        return n * facto(n-1);

        // return (n <= 1)
    }
}
