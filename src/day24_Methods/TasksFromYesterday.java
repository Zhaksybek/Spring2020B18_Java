package day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TasksFromYesterday {
    public static void main(String[] args) {
     int[] arr = {10,8,9,4,3,2,1};

     // MaxNumber(arr);  // if parameter is array, the argument Must be array

       /// MinNumber(arr);

        Descending(arr);





    }// main

    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println("Min number is: " + array[0]);


    }

    public static void Descending(int[] array){
        Arrays.sort(array);
        for (int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");


        }
        System.out.println();
    }




  public static void MaxNumber(int[] array){
        /*
        1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20

         */
      Arrays.sort(array);
      System.out.println("Max number is:  " + (array.length-1));

  }






} // Dom't touch
