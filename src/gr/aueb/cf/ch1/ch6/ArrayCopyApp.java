package gr.aueb.cf.ch1.ch6;

import java.util.Arrays;

/**
 * makes an array copy by using
 * utility methods
 */
public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int[] arr3;
        //system array copy 1
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        //Arrays class
        arr3 = Arrays.copyOf(arr, arr.length -1 );
        arr3 = Arrays.copyOfRange(arr, 0,arr.length);
    }
}
