package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };
        System.out.println("=======ODD NUMS=================================================");
        // print all odd numbers with regular for loop  : USE CONTINUE statement

        for (int j=0; j < numbers.length; j++){    // k: index num of 1D arr

            for (int i=0; i < numbers[j].length; i++){   // i
                if (numbers[j][i]%2==0){
                    continue;
                }
                System.out.println(numbers[j][i]);
            }

        }


        System.out.println();
        System.out.println("=======EVEN NUMS=================================================");

        // print all even numbers with for each loop : USE CONTINUE statement
        for (int j=0; j < numbers.length; j++){    // k: index num of 1D arr

            for (int i=0; i < numbers[j].length; i++){   // i
                if (numbers[j][i]%2!=0){
                    continue;
                }
                System.out.println(numbers[j][i]);
            }

        }

        System.out.println();
        System.out.println("=======EVEN NUMS  WITH FOR EACH=================================================");

        // print all even numbers with for each loop : USE CONTINUE statement
        for (int[] each1DArray : numbers ){  //  [5, 4, 3, 2, 1]     [10, 11, 12, 13, 14, 15]    [16, 17, 18, 19, 20]
            //System.out.println(Arrays.toString(each1DArray));

            for (int eachSingleArr : each1DArray){

                if (eachSingleArr % 2 != 0){
                    continue;
                }
                System.out.println(eachSingleArr);
            }


        }


    }
}
