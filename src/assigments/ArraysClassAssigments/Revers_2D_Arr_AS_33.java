package assigments.ArraysClassAssigments;

import java.util.Arrays;

public class Revers_2D_Arr_AS_33 {
    public static void main(String[] args) {
     String[] arr = {"apple", "pear"};
     String[] result = new String[arr.length]; // new Arrays{ str,  str}

        for (int j = 0; j < arr.length; ++j) {
            result[j] = reverseString(arr[j]);
        }
        System.out.println(Arrays.toString(result));

        System.out.println("==============================================");



    }


    public static String[] reverse(String[] arr) {
        String[] result = new String[arr.length]; // new Arrays{ str,  str}

        for (int j = 0; j < arr.length; ++j) {
            arr[j] = reverseString(arr[j]);
        }
        //System.out.println(Arrays.toString(result));
        return arr;
    }

    public static String reverseString(String str){
        String result ="";
        for (int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }

   /* private static String reverseString(String s) {
        char[] orig = s.toCharArray();
        char[] reverse = new char[orig.length];
        for (int i = 0; i < orig.length; i++) {
            reverse[i] = orig[orig.length - i - 1];
        }
        return new String(reverse);
    }*/

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */

}
