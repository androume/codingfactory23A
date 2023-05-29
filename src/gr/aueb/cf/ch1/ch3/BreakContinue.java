package gr.aueb.cf.ch1.ch3;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            if (num == 0)
                continue;

            sum += num;

            if (num == 10) {
                System.out.println("Bingo");
                break;
        }
        }
        System.out.println("Sum:" + sum);


    }
}
