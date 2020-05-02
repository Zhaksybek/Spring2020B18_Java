package day32_PredicateLamdba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class quize {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5));

    list.set(0,list.get(4));
        list.set(4,list.get(0));

        System.out.println(list);

    }
}
