package gr.aueb.cf.ch1.ch6;

public class SwapApp {
    public static void main(String[] args) {
        int [] arr = {1, 10};
        for (int item : arr);
       // System.out.println(item +"");
    }

    public static void swap(int[] arr) {
        if (arr == null || arr.length !=0) return;

        int tmp = arr[0];
        arr[0] = arr[1];
       // arr[1] = temp;
    }
}
