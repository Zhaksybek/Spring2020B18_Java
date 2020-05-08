package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Combine_to_full_name {
/*
    public static String[] combineNames(String[] first_names, String[] last_names)
    {

    }

 */

    public static void main(String[] args)
    {
        //feel free to test code here
        String[] first_names = {"bob","joe"};
        String[] last_names = {"jones","smith"};

        String[] result = new String[first_names.length+last_names.length-2];

        for (int i=0; i<first_names.length;i++){
            result[i]= first_names[i]+" "+last_names[i];
        }

        System.out.println(Arrays.toString(result));


    }

}
