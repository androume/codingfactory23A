package gr.aueb.cf.ch1.ch2;

import java.util.Scanner;

/**Μετατρεπει Euros σε δολλαρια ΗΠΑ
λαμπβανει απο τον χρηστη (stdin) ενα ακεραιο
που συμβολιζει το ποσό σε Euros και μετατρεπει
σεδολλαρια και εμφανιζει το τελικο αποτέλεσμα*/


public class EuroToUsdCoverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents =0;
        int usaDollars =0;
        int usaCents =0;
        final int Parity = 99;


        //Eντολές

        System.out.println("Please insert an amount in(Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros *99;
        usaDollars = totalUsaCents /100;
        usaCents = totalUsaCents %100;

        //Εκτυπωση αποτελεσμάτων

        System.out.printf("%dEuros = USA dollars,%d USA cents", inputEuros, usaDollars, usaCents);

    }
}
