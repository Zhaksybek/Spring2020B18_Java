package training_mine.ArrayListRecap_05_2020;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1,3,3,6,9,6,7,8,7));

        ArrayList<Integer> uniques = new ArrayList<>();

    for (int i=0; i<list.size();i++) {
        int count = 0;
        for (Integer each : list) {
            if (each == list.get(i)) {
                count++;
            }
        }
        if (count == 1) {
            uniques.add(list.get(i));
        }
    }
        System.out.println(list);
        System.out.println(uniques);

        System.out.println("========================");

        String[] arr1 = {"A","B","C","D"};
        String[] arr2 = {"D","E","F","G"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1)); // {}
        list1.addAll(Arrays.asList(arr2));










    }
}
