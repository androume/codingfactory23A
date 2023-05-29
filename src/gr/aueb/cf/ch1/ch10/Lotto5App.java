package gr.aueb.cf.ch1.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto5App {

    /*public static void main(String[] args) {
        try (Scanner in = new Scanner (new File("C:/tmp/lotto5in.txt"));
        PrintStream ps = new PrintStream("C:/tmp/lotto5out.txt", StandardCharsets.UTF_8) {

            final int LOTTO_SIZE = 5;
            int[] inputNumbers = new int[49];
            int pivot = 0;
            int[] result = new int[5];
            int num;
            int window;

            while((num =in.nextInt())!=-1&&pivot <=48)

            {
                inputNumbers[pivot++] = num;

            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
            Arrays.sort(numbers);

            window =pivot -LOTTO_SIZE;
            for(
            int i = 0;
            i <=window;i++)

            {
                for (j = i + 1; j <= window + 2; k++) {
                    for (int l = k + 1; l <= window + 3 l++){
                        for (int m = l + 1; m <= window + 4; m++) {
                            result[0] number[i];
                            result[1] number[j];
                            result[2] number[k];
                            result[3] number[l];
                            result[4] number[m];

                            System.out.printf("%d %d %d %d\n",
                                    result[0], result[1], result[2], result[3], result[4]);
                        }
                    }
                }
            }
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
}
