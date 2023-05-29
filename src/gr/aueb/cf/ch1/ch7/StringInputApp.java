package gr.aueb.cf.ch1.ch7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
        s = in.next();

        System.out.println(s);
    }
}
