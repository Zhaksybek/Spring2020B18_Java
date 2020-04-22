package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5, 6, 7, 8};
        //   0 1 2 3 4

        for(int i = arr.length -1 ; i >= 0; i--  ){
            int eachNum = arr[i];
            System.out.print(eachNum+" ");
        }
        System.out.println();   // FIRST WAY ==>8 7 6 5 4 3 2 1  (INT)

        System.out.println("===================================");


        //[5, 4, 3, 2, 1]
        int[] RevArr = new int[arr.length]; // [0, 0, 0, 0, 0]

/*
        //     i        j
        RevArr[0] = arr[4];
        RevArr[1] = arr[3];
        RevArr[2] = arr[2];
        RevArr[3] = arr[1];
        RevArr[4] = arr[0];
*/


        int j = arr.length -1; //4            SECOND WAY==>[8, 7, 6, 5, 4, 3, 2, 1]   (ARR)
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }





        System.out.println(Arrays.toString(RevArr));



    }
}
