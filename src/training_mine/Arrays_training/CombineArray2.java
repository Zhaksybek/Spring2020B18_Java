package training_mine.Arrays_training;

import java.util.Arrays;

public class CombineArray2 {
    public static void main(String[] args) {
        int[] arr1 = {100,200,300,400,};
        int[] arr2 = {500,600,700};

        int[] arr3 = new int[arr1.length+arr2.length];

        for (int i=0; i < arr1.length; i++){
                   arr3[i]    = arr1[i];

        }

        for (int i=0; i < arr2.length; i++){
                     arr3[arr1.length+i]  = arr2[i];


        }
        System.out.println(Arrays.toString(arr3));



    }
}
