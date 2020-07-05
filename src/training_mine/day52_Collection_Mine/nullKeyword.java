package training_mine.day52_Collection_Mine;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class nullKeyword {

    static String str; // == null

    public static void main(String[] args){

     //   System.out.println( str.length() );


        TreeSet<String> treeSet1 = new TreeSet<>();

        //treeSet1.add(null);
       // System.out.println(treeSet1);   // TreeSet does not accepts null keyword



        HashSet<String> hashset1 = new HashSet<>();
        hashset1.add(null);

        System.out.println(hashset1);   // HashSet accepts null keyword

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add(null);
        System.out.println(linkedHashSet1); // LinkedHashSet also accepts null keyword


        System.out.println("===============================");

        String number = null;

        int num1 = Integer.parseInt(number);  // NumberFormatException:  coz ==>  number = null;

        System.out.println(num1);




    }
}
