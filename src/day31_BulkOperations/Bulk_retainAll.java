package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,85,1,24,3132,2,1,3,2,1,4,6,4,6));
        //       only keep: ==> 1,2,3,4,5

        list.retainAll(Arrays.asList(1,2,3));

        System.out.println(list);


    }
}
