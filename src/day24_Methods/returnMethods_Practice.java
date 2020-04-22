package day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class returnMethods_Practice {

    public static void main(String[] args) {
        int[] arr = {9,8,7,415,45,5,666,2};
        int max = maxNumber(arr);
        int min = minNumber(arr);

        System.out.println("Max num is: "+max);
        System.out.println("Min num is: "+min);
    }




    public static int minNumber(int[] arr ){
        Arrays.sort(arr);

        return arr[0];
    }//minNum





    public static int maxNumber(int[] arr){
        Arrays.sort(arr);

        return  arr[arr.length-1];

    }  //maxNum


} // class
