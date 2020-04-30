package day31_BulkOperations;

import java.util.ArrayList;
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

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(200);
        list3.add(110);

        Collections.sort(list3);

        ArrayList<Integer> revList = new ArrayList<>();

        for (int i=list3.size()-1; i>=0;i--){
            revList.add( list3.get(i)  );

        }

        System.out.println(revList);
       // list3 = revList;

        System.out.println(list3);





    }

}
