package training_mine.Predicate_mine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","A","C","D","B")); // [A] [B]
        System.out.println(list);
        ArrayList<String> duplicates = new ArrayList<>();

    for (int j=0; j<list.size();j++) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(list.get(j))) {
                count++;
            }
        }
        if (count > 1 && !duplicates.contains(list.get(j))) {
            duplicates.add(list.get(j));
        }

    }
        System.out.println(duplicates);







/*
    for (int i=0; i < list.size(); i++ ) {
        int count = 0;
        for (String each : list) {
            if (each.equals(list.get(i))) {
                count++;
            }
        }

        if (count > 1 && !duplicates.contains(list.get(i))) {
               duplicates.add( list.get(i)  );
        }
    }

        System.out.println(duplicates);

*/



    }
}
