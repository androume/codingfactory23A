package gr.aueb.cf.ch1.ch3;

import java.util.Scanner;

/** Αποφασίζει με βάση τη θερμοκρασια
 * τη θερμοκρασια.Αν η θερμοκρασια
 * ειναι<0, τότε χιονίζει, αλλιως
 * δε χιονίζει,ο χρηστης δινει τη θερμοκρασια*/
/*
 *
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temprature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing:" + isSnowing);






    }

}
