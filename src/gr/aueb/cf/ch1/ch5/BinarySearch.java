package gr.aueb.cf.ch1.ch5;

public class BinarySearch {
    public static void main(String[] args) {

    }
    /**
     * returns the position of a value within an array
     */
    public static int binarySearch(int[] arr, int value, int low, int high){
       int median;

        if (arr==null) return -1;
        if ((low < 0) || (high > arr.length - 1)) return -1;
        if (high < low) return -1;

        median = (low + high) / 2;

        if (value == arr[median]){
            return binarySearch(arr, value, low, median -1);
        }else {
            return binarySearch(arr, value, median +1, high);
        }
    }
}
