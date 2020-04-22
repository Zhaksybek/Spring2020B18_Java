package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String methods:
                      split();
                      toCharArray

         */

        String str= "Cybertek";

              char[] ch1 =   str.toCharArray();

        System.out.println(str.length() == ch1.length); //true


        /*
           str1 = "abc",    str2="cab"
         */

        String str1 = "ABC";
        String str2 = "BAC";

        char[] ch2= str1.toCharArray();
        char[] ch3 = str2.toCharArray();
        Arrays.sort(ch2);
        Arrays.sort(ch3);

        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("===========SPLIT=================================");

        String sentences = "I like to learn Java";
         String[] words = sentences.split(" ");
         String[] revWords = new String[words.length];

        System.out.println(Arrays.toString(words));

        int totalWords = words.length;
        System.out.println(totalWords);

        int k=0;
        for (int i=words.length-1; i>=0; i--){
            revWords[k] = words[i];
            k++;
        }

        System.out.println(Arrays.toString(revWords));


        System.out.println("=======STRING=======================");
        String result= "";

        // [I, like, to, learn, java]
        for(int i = words.length-1; i>=0   ;i--){
            // System.out.print( words[i] +" ");
            result += words[i] +" ";
        }

        System.out.println(result.trim());


        //java learn to like I







    }
}
