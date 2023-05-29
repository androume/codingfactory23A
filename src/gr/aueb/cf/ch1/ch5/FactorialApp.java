package gr.aueb.cf.ch1.ch5;

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result =0;

        System.out.println("Δωσε έναν ακέραιο");
        n = in.nextInt();

        result = facto(n);

        System.out.printf("%d! = %d", n, result);
    }

    /**
     * Returns ni
     * @param n
     * @return
     */
    public static int facto(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i; // result *= i ;
        }

        return result;
    }
}
