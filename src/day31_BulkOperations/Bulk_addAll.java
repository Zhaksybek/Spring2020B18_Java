package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add    =====>>>  30, 20, 50, 45, 35, 200
/*
        list1.add(30);
        list1.add(20);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);

 */

         list1.addAll(Arrays.asList(30, 20, 50, 45, 35, 200  ));
        System.out.println(list1);   // [30, 20, 50, 45, 35, 200]

        Integer[] arr1 = {30, 20, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));


        System.out.println("===================================================");

        String[] names = {"Jaqsybek", "Future","SDET","DEVELOPER","InshaAllah"};
         //                   0          1       2        3            4


        // names[5] = "and QA tester";

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList( names ));
                      //  collectionType
        nameList.add("and QA tester");

        System.out.println(nameList);  //[Jaqsybek, Future, SDET, DEVELOPER, InshaAllah, and QA tester]

        nameList.remove("and QA tester");


        System.out.println(nameList);  //   [Jaqsybek, Future, SDET, DEVELOPER, InshaAllah]

        System.out.println("=====================================================================");

        Integer[]  numbers = {1,2,3,4,56,7,8,9,10};

        ArrayList<Integer> numlist = new ArrayList<>(  Arrays.asList(  numbers  )  );

        System.out.println(numlist); //  ==>> [1, 2, 3, 4, 56, 7, 8, 9, 10]









    }
}
