package gr.aueb.cf.ch1.ch8;

import java.util.Scanner;

public class InputMismatchExcept2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            System.out.println("Please insert a num");

            inputNum = in.nextInt();

            if (inputNum == MAGIC_NUM){
                System.out.println("Great");
                break;
            }
    }
}}
