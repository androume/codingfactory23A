package gr.aueb.cf.ch1.ch7;

import java.util.Scanner;

public class ArithmeticExceptionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;
        try {

            System.out.println("Please insert two ints for Division");
            numerator = in.nextInt();
            denominator = in.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}