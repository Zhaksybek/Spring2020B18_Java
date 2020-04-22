package training_mine.METHODS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args) {
        int[] arr ={0,-1,1000,2000,5000};

        SortDes(arr);

        //--------------------------------------



    }// main

    public static void SortDes(int[] array){
        // array ={}
        Arrays.sort(array);

    for (int i=array.length-1; i>=0; i--){
        System.out.print(array[i]+" ");

    }
        System.out.println();

    }


}//class
