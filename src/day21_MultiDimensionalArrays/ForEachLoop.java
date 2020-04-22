package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

       int[] nums ={1,2,3,4} ;

       for ( int eachElement : nums){
           System.out.println(eachElement);
       }

       System.out.println();

       String[] students = {"Muhtar", "Monica", "Asiya"};

       for (String eacStudent: students){
           System.out.print(eacStudent +" good! ");
       }


       int[] arr1 ={1,2,3,4,5,6,7,8,9,10};

       for (int eacArr1: arr1){
           if (eacArr1 < 5 ){
               continue;
           }

           System.out.print(eacArr1+ " ");

       }

        System.out.println("===========================================================");
       String sentence = "I like Java";   // Java I like

             String[] splitSen = sentence.split(" ");

             for (String eacSplit: splitSen){
                 System.out.println(eacSplit);
             }

       // System.out.println(Arrays.toString(splitSen));

        //revers
        System.out.println();

        for (int i = splitSen.length-1;i>=0;i--){
            System.out.println(splitSen[i]);
        }




    }
}
