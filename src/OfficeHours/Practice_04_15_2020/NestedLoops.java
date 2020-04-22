package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {

        char[][] arr2D ={   {'A','B'},   {'C', 'D', 'E'},   {'F', 'J', 'K'}    };
        //                      0                1                  2

        // arr2D[0]

        for (int j =0; j < arr2D.length; j++) {   // j: index nums of 1D


            for (int i = 0; i < arr2D[j].length; i++) {   //  i: index num of elements in 1D
                System.out.println(arr2D[j][i]);
            }
        }//main loop


        System.out.println("===============================================================");
         //arr2D ={   {'A','B'},   {'C', 'D', 'E'},   {'F', 'J', 'K'}    };
        //        //                      0                1                  2

        for ( char[]  each1DArray    :     arr2D ){
           // System.out.println(Arrays.toString(each1DArray));

            for (char  eachChar      :  each1DArray   ){
                System.out.println(eachChar);
            }

        }





    }
}
