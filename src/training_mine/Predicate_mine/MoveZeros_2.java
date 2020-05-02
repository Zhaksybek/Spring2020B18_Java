package training_mine.Predicate_mine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int count = Collections.frequency(list,0); // ==>4  (count==>zero==>4 times)

        list.removeAll(Arrays.asList(0));

        for (int i=0; i<count;i++){
            list.add(0);
        }

        System.out.println(list); // [1, 2, 3, 4, 0, 0, 0, 0]





    }
}
