package gr.aueb.cf.ch1.ch7;

public class SubStringDemo {
    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        for (int i = 0; i < s.length(); i ++){
            System.out.println(s.substring(i,i + 1));
        }
    }
}
