package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Arrays_MakeLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(list));




    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
          list.removeIf(p-> p <= 0);
          int sum =0;
          for (Integer each: list){
              sum+=each;
          }
          list.add(sum);
        return list;


    }




}
