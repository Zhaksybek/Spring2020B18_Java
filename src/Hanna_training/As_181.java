package Hanna_training;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class As_181 {
    public static void main(String[] args) {

        String[] r1 = {"f","o","o"};
        String[] r2 = {" b","a","r"};
        String result ="";

        ArrayList<String> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(r1));
        list1.addAll(Arrays.asList(r2));


        for (int i=0; i<list1.size(); i++){
            result +=list1.get(i);
        }

        System.out.println(result);
        System.out.println();
        System.out.println(combineRs(r1,r2));



    }
    public static String combineRs(String[] r1,String[] r2){
        String result ="";

        ArrayList<String> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(r1));
        list1.addAll(Arrays.asList(r2));

        for (int i=0; i<list1.size(); i++){
            result +=list1.get(i);
        }
        return result;

    }

}
