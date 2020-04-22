package training_mine.Arrays_training;

import java.util.Arrays;

public class Practice_2dArray {
    public static void main(String[] args) {


        int[][] arr2D = { {1,2},   {3, 4, 5, 6, 7, 8 },   {9,10}  };
        // lenght method:



                   int length = arr2D.length;
                   for (int i=0; i < arr2D.length; i++){
                       System.out.println(Arrays.toString( arr2D[i]));
                   }

             //  arr2D [0][0][1]

        for (int i=0; i < arr2D.length; i++) { // checks each index of 1d array

            for (int j =0; j < arr2D[i].length; j++){ //   checks the each index of elements within than
                System.out.print(arr2D[i][j]+" ");
            }
        }

        System.out.println();

        char[][] ch2D = { {'A', 'B'}, {'C','D','F','G'}  };
        //                    0           1

        for (int i=0; i < ch2D.length; i++){   // { {'A', 'B'}, {'C','D'}  }   ==>  0 and 1

            for (int j=0; j < ch2D[i].length; j++){  // { {'A', 'B'}, {'C','D'}  };  [0 1]    [0 1]
                System.out.print(ch2D[i][j]+" ");
            }
        }
       // System.out.println();




    }
}
