package gr.aueb.cf.ch1.ch3;

import java.util.Scanner;

/** Αποφασίζει αν χιονίζει ή όχι,με βάση
 * όχι μονο τη θερμοκρασία αλλα και το
 * αν βρεχει.Αν βρεχει και η θερμοκρασια
 * ειναι <0, τότε χιονιζει, αλλιως όχι*/
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp =0;

        System.out.println("Please insert if it is raining (true/false");
        temp = in.nextInt();

        System.out.println("Please insert Temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing" + isSnowing);


    }
}
