package assigments.ArraysClassAssigments;

import java.util.Arrays;

public class As_113_SplitAndForEach {
    public static void main(String[] args) {


        String result="";
        for (int i=80; i>=20;i--){
         if (i%2==0){
            result +=i+" "; }
        }
        String[] splitSen = result.split(" ");

       for (String EachStr: splitSen){
           System.out.print(EachStr+" ");
       }





    }
}
