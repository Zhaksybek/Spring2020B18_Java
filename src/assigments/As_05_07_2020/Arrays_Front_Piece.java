package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Front_Piece {

    public static void main(String[] args) {
        int[] num ={12,3,6,9,0};

        int[] num2 = new int[2];

        if (num.length>=2){
            num2[0]=num[0];
            num2[1]=num[1];
            System.out.println(Arrays.toString(num2));
        }else {
            System.out.println(Arrays.toString(num));
        }





    }


}
