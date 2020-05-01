package training_mine.Bulk_operators;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removeDup_ArrList {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,1,2,2,2,2,6,6,6,6,6,9,4,1,3) );

        ArrayList<Integer> nonDup = new ArrayList<>();

        for (int i=0; i<list.size();i++){
            if (!nonDup.contains(list.get(i))){
                nonDup.add(list.get(i));
            }

        }
        System.out.println(nonDup);  //[1, 2, 6, 9, 4, 3]



    }
}
