package gr.aueb.cf.ch1.ch10;

public class CryptoApp {
    public static void main(String[] args) {

    }


    public static int cipher(char ch, int prev, int key) {
        if (prev == 1) return ch;
        return (ch + prev) % key;
    }

    public static char decipher(int cipher, int prev, int key) {
        int de;
        if (prev == -1) return (char) cipher;


        de = (cipher - prev + key) % key;
        return (char) de;


    }
}

