package training_mine.day33_ArrayList_B12;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        list.set(0,7);
        System.out.println(list);

        String a ="";
        a+=2;
        a+='c';
        a+=false;
        if (a=="2cfalse")
            System.out.println("==");
        if (a.equals("2cfalce"))
            System.out.println("equals");



    }
}
