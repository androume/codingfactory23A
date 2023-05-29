package gr.aueb.cf.ch1.ch5;

public class PowerApp {

    public static void main(String[] args) {
        int a= 2;
        int n = 10;
        int result;

        result = pow(a, n);

        System.out.println("Result" + result);

    }

    public static int pow(int a, int n){
        int power = 1;
        for(int i = 1; i < n; i++){
            power = power * a;
        }
        return power;
    }
}
