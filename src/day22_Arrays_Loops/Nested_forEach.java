package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nested_forEach {
    public static void main(String[] args) {

     int[] arr = {1,2,3,4,5 };

     for (  int  Each  :   arr  ){
         System.out.println(Each);
     }


        System.out.println("=========For EACH=================================");
     int[] [] arr2D = { {1,2,3}, {4,5,6}  };
     //                    0        1

        for (int[] each1Darr   : arr2D   ){

            for (int eachElement   : each1Darr     ){
                System.out.println(eachElement);
            }
        }


        System.out.println("=====CHAR =====>>For EACH<<=============================================");

        char[][] ch2D ={   {'A','B'},   {'C','D','E'}  };

        for (char[] each1DArray      :   ch2D    ){

            for (char eachElement     :   each1DArray     ){
                System.out.println(eachElement);
            }

            //System.out.println(Arrays.toString(each1DArray));
        }




    }
}
