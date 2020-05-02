package training_mine.Predicate_mine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));


       int count =0;
        for (int i=0;i<list.size(); i++){
            if (list.get(i)==0){
                count++;
            }
        }
        // count==0;

        list.removeAll(Arrays.asList(0));

        for (int j=0; j<count;j++){
            list.add(0);
        }


        System.out.println(list);  // [1, 2, 3, 4, 0, 0, 0, 0]




    }
}
