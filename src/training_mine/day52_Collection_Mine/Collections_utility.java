package training_mine.day52_Collection_Mine;

import java.lang.reflect.Array;
import java.util.*;

public class Collections_utility {

    public static void main (String[] args){

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList( 10, 9 ,8 , 7, 5 , 4 ));

        Collections.sort(list1);
        System.out.println(list1);


        System.out.println("======================================");


        // 1. write a program that can remove the duplicates and print out in sorted order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList( 5,5,5,0,6,4,6,654,66,4,1,6,1,6,5,4,6,5,0,4,4,6 ));

        nums= new ArrayList<>( new TreeSet<>( nums  ) );

        System.out.println(nums);

        //System.out.println(nums);
        //TreeSet<Integer> set1 = new TreeSet<>(  nums  );

        //System.out.println(set1);

        System.out.println("===========================");


        ArrayList<Integer> list5 = new ArrayList<>();

        list5.addAll(Arrays.asList( 4,4,5,5,5,6,6,7,7,8,9,9,0,0,0,0,1,1,6 ));


        list5 = new ArrayList<>( new LinkedHashSet<>( list5 ) );

        System.out.println("list5 without duplicates and ansorted:   "+list5);

        System.out.println("===========================");


        ArrayList<String> letters = new ArrayList<>();

        letters.addAll(Arrays.asList( "A","A", "B", "C", "B", "D" ));

        boolean result = Collections.frequency(letters, "A") ==1; // we can use it for verify website does not
        // have any copy

        System.out.println(result);






    }

}
