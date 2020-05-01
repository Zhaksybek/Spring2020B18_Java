package assigments.ArraysClassAssigments;

import java.util.Arrays;
import java.util.Scanner;

public class assig_101 {
    public static void main(String[] args) {
        String[] arr = {"apple", "pear","car", "jackson","computer", "mouse"};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {

        String[] arr1 = new String[arr.length]; // new Arrays{ str,  str}
        int j = arr.length-1;
        for (int i=0; i<arr.length;i++){
            arr1[i] = arr[j];
            j--;
        }
        //arr = new String[arr1.length];
        arr=arr1;

        return arr;

    }

       }






