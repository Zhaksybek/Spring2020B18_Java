package training_mine.For_Each_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class for_each {
    public static void main(String[] args) {

        char[] ch={'z','x','y','c','a','b'};
        Arrays.sort(ch);

        for (char eachChar: ch){
            System.out.println(eachChar);
        }



    }
}
