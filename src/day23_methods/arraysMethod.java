package day23_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysMethod {

    public static void main(String[] args) {

     /*   int[] arr = {1,9,9,74,8,62,4,5,5,0};

        int[] arr1 = new int[arr.length];

        int a =0;

        for ( int i = arr1.length-1; i>=0; i--){
            arr1[a]=arr[i];
            System.out.println("arr1[a] ="+ arr1[a] + "="+"arr[i] "+arr[i]);
            a++;
            System.out.println("a "+ a);
        }

      */

     int[] arr = {4,8,58,4,6,3};

        System.out.println(Arrays.toString( reversArrays(arr) ));
        int[] newArrayForRevers =   reversArrays(arr);

        System.out.println(Arrays.toString(newArrayForRevers));

        System.out.println("==============================");


        String[] arr1 = {"Anya", "learning", "Java"};

        System.out.println( Arrays.toString(  reversArrays( arr1  )   ) );





    }

    public static int[]    reversArrays(int[] arr){

        int[] reversResult = new int[arr.length];

                      int a=0;
        for (int i = arr.length-1; i>=0; i-- ){
            reversResult[a]=arr[i];
            a++;

        }// for loop

        return reversResult;

    }  //method


    public static String[] reversArrays(String[] arr){

        return arr;
    }






} // class
