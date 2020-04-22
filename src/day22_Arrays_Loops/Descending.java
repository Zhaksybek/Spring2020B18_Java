package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);  //         [-1, 2, 10, 70, 78, 500]
        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length]; // new Array for Revers

        int j = arr.length -1; //500
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));




    }
}
