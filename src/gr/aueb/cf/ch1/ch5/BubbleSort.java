package gr.aueb.cf.ch1.ch5;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={10, 15, 8, 23, 3, 12};

        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){
                    //swap(arr, j, j+1);
                }
            }
        }
        for (int el : arr){
            System.out.println(el + " ");
        }
    }

  //  public static void swap
}
