package gr.aueb.cf.ch1.ch3;

import java.util.Scanner;

public class AverageApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total and cpount");
        total = in.nextInt();
        count = in.nextInt();
        if (count == 0){
            System.out.println("Invalid count");
            System.exit(1);
        }
    }
}
