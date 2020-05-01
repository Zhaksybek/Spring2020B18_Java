package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        /*
              1. write a program that can remove duplications from an arrayList
         */

        list.addAll(Arrays.asList( 1,2,3,4,5,6,3,7,8,9,1 ));
        // remove 1, 3, 5, 8
/*
        Integer a = 1;
        list.remove( 1);
        list.remove(a);

        Integer b =3;
        list.remove(b);

 */
        Integer[] arr = {3,4,5,8};
        list.removeAll(Arrays.asList(arr));

      //  list.removeAll(Arrays.asList(1,3,5,8));    //[2, 4, 6, 7, 9]

        System.out.println(list);  //[2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("===========================================================");

        String[] names = {"Ahmed", "John", "Aaron", "Ahmed","Zhaksybek"};

        ArrayList<String> namelist = new ArrayList<>( Arrays.asList(names) );

        System.out.println(namelist);

        namelist.removeAll(Arrays.asList("Ahmed"));
        System.out.println(namelist);






    }
}
