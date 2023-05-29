package gr.aueb.cf.ch1.ch5;

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        final double EPSILON = 0.0005;
        boolean isRight = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a, b,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON){
            isRight = true;
        }



    }
}
