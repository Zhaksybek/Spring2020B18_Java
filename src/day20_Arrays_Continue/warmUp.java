package day20_Arrays_Continue;

import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = new int[arr1.length + arr2.length];
        int count = 0;

       // System.out.println(Arrays.toString(arr3));

      for(int i = 0; i < arr1.length; i++) {
         arr3[i] = arr1[i];
         count++;
      }


      for(int j = 0; j < arr2.length;j++) {
         arr3[count++] = arr2[j];
      }

      for(int i = 0; i < arr3.length;i++) System.out.print(arr3[i]+" ");


    }
}
