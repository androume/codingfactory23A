package gr.aueb.cf.ch1.ch5;

/**
 * Ανταλλασσει αμοιβαια δύο τιμές
 * που δίνει ο χρήστης
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = " + a + "b = " + b);
    }

    /**
     * swaps a, b =  0
     * @param a
     * @param b
     */
    public static void swap(int a , int b) {
        int tmp = a;
        a = 0;
        b = tmp;
    }
}
