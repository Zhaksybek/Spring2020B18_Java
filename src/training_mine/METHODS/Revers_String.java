package training_mine.METHODS;

import java.util.Arrays;

public class Revers_String {
    public static void main(String[] args) {



    }//main




    public static int maxNumArr(int[] arr){
        /*
         int[] array = {1,8,2,-6,5,5,56,3,6,77,7,1,0, 50 ,3};

      int MaxNumber = maxnumber(array);
        System.out.println(MaxNumber);

         */

        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        return maxNum;
    }





    public static String Revers(String str){
        /* for MAIN
         String sentences ="I will be best developer in Bay Area";
    String newRev = Revers(sentences);
        System.out.println(newRev);

         */
        String Revers ="";
        for (int i=str.length()-1; i>=0; i--){
            Revers += str.charAt(i);
        }
        return Revers;
    }


}//class
