package training_mine.day52_Collection_Mine;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice {

    public static void main(String[] args) {

        String str = "ABABABACDEF"; //



        String[] arr = str.split("");

        LinkedHashSet<String> ls = new LinkedHashSet<>(Arrays.asList( arr ));

        System.out.println(ls);

        //System.out.println(Arrays.toString(arr));

        String str2="";

        for (String each: ls){
            str2+=each;
        }

        System.out.println(str2);






    }
}
