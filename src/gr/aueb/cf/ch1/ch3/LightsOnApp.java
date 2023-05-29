package gr.aueb.cf.ch1.ch3;

import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean  isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed =0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed int");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights On:" + lightsOn);



    }
}
