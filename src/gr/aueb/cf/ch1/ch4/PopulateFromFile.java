package gr.aueb.cf.ch1.ch4;

import java.io.File;
import java.util.Scanner;

public class PopulateFromFile {
    public static void main(String[] args) {
        //File file= new File("C:/tap/intfile.txt");
       // Scanner in = new Scanner(new File("C:/tmp/intfile.txt"));
        int[] grades = new int[5];

        for (int i =0; i < grades.length; i++){
          //  grades[i] = in.nextInt();
        }
        for (int grade : grades){
            System.out.print(grade + "");
        }
    }
}
