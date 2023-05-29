package gr.aueb.cf.ch1.ch6;

public class PrintArrayMethod {
    public static void main(String[] args) {
        int [] ages = {17, 25, 34, 42};
        printArray(ages);

    }

    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.print(item + "");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if (arr == null)return;
        if (low <0 || high > arr.length - 1)return;

        for (int i = low; i<= high; i++) {
            System.out.print(arr[i] + "");
        }
    }
}
