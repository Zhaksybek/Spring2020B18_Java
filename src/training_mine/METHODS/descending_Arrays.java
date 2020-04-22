package training_mine.METHODS;

import java.util.Arrays;

public class descending_Arrays {
    public static void main(String[] args) {



    }// main

   public static int[] DescenArr(int[] arr){
        /*
                int[] Array ={-99, 7, 0, 10 , -99 , 35 , 3 ,0  };
        int[] desArray = sortDescending(Array);
        System.out.println(Arrays.toString(desArray));

         */
       Arrays.sort(arr);
       int[] DesArr = new int[arr.length];
       /*
       DesArr[0] = arr[arr.length-1] ==lastIndex
        */
       int j = arr.length-1;
       for (int i=0; i<arr.length;i++){
           DesArr[i] = arr[j];
           j--;
       }
      return DesArr;
   }


}//class
