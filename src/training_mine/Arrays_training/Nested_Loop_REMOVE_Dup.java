package training_mine.Arrays_training;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class Nested_Loop_REMOVE_Dup {
    public static void main(String[] args) {

        String a = "aabbc",  b="cab"  ;    //
        //      a="abc"      b=cab

        String a1 = "";       //store all the non duplicated values from a

       for (int j=0; j < a.length(); j++) {

           for (int i = 0; i < a.length(); i++) {
               if (!a1.contains( a.substring(j, j + 1))) {
                   a1 += a.substring(j, j + 1);
               }
           }
       }//main
        System.out.println(a1);

       //   b = "cabbbcbbbbaaaa";
       String b1="";

       for (int i=0; i < b.length(); i++ ){
           if(! b1.contains( b.substring(i, i+1) )){
               b1 += b.substring(i, i+1);
           }

       }
        System.out.println(b1);


        System.out.println("====REMOVE DUP >>>=charAt================================");


        String b2="";

        for (int i=0; i < b.length(); i++ ){
            if(! b2.contains( (""+b.charAt(i)) )){
                b2 += ""+b.charAt(i);
            }

        }
        System.out.println(b2);


        System.out.println("=================================================================");

        char[] ch1 = a1.toCharArray();
        System.out.println(Arrays.toString(ch1));

        char[] ch2 = b1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("=======================================");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        String str1 =Arrays.toString(ch1);  //str
        String str2 = Arrays.toString(ch2);// str


        System.out.println("======FUTURE topic======================================");
        // solution 2:
         String Str1 ="aaaaaaaabbbbccccccccccccddddddddaabbbbbbccccc",    Str2 = "ccccddddddddccccccccaaaaabbbbbb" ;

         Str1 = new TreeSet<String>(Arrays.asList(Str1.split(""))).toString();
        Str2 = new TreeSet<String>(Arrays.asList(Str2.split(""))).toString();

        System.out.println(Str1.equals(Str2));

        System.out.println(Str1);
        System.out.println(Str2);












    }

}
