package assigments.Methods;

import java.util.Arrays;

public class manIntArr {
    public static void main(String[] args) {

    }

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static double findMax(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
