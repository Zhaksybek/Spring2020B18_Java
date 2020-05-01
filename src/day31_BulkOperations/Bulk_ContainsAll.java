package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // if 10,20, 60 if objects are exists in arrayList ==> true
        // otherwise ==> false
/*
        boolean r1 = list1.contains(10);
        boolean r2 = list1.contains(20);
        boolean r3 = list1.contains(60);

        boolean result = r1==true && r2 ==true && r3== true;

        System.out.println(result);
*/
         boolean result2 =list1.containsAll(Arrays.asList(40,20,10)); // true

        System.out.println(result2);

        // 10, 30 , 40

        Integer[] data = {10, 30, 40};   //
         boolean result3 =  list1.containsAll(Arrays.asList( data  )); // true
        System.out.println(result3);






    }
}
