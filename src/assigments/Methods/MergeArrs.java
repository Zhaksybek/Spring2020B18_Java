package assigments.Methods;

import java.util.Arrays;

public class MergeArrs {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String check) {
      String result ="";
      for (int i=check.length()-1; i>=0;i--){
          result += check.charAt(i);
      }
      result = result.toLowerCase();
      result= result.replace(" ","");
      check = check.toLowerCase();
      check = check.replace(" ","");

      if (check.equals(result)){
          return true;
      }else {
          return false;
      }

    }


    public static String clean (String text ,String badWord) {
     return text.replace(badWord,"");

    }


    public static boolean isError(String line)
    {
        if (line.substring(0,5).equals("error")){
            return true;
        }else {
            return false;
        }

    }


    public static String reverse(String input)
    {
        String revers ="";
        for (int i=input.length()-1; i>=0 ;i--){
            revers+=input.charAt(i);
        }
        return revers;

    }



    public static int[] mergR(int[] a,int[] b) {
         int[] arr =new int[a.length+b.length];

         for (int i=0;i<a.length;i++){
             arr[i]=a[i];
         }
         for (int i=0;i<b.length;i++){
             arr[a.length+i]=b[i];
         }

         return arr;


    }//end mergR
}
