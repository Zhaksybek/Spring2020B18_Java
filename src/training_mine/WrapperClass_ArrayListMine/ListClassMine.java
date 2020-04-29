package training_mine.WrapperClass_ArrayListMine;

import java.util.*;

public class ListClassMine {
    public static void main(String[] args) {
          /*
          add(value):

           */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);  // auto - boxing
        list1.add(20);  // auto - boxing
        list1.add(30);

        // index:       [10, 20, 30]

        System.out.println(list1);
        System.out.println(list1.get(0)); //10
        System.out.println(list1.get(1)); //20
        System.out.println(list1.get(2)); //30



        System.out.println(list1.size());   // 3 ==> total length




    }
}
