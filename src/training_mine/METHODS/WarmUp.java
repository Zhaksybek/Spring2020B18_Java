package training_mine.METHODS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        //Assing 1~100 to the array each index
        int[] numbers = new int[100];

        for (int i=1; i<=100;i++){
            numbers[i-1]= i;
         // number[0] = 1;
         // number[1] = 2;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
