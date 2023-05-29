package gr.aueb.cf.ch1.ch6;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr =  {5, 8, 2, 14, 3, 25, 12};
        int minVal;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length  - 1; i++){
            minPosition = i;
            minVal= arr[i];
            for (int j = i + 1; j < arr.length -1; j++){
                if (arr[j] < minVal){
                    minVal =  arr[j];
                    minPosition = j;
                }
            }

            tmp = arr[1];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }
        for (int item : arr){
            System.out.print(item + "");
        }
    }
}
