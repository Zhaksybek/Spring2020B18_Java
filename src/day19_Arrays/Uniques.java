package day19_Arrays;

public class Uniques {
    public static void main(String[] args) {
        /*
        Warm up task:
    1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"



         */

        String str = "AABCCDDEEL";
        String result = ""; //B


         for (int j=0; j <= str.length()-1; j++) {

             int count =0;
             for (int i = 0; i <= str.length() - 1; i++) {
                 if (str.charAt(i) == str.charAt(j)) {
                     count++;
                 }
             }
             if (count == 1) {
                 result += str.charAt(j);
             }

         }//main loop

        System.out.println(result);


        System.out.println("===========================================================");







    }
}
