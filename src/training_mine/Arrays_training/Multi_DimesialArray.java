package training_mine.Arrays_training;

import java.util.Arrays;

public class Multi_DimesialArray {
    public static void main(String[] args) {

        /*
        n  demensial array contains (n-1) demensial array
         2 dimensial array: array that contains 1 dimensional arrays
         */

        int[] [] arr2D = { {1,2,3,} , { 4, 5, 6}  };

        String[] arr = {"A", "B", };

        //                     0    1       0    1
        String[][] str2D = { {"A", "B"} , {"C", "D", "E"} };
        //                      0               1     ==>index
        // [represents the index number of1 dimentional arrays ] [represents index number of values]

        // print A:
        System.out.println(str2D[0][0]); // A
        System.out.println(str2D[1][1]); // D
        System.out.println(str2D[1][2]);//  E


        // print [A, B]
        System.out.println(Arrays.toString(str2D[0]));

        // print [C, D,E]
        System.out.println(Arrays.toString(str2D[1]));

        // Arrays.deepToString(variableName):   convert multi-Dimensional Array to string

        System.out.println(Arrays.deepToString(str2D));

        //                     0 1      0 1    0 1  2  3  4   5
        int[][] Numbers2D = { {1,2} ,  {3,4}, {5,6, 7, 8, 9, 10}  };
        //                       0       1      2

        //print 6:
        System.out.println(Numbers2D[2][5]);
        //print: 10
        System.out.println(Numbers2D[2][5]);

        System.out.println((Arrays.toString(Numbers2D[2])));

        System.out.println(Arrays.deepToString(Numbers2D));


        int[][] Array2D = {  {1,2},  {3,4} };

        // 3 dimensional array contains multiple 2 dimensional arrays
        //                          0       1         0        1
        int [] [] [] Array3D = { {{1,2},  {3,4}}, { {5,6},  {7,8}}};
        //                              0                 1        ==> if 3 dimensional Arrays

        // [index number of 2D array] [index number of 1D array] [index number of value]

        // print: 8
        System.out.println(Array3D[1][1][1]);

        // print: {5,6}
        System.out.println(Arrays.toString(Array3D[1][0]));  // use toString

        // print:  {{5,6}, {7,8}}
        System.out.println(Arrays.deepToString(Array3D[1]));


        // toString method we can use for sigle Array  ==>{5,6,7,8,9,}

        System.out.println(Arrays.deepToString(Array3D));


        int[] [] [] numbers3D = {  { {1,2} }  ,   {   {4,5,6}   }    };
        //4 dimensional Array contains multiple 3 dimensional arrays
        //
        //int[] [] [] [] numbers4D = {   {{{1,2}} ,   {{3,4}}},   {{{5,6}} , {{5,6}}   };





    }
}
