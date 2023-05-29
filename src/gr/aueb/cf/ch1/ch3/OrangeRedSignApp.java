package gr.aueb.cf.ch1.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OrangeRedSignApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTAnk1LTQuarter = false;
        boolean isTank21LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTAnk1LTQuarter = in.nextBoolean();
        isTank21LTQuarter = in.nextBoolean();

        orangeOn = isTank21LTQuarter || isTank21LTQuarter;
        redOn = isTAnk1LTQuarter && isTank21LTQuarter;

        System.out.println("Orange on" + orangeOn);
        System.out.println("Red On" + redOn);


    }
}
