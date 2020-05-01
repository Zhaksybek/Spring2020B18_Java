package training_mine.Bulk_operators;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();

        Integer[] arr1 = {30,20,40,45,200,35};

        list.addAll(Arrays.asList(arr1));

        System.out.println(list);  // [30, 20, 40, 45, 200, 35]

        System.out.println("==============================================");
        String[] name = {"Jake", "Cake", "RDK"};

        ArrayList<String> namList = new ArrayList<>();
        namList.addAll( Arrays.asList( name )  );

        namList.add("Jons");
        namList.remove("Cake");

        System.out.println(namList); //[Jake, RDK, Jons]


        System.out.println("========>> Array to Array List <<===================================");

        Integer[] number = {1,2,3,4,5,6,7,8,9,10};
         ArrayList<Integer> numlist2 = new ArrayList<>(Arrays.asList( number));







    }
}
