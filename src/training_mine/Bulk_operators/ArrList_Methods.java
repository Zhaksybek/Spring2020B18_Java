package training_mine.Bulk_operators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("E","A","C","B","D"));

        Collections.sort(list);

        System.out.println(list); // [A, B, C, D, E]

        ArrayList<String> revers = new ArrayList<>();

        for (int i= list.size()-1; i>=0;i--){
            revers.add(list.get(i));
        }

        System.out.println(revers);

        System.out.println("=========================================================");





    }
}
