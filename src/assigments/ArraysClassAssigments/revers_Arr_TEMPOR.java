package assigments.ArraysClassAssigments;
import java.util.Arrays;
public class revers_Arr_TEMPOR {

    public static void main(String[] args) {
        String [] strings = {"hey","hello"};
        String[] result = new String[strings.length];
        for (int j = 0; j < strings.length; ++j) {
            result[j] = reverseString(strings[j]);
        }
        System.out.println(Arrays.toString(result));

    }



    private static String[] reverseMany(String[] strings) {
        String[] result = new String[strings.length];
        for (int j = 0; j < strings.length; ++j) {
            result[j] = reverseString(strings[j]);
        }
        return result;
    }

    private static String reverseString(String s) {
        char[] orig = s.toCharArray();
        char[] reverse = new char[orig.length];
        for (int i = 0; i < orig.length; i++) {
            reverse[i] = orig[orig.length - i - 1];
        }
        return new String(reverse);
    }


}
