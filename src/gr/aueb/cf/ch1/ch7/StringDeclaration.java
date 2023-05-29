package gr.aueb.cf.ch1.ch7;

public class StringDeclaration {

    public static void main(String[] args) {
        String alice = "Alice";
        String alice2 = "Alice";
        String bob = new String("bob");

        System.out.println(alice);
        System.out.printf("%s\n", alice2);
        System.out.println(alice + " " + bob);
    }
}
