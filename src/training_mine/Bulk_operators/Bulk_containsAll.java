package training_mine.Bulk_operators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_containsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,111));


        boolean r1 = list1.containsAll(Arrays.asList(20,40,60));  // true
        System.out.println(r1);

        Integer[] data = {10,20,30};
        boolean r2 = list1.contains(data); //true


    }
}
