package gr.aueb.cf.ch1.ch6;

public class ReplaceWithMethod {
    public static void upscaleByOne(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] +=1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.println(item +"");
        }
    }
}
