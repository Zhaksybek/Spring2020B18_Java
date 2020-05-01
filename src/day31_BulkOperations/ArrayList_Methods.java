package day31_BulkOperations;

import java.util.*;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");


        boolean r1 = list1.contains("Z");
        System.out.println(r1);  // false

        //======================================================

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        boolean r2 = list1.equals(list2); // true
        System.out.println(r2);


        // ============================================================'

        //Arrays.equal(arr1, arr2)

        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
        Arrays.sort(arr1);  //{1,2,3}
        Arrays.sort(arr2); //{1,2,3}

        boolean r3 = Arrays.equals(arr1, arr2);
        System.out.println(r3);

        System.out.println("=============================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        //  expected: 1000 100 20 10

        Collections.sort(list3);

        System.out.println(list3);

        ArrayList<Integer> reversedList3 = new ArrayList<>();

        for(int i =list3.size()-1; i >= 0;  i--){
            //  System.out.print( list3.get(i) +" " );
            reversedList3.add( list3.get(i) );
        }

        System.out.println(reversedList3);

        //  list3 = reversedList3;

        System.out.println(list3);





    }

}
