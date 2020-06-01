package assigments.As_05_24_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class populate_array {
    public static void main(String[] args) {
        //badP(int[] products,int limit)
        int[] products ={1,1,1,1,0,0,0,0};
        int limit =2;
        int count=0;

        for (int each: products){
            if (each==0){
                count++;
            }
        }


        System.out.println(count);







    }



}
