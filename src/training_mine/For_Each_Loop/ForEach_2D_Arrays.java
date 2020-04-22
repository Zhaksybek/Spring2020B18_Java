package training_mine.For_Each_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEach_2D_Arrays {
    public static void main(String[] args) {

        int[][] arr2D= { {1,2,3,4},{5,6,7,8,9} };

        for (int i=0; i < arr2D.length; i++){ // 0  and 1

            for (int j=0; j <arr2D[i].length; j++ ){  // [0][01234] etc...
                System.out.print(arr2D[i][j]+" ");

            }
        }

        System.out.println(); // line breaker


        System.out.println("=========FOR EACH LOOP==========================");


          for (int[] each1: arr2D){ //   [1, 2, 3, 4]         [5, 6, 7, 8, 9]

              for (int each2: each1){
                  System.out.print( each2 +" " );   //  1 2 3 4 5 6 7 8 9
              }

          }


        System.out.println();
        System.out.println("=========FOR EACH LOOP  and STRING EX:>>> ==========================");

        String[][] str2D={ {"Jaks", "Nashok"}, {"Aisulu", "Koyanbaev", "Kino" }  };

        for (String[] each1: str2D){  // [Jaks, Nashok]    [Aisulu, Koyanbaev, Kino]

            for (String each2: each1){
                System.out.print(each2+" ");  //  Jaks Nashok Aisulu Koyanbaev Kino
            }


        }








    }
}
