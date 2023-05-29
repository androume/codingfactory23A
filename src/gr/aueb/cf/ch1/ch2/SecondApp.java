package gr.aueb.cf.ch1.ch2;

import java.util.Scanner;

/** Διαβαζει ωρες λεπ[τά και δευτερόλεπτα*/

public class SecondApp {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int inputHours = 0;
int inputMinutes = 0;
int inputSeconds =0;
int totalSeconds = 0;
final int SECONDS_PER_HOUR=3600;
final int SECONDS_PER_MINUTE =60;

        System.out.println("Please insert hours, minutes and seconds");
inputHours = in.nextInt();
inputMinutes = in.nextInt();
inputSeconds = in.nextInt();

totalSeconds =inputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputSeconds;
//    System.out.printf(Locale.US,%d hours, %d minutes, %d seconds = %,d,total seconds", inputHours, inputSeconds, inputMinutes);








}
}