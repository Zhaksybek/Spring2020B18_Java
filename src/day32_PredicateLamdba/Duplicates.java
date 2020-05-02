package day32_PredicateLamdba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
     /*
     write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
      */

        ArrayList<String> list = new ArrayList<>(Arrays.asList(  "A", "B", "A", "C", "D","D" ));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();

    for (int i=0; i<list.size();i++) {
        // list.get(0) ==? "A"
        int count = 0;
        for (String each : list) {
            if (each.equals(list.get(i))) {
                count++;
            }
        }

        if (count > 1 && !duplicates.contains(list.get(i))) {
            duplicates.add(list.get(i));
        }
    }
        System.out.println(duplicates); // ==> [A]



    }
}
