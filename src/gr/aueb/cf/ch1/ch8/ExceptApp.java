package gr.aueb.cf.ch1.ch8;

import java.io.IOException;

public class ExceptApp {
    public static void main(String[] args) {

    }

    public static int getNextChar() {
        int ch = ' ';

        try {
            ch = System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ch;


    }
}