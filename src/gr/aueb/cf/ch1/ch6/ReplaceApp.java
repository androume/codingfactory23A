package gr.aueb.cf.ch1.ch6;

public class ReplaceApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 9, 15};
    }


    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate = -1;
        if (arr == null) return;
        positionToUpdate = getIndex(arr, oldVal);
        if (positionToUpdate == -1) return;
        arr[positionToUpdate] = newVal;


    }

    public static int getIndex(int[] arr, int value){
        int position =-1;

        if (arr == null) return -1;
        for (int i =0; 1<= arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }
      return position;
    }
}