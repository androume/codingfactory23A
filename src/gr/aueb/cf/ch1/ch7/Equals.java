package gr.aueb.cf.ch1.ch7;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");

        if (s1.equalsIgnoreCase(s3)){
            System.out.println("EQUAL");
        }
    }
}
