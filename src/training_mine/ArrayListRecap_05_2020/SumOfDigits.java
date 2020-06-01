package training_mine.ArrayListRecap_05_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {

        String str = "a1b2c3d4";

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (char each : arr){

            if (Character.isDigit(each)){ // isDigit():  identifies if the given character is digit
                sum+= Integer.parseInt(""+each);
            }

        }

        System.out.println(sum);
        Character.isAlphabetic('A');   //  identifies if the character is Al




    }

}
