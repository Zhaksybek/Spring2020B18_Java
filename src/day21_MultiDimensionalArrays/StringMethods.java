package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
// toCharArray
        String name ="Java";

        char[] ch= name.toCharArray();

        System.out.println(ch[0]);//'J'
        System.out.println(ch[3]);//'a'

        //Split

        String str ="I like Java";
        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        /*
        revers sentence: day great is today
         */
        String sentence = "Today is great day";
             String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));  // Today , is great day

        for (int i=words.length-1; i>=0; i--){

            String eachWords = words[i] ;
            System.out.print(eachWords+" ");

        }


    }
}
