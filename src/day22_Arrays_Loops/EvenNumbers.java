package day22_Arrays_Loops;

import java.util.Arrays;

/*
Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
 */
public class EvenNumbers {
    public static void main(String[] args) {


        int[] numbers = new int[100];   // index 0~99

        //numbers[0] = 1;

        for (int i=0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));



        for ( int EachArray  : numbers   ){
            if (EachArray%2!=0){
                continue;
            }
            System.out.print(EachArray+" ");
        }







    }
}
