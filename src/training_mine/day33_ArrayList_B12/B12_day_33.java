package training_mine.day33_ArrayList_B12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B12_day_33 {
    public static void main(String[] args) {
      int[] arr = {10,64,9,7,6,56,464,6,34,1,0,0,5,8,9,3,24};

      int[] DesArr = new int[arr.length];
        Arrays.sort(arr);

        int j =0;
        for (int i=arr.length-1; i>=0; i--){
            DesArr[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(DesArr));





    }




}// class
