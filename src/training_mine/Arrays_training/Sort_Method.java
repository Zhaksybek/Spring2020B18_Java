package training_mine.Arrays_training;

import java.util.Arrays;

public class Sort_Method {
    public static void main(String[] args) {
        int[] arr1 = {99,88,-5,444,66,0,74,3};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("=========================================");


        char[] ch = {'Z', 'D', 'W', 'A', 'E'};

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        System.out.println("=========================================");

        int[] arr2 = {99,88,-5,444,66,0,74,3};
        int[] arrDescending= new int[arr2.length];
        Arrays.sort(arr2); // [-5, 0, 3, 66, 74, 88, 99, 444]

         int j=0;
      for (int i=arr2.length-1; i >=0; i--){
           arrDescending[j]=arr2[i];
              j++;
      }
        System.out.println("Ascending "+Arrays.toString(arr2));
        System.out.println("Descending "+Arrays.toString(arrDescending));


    }
}
